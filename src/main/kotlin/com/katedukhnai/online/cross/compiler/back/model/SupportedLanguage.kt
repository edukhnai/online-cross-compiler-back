package com.katedukhnai.online.cross.compiler.back.model

import com.katedukhnai.online.cross.compiler.back.exception.AdditionalFileExtensionNotFoundException
import com.katedukhnai.online.cross.compiler.back.exception.MainFileExtensionNotFoundException

/**
 * @author e.dukhnay
 */
enum class SupportedLanguage(
    val bashAlias: String,
    val description: String,
    val mainFileExtension: String,
    val additionalFileExtension: String? = null
) {
    C("c", "C", ".c"),
    CPP("cpp", "C++ 11", ".cpp"),
    C_OPENCL("copencl", "OpenCl 1.2 Standard C API", ".c", ".cl"),
    CPP_OPENCL("cppopencl", "OpenCL 1.2 C++ API Bindings", ".cpp", ".cl"),
    OPENCL_PTX_1050TI("openclptx1050ti", "OpenCl Kernel compilation into NVidia PTX for GeForce GTX 1050 Ti GPU (beta)",
        ".cl"),
    OPENCL_PTX_K80("openclptxk80", "OpenCl Kernel compilation into NVidia PTX for Tesla K80 HPC board (beta)", ".cl"),
    OPENCL_AMD_5700("openclamd5700", "OpenCl Kernel compilation into AMD Binary for Radeon RX 5700 GPU (beta)", ".cl");

    companion object {
        fun getMainFileExtensionByBashAlias(bashAlias: String): String {
            return values().firstOrNull { it.bashAlias == bashAlias }?.mainFileExtension
                ?: throw MainFileExtensionNotFoundException(bashAlias)
        }

        fun getAdditionalFileExtensionByBashAlias(bashAlias: String): String {
            return values().firstOrNull { it.bashAlias == bashAlias }?.additionalFileExtension
                ?: throw AdditionalFileExtensionNotFoundException(bashAlias)
        }
    }
}
