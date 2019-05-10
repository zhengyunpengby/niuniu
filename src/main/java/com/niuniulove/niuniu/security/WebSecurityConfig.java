package com.niuniulove.niuniu.security;

import com.niuniulove.niuniu.service.impl.MyUserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @program: niuniu
 * @description: secrity配置适配器
 * @author:
 * @create: 2019-05-10 14:47
 **/
@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.info("配置权限过滤");
        http.csrf().disable()
                .authorizeRequests()
                .mvcMatchers("/login.html","/assets/**")
                .permitAll()
                .and()
                .authorizeRequests()
                .mvcMatchers("/**")
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login.html")
                .successForwardUrl("/index.html")
                .usernameParameter("userName").passwordParameter("password")
                ;
        http.userDetailsService(userDetailsService);
    }
}
