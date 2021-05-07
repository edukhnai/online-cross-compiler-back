package com.katedukhnai.online.cross.compiler.back.services.dto

/**
 * @author e.dukhnay
 */
data class CompileResult(
    val stdOut: String,
    val stdErr: String? = null
)
