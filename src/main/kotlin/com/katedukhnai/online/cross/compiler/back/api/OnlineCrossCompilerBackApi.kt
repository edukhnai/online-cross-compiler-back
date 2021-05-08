package com.katedukhnai.online.cross.compiler.back.api

import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse

/**
 * @author e.dukhnay
 */
interface OnlineCrossCompilerBackApi {

    fun compile(compileRequest: CompileExecuteRequest): CompileExecuteResponse

    fun compileExecute(compileExecuteRequest: CompileExecuteRequest): CompileExecuteResponse
}
