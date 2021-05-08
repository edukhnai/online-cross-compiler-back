package com.katedukhnai.online.cross.compiler.back.api.impl

import com.katedukhnai.online.cross.compiler.back.api.OnlineCrossCompilerBackApi
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteRequest
import com.katedukhnai.online.cross.compiler.back.dto.CompileExecuteResponse
import com.katedukhnai.online.cross.compiler.back.services.OnlineCrossCompilerBackService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * @author e.dukhnay
 */
@RestController
class OnlineCrossCompilerBackRestController(
    private val onlineCrossCompilerBackService: OnlineCrossCompilerBackService
): OnlineCrossCompilerBackApi {

    @PostMapping("/compile")
    override fun compile(@RequestBody compileRequest: CompileExecuteRequest): CompileExecuteResponse {
        return onlineCrossCompilerBackService.compile(compileRequest)
    }

    @PostMapping("/compile-execute")
    override fun compileExecute(@RequestBody compileExecuteRequest: CompileExecuteRequest): CompileExecuteResponse {
        return onlineCrossCompilerBackService.compileExecute(compileExecuteRequest)
    }
}
