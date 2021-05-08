package com.katedukhnai.online.cross.compiler.back.dto

/**
 * @author e.dukhnay
 */
data class CompileResponse(
    val stdOut: String,
    val stdErr: String? = null
)
