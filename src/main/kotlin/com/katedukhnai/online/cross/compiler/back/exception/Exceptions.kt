package com.katedukhnai.online.cross.compiler.back.exception

/**
 * @author e.dukhnay
 */
class MainFileExtensionNotFoundException(
    bashAlias: String
): Exception("Main file extension for bashAlias = $bashAlias not found")

class AdditionalFileExtensionNotFoundException(
    bashAlias: String
): Exception("Additional file extension for bashAlias = $bashAlias not found")
