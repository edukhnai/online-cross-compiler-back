package com.katedukhnai.online.cross.compiler.back.api

import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse
import com.katedukhnai.online.cross.compiler.back.dto.CompileRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileResponse

/**
 * @author e.dukhnay
 */
interface OnlineCrossCompilerBackApi {

    fun compile(compileRequest: CompileRequest): CompileResponse

    fun compileExecute(compileExecuteRequest: CompileExecuteRequest): CompileExecuteResponse
}
