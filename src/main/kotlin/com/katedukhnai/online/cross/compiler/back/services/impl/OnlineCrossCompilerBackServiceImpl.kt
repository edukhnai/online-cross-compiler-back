package com.katedukhnai.online.cross.compiler.back.services.impl

import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse
import com.katedukhnai.online.cross.compiler.back.dto.CompileRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileResponse
import com.katedukhnai.online.cross.compiler.back.services.CompileService
import com.katedukhnai.online.cross.compiler.back.services.ExecuteService
import com.katedukhnai.online.cross.compiler.back.services.OnlineCrossCompilerBackService
import org.springframework.stereotype.Service

/**
 * @author e.dukhnay
 */
@Service
class OnlineCrossCompilerBackServiceImpl(
    private val compileService: CompileService,
    private val executeService: ExecuteService
): OnlineCrossCompilerBackService {

    override fun compile(compileRequest: CompileRequest): CompileResponse {
        compileService.compileScript()
        return CompileResponse("ha")
    }

    override fun compileExecute(compileExecuteRequest: CompileExecuteRequest): CompileExecuteResponse {
        TODO("Not yet implemented")
    }
}
