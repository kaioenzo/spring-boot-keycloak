//package com.example.keycloackspring3.config
//
//import org.springframework.boot.context.properties.ConfigurationProperties
//import org.springframework.context.annotation.Configuration
//import org.springframework.validation.annotation.Validated
//
//@Validated
//@Configuration
//@ConfigurationProperties(prefix = "jwt.auth.converter")
//class JwtAuthConverterProperties {
//     val resourceId: String? = null
//     val principalAttribute: String? = null
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as JwtAuthConverterProperties
//
//        if (resourceId != other.resourceId) return false
//        if (principalAttribute != other.principalAttribute) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = resourceId?.hashCode() ?: 0
//        result = 31 * result + (principalAttribute?.hashCode() ?: 0)
//        return result
//    }
//}