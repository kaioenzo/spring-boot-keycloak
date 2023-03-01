//package com.example.keycloackspring3.config
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.http.HttpMethod
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
//import org.springframework.security.config.http.SessionCreationPolicy
//import org.springframework.security.web.SecurityFilterChain
//
//
//@Configuration
//@EnableWebSecurity
//class WebSecurityConfig {
//    private val jwtAuthConverter: JwtAuthConverter? = null
//    @Bean
//    @Throws(Exception::class)
//    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
//        http.authorizeHttpRequests()
//            .requestMatchers(HttpMethod.GET, "/test/anonymous", "/test/anonymous/**").permitAll()
//            .requestMatchers(HttpMethod.GET, "/test/admin", "/test/admin/**").hasRole(ADMIN)
//            .requestMatchers(HttpMethod.GET, "/test/user").hasAnyRole(ADMIN, USER)
//            .anyRequest().authenticated()
//        http.oauth2ResourceServer()
//            .jwt()
//            .jwtAuthenticationConverter(jwtAuthConverter)
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//        return http.build()
//    }
//
//    companion object {
//        const val ADMIN = "admin"
//        const val USER = "user"
//    }
//}