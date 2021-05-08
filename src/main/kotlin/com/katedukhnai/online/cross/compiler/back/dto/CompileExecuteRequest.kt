package com.katedukhnai.online.cross.compiler.back.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author e.dukhnay
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class CompileExecuteRequest(
    @JsonProperty("programming_language_bash_alias")
    val programmingLanguageBashAlias: String,
    @JsonProperty("main_script")
    val mainScript: String,
    @JsonProperty("additional_script")
    val additionalScript: String? = null
)
