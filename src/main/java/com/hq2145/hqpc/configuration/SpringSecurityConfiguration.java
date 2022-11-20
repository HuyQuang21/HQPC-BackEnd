package com.hq2145.hqpc.configuration;

import com.hq2145.hqpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//
//        http.authorizeHttpRequests()
//                .antMatchers("/api/common/**","/decorators/**","/resource/**","/admin/login").permitAll()
//                .antMatchers("/admin/group/create","/admin/group/edit/**","/admin/user/new","/admin/user/edit/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and().formLogin()
//                .loginProcessingUrl("/j_spring_security_check")
//                .loginPage("/admin/login")
//                .defaultSuccessUrl("/admin/home")
//                .failureUrl("/admin/login?err=fail")
//                .and()
//                .logout().permitAll()
//                .and()
//                .exceptionHandling().accessDeniedPage("/admin/deny");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userService(userService).passwordEncoder(passwordEncoder());
//    }
}
