package com.marketplace.marketplace.config;


import com.marketplace.marketplace.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserInfoService userInfoService;


    @Autowired
    public SecurityConfig(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }


    protected void configure(HttpSecurity http) throws Exception{
        http.csrf()
                .disable().authorizeRequests()
                .anyRequest().authenticated().and().formLogin().loginProcessingUrl("/person_login");



    }

    protected void configure(AuthenticationManagerBuilder auth){
        try {
            auth.userDetailsService(userInfoService);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
