package com.katedukhnai.online.cross.compiler.back.model

/**
 * @author e.dukhnay
 */
enum class Command(val scriptName: String) {
    COMPILE("compile.sh"), COMPILE_EXECUTE("compile_and_execute.sh")
}
