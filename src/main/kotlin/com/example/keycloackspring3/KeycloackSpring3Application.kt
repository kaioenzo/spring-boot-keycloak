package com.example.keycloackspring3

import com.example.keycloackspring3.security.JwtAuthConverterProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableConfigurationProperties(JwtAuthConverterProperties::class)
class KeycloackSpring3Application

fun main(args: Array<String>) {
	runApplication<KeycloackSpring3Application>(*args)
}
