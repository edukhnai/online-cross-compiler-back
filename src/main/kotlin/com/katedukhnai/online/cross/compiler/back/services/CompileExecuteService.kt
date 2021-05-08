package com.katedukhnai.online.cross.compiler.back.services

import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse
import com.katedukhnai.online.cross.compiler.back.model.Command

/**
 * @author e.dukhnay
 */
interface CompileExecuteService {

    fun compileExecute(
        command: Command,
        languageBashAlias: String,
        mainScript: String,
        additionalScript: String? = null
    ): CompileExecuteResponse
}
