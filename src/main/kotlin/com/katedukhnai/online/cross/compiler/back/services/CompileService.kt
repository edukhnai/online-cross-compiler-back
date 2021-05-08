package com.katedukhnai.online.cross.compiler.back.services

import com.katedukhnai.online.cross.compiler.back.dto.CompileResponse

/**
 * @author e.dukhnay
 */
interface CompileService {

    fun compileScript(languageBashAlias: String, mainScript: String, additionalScript: String? = null): CompileResponse
}
