package com.katedukhnai.online.cross.compiler.back.services

import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse

/**
 * @author e.dukhnay
 */
interface OnlineCrossCompilerBackService {

    fun compile(compileRequest: CompileExecuteRequest): CompileExecuteResponse

    fun compileExecute(compileExecuteRequest: CompileExecuteRequest): CompileExecuteResponse
}
