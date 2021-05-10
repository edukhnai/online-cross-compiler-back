package com.katedukhnai.online.cross.compiler.back.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author e.dukhnay
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class CompileExecuteResponse(
    @JsonProperty("stdout")
    val stdOut: String,
    @JsonProperty("stderr")
    val stdErr: String? = null
)
