package com.katedukhnai.online.cross.compiler.back.services.impl

import com.katedukhnai.online.cross.compiler.back.model.SupportedLanguage
import com.katedukhnai.online.cross.compiler.back.services.CompileExecuteService
import com.katedukhnai.online.cross.compiler.back.services.dto.CompileExecuteResult
import org.springframework.stereotype.Service

/**
 * @author e.dukhnay
 */
@Service
class CompileExecuteServiceImpl: CompileExecuteService {

    override fun compileExecuteScript(
        languageBashAlias: String,
        mainScript: String,
        additionalScript: String?
    ): CompileExecuteResult {
        TODO("Not yet implemented")
    }
}
