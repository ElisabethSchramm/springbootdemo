package dev.es.springbootdemo.springbootdemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    // create user without DB, RAM
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){

    // create user john, noop: plaintext
    UserDetails john = User.builder().
            username("john").
            password("{noop}test123").
            roles("EMPLOYEE").
            build();

    UserDetails mary = User.builder().
            username("mary").
            password("{noop}test123").
            roles("EMPLOYEE", "MANAGER").
            build();

    UserDetails susan = User.builder().
            username("susan").
            password("{noop}test123").
            roles("EMPLOYEE", "MANAGER", "ADMIN").
            build();

    return new InMemoryUserDetailsManager(john, mary, susan);
    }
}
