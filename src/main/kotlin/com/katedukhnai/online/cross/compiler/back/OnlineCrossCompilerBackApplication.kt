package com.katedukhnai.online.cross.compiler.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.CorsRegistry

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@SpringBootApplication
class OnlineCrossCompilerBackApplication {

    @Bean
    fun corsConfigurer(): WebMvcConfigurer? {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry.addMapping("/compile").allowedOrigins("https://diploma-bucket.website.yandexcloud.net")
                registry.addMapping("/compile-execute").allowedOrigins("https://diploma-bucket.website.yandexcloud.net")
            }
        }
    }
}

fun main(args: Array<String>) {
    runApplication<OnlineCrossCompilerBackApplication>(*args)
}
