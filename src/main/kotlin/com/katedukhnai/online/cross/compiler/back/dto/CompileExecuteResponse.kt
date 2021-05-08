package com.katedukhnai.online.cross.compiler.back.dto

/**
 * @author e.dukhnay
 */
data class CompileExecuteResponse(
    val stdOut: String,
    val stdErr: String? = null
)
