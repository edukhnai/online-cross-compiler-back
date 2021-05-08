package com.katedukhnai.online.cross.compiler.back.configuration.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotBlank

/**
 * @author e.dukhnay
 */
@Component
@ConfigurationProperties("scripts-dir")
@Validated
class ScriptsDirectoryProperties {

    @NotBlank
    lateinit var path: String
}
