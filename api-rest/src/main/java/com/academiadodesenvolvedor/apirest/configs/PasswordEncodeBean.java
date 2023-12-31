package com.academiadodesenvolvedor.apirest.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration

public class PasswordEncodeBean {

    @Bean
    public PasswordEncoder passwordEncode() {
        return new BCryptPasswordEncoder(16);
    }
}
