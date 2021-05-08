package com.katedukhnai.online.cross.compiler.back.services.impl

import com.katedukhnai.online.cross.compiler.back.dto.CompileResponse
import com.katedukhnai.online.cross.compiler.back.model.SupportedLanguage.Companion.getAdditionalFileExtensionByBashAlias
import com.katedukhnai.online.cross.compiler.back.model.SupportedLanguage.Companion.getMainFileExtensionByBashAlias
import com.katedukhnai.online.cross.compiler.back.services.CompileService
import com.katedukhnai.online.cross.compiler.back.support.createFile
import mu.KotlinLogging
import org.apache.commons.io.IOUtils
import org.springframework.stereotype.Service

/**
 * @author e.dukhnay
 */
@Service
class CompileServiceImpl : CompileService {

    override fun compileScript(
        languageBashAlias: String,
        mainScript: String,
        additionalScript: String?
    ): CompileResponse {
        val mainScriptFile = createFile(
            MAIN_SCRIPT_FILENAME,
            getMainFileExtensionByBashAlias(languageBashAlias),
            mainScript
        )
        val additionalScriptFile = additionalScript?.let {
            createFile(
                ADDITIONAL_SCRIPT_FILENAME,
                getAdditionalFileExtensionByBashAlias(languageBashAlias),
                additionalScript
            )
        }

        val process = Runtime.getRuntime().exec(
            "~/compiled_code/compile.sh -lg $languageBashAlias " +
                "-f ${mainScriptFile.name} ${additionalScriptFile?.name.takeIf { !it.isNullOrBlank() }}"
        )
        process.waitFor()

        return CompileResponse(
            stdOut = IOUtils.toString(process.inputStream, Charsets.UTF_8),
            stdErr = IOUtils.toString(process.errorStream, Charsets.UTF_8)
        ).also {
            logger.info { "Compilation result: stdOut = ${it.stdOut}, stdErr = ${it.stdErr}" }
        }
    }

    companion object {
        private val logger = KotlinLogging.logger { }
        private const val MAIN_SCRIPT_FILENAME = "main_script"
        private const val ADDITIONAL_SCRIPT_FILENAME = "additional_script"
    }
}
