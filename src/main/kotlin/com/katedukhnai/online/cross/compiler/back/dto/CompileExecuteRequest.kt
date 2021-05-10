package com.katedukhnai.online.cross.compiler.back.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author e.dukhnay
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class CompileExecuteRequest(
    @JsonProperty("language")
    val programmingLanguageBashAlias: String,
    @JsonProperty("script")
    val mainScript: String,
    @JsonProperty("kernel")
    val additionalScript: String? = null
)
