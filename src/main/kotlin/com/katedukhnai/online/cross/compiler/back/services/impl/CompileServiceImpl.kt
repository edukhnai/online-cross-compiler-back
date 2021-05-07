package com.katedukhnai.online.cross.compiler.back.services.impl

import com.katedukhnai.online.cross.compiler.back.services.CompileService
import com.katedukhnai.online.cross.compiler.back.services.dto.CompileResult
import mu.KotlinLogging
import org.apache.commons.io.IOUtils
import org.springframework.stereotype.Service

/**
 * @author e.dukhnay
 */
@Service
class CompileServiceImpl : CompileService {

    override fun compileScript(): CompileResult {
        val process = Runtime.getRuntime().exec("cd")
        process.waitFor()
        return CompileResult(
            stdOut = IOUtils.toString(process.inputStream, Charsets.UTF_8),
            stdErr = IOUtils.toString(process.errorStream, Charsets.UTF_8)
        ).also {
            logger.info { "LALALA $it" }
        }
    }

    companion object {
        private val logger = KotlinLogging.logger { }
    }
}
