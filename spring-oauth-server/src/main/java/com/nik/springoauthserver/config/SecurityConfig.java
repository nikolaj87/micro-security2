package com.nik.springoauthserver.config;

import com.nik.springoauthserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserService userService;

    private final PasswordEncoder passwordEncoder = NoOpPasswordEncoder.getInstance();

//    @Bean
//    @Primary
//    UserDetailsService inMemoryUsers() {
//        User.UserBuilder userBuilder = User.builder();
//        UserDetails nik = userBuilder.username("niki")
//                .password("{noop}niki")
//                .roles("USER", "ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(nik);
//    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userService);
        provider.setPasswordEncoder(passwordEncoder);
        return provider;
    }
}
