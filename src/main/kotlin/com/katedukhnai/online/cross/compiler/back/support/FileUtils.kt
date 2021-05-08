package com.katedukhnai.online.cross.compiler.back.support

import java.io.File
import java.nio.charset.Charset

/**
 * @author e.dukhnay
 */
fun createFile(fileName: String, fileExt: String, content: String, charset: Charset = Charsets.UTF_8): File {
    return File("$fileName$fileExt").also {
        it.writeText(content, charset)
    }
}
