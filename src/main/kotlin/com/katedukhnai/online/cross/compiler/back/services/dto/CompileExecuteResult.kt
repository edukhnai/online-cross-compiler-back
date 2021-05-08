package com.katedukhnai.online.cross.compiler.back.services.dto

/**
 * @author e.dukhnay
 */
data class CompileExecuteResult(
    val stdOut: String,
    val stdErr: String? = null
)
