package com.katedukhnai.online.cross.compiler.back.services.impl

import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse
import com.katedukhnai.online.cross.compiler.back.model.Command
import com.katedukhnai.online.cross.compiler.back.services.CompileExecuteService
import com.katedukhnai.online.cross.compiler.back.services.OnlineCrossCompilerBackService
import org.springframework.stereotype.Service

/**
 * @author e.dukhnay
 */
@Service
class OnlineCrossCompilerBackServiceImpl(
    private val compileExecuteService: CompileExecuteService
): OnlineCrossCompilerBackService {

    override fun compile(compileRequest: CompileExecuteRequest): CompileExecuteResponse {
        return with (compileRequest) {
            compileExecuteService.compileExecute(Command.COMPILE, programmingLanguageBashAlias, mainScript, additionalScript)
        }
    }

    override fun compileExecute(compileExecuteRequest: CompileExecuteRequest): CompileExecuteResponse {
        return with (compileExecuteRequest) {
            compileExecuteService.compileExecute(Command.COMPILE_EXECUTE, programmingLanguageBashAlias, mainScript, additionalScript)
        }
    }
}
