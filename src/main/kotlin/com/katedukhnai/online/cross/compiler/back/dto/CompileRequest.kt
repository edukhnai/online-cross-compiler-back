package com.katedukhnai.online.cross.compiler.back.dto

/**
 * @author e.dukhnay
 */
data class CompileRequest(
    val programmingLanguageBashAlias: String,
    val mainScript: String,
    val additionalScript: String? = null
)
