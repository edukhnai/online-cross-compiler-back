package com.katedukhnai.online.cross.compiler.back.services

import com.katedukhnai.online.cross.compiler.back.services.dto.CompileResult

/**
 * @author e.dukhnay
 */
interface CompileService {

    fun compileScript(): CompileResult
}
