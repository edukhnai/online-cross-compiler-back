package com.katedukhnai.online.cross.compiler.back.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author e.dukhnay
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class CompileExecuteResponse(
    @JsonProperty("std_out")
    val stdOut: String,
    @JsonProperty("std_err")
    val stdErr: String? = null
)
