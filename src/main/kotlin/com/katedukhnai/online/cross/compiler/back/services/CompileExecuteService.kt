package com.katedukhnai.online.cross.compiler.back.services

import com.katedukhnai.online.cross.compiler.back.services.dto.CompileExecuteResult

/**
 * @author e.dukhnay
 */
interface CompileExecuteService {

    fun compileExecuteScript(
        languageBashAlias: String,
        mainScript: String,
        additionalScript: String? = null
    ): CompileExecuteResult
}
