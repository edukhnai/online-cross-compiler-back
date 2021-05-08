package com.katedukhnai.online.cross.compiler.back.services.impl

import com.katedukhnai.online.cross.compiler.back.configuration.properties.ScriptsDirectoryProperties
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse
import com.katedukhnai.online.cross.compiler.back.model.Command
import com.katedukhnai.online.cross.compiler.back.model.SupportedLanguage.Companion.getAdditionalFileExtensionByBashAlias
import com.katedukhnai.online.cross.compiler.back.model.SupportedLanguage.Companion.getMainFileExtensionByBashAlias
import com.katedukhnai.online.cross.compiler.back.services.CompileExecuteService
import com.katedukhnai.online.cross.compiler.back.support.createFile
import mu.KotlinLogging
import org.apache.commons.io.IOUtils
import org.springframework.stereotype.Service

/**
 * @author e.dukhnay
 */
@Service
class CompileExecuteServiceImpl(
    private val scriptsDirectoryProperties: ScriptsDirectoryProperties
) : CompileExecuteService {

    override fun compileExecute(
        command: Command,
        languageBashAlias: String,
        mainScript: String,
        additionalScript: String?
    ): CompileExecuteResponse {
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

        val compileExecuteCommand = "${scriptsDirectoryProperties.path}${command.scriptName} -lg $languageBashAlias " +
            "-f ${mainScriptFile.name} ${additionalScriptFile?.name.takeIf { !it.isNullOrBlank() }}"
        logger.debug { "Created command $compileExecuteCommand" }

        val process = Runtime.getRuntime().exec(compileExecuteCommand)
        process.waitFor()

        return CompileExecuteResponse(
            stdOut = IOUtils.toString(process.inputStream, Charsets.UTF_8),
            stdErr = IOUtils.toString(process.errorStream, Charsets.UTF_8)
        ).also {
            logger.debug { "Compilation result: stdOut = ${it.stdOut}, stdErr = ${it.stdErr}" }
            mainScriptFile.delete()
            additionalScriptFile?.delete()
        }
    }

    companion object {
        private const val MAIN_SCRIPT_FILENAME = "main_script"
        private const val ADDITIONAL_SCRIPT_FILENAME = "additional_script"
        private val logger = KotlinLogging.logger { }
    }
}
