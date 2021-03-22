package com.example.demo.sec.config;

import com.example.demo.sec.domain.JwtTokenProvider;
import com.example.demo.sec.filter.CustomAuthenticationEntryPoint;
import com.example.demo.sec.filter.JwtAuthenticationFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http 는 soap방식. 이것을 디스에이블드 하겠다. 즉 RESTful방식을 하겠다.
        http.httpBasic().disable()
                // csrf 사용 안 함 == REST API 사용하기 때문에
                .csrf().disable()
                // JWT인증사용하므로 세션 사용
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
                .antMatchers("/*/login", "/*/signUp").permitAll().anyRequest().hasRole("USER").and().exceptionHandling()
                .authenticationEntryPoint(new CustomAuthenticationEntryPoint()).and().addFilterBefore(
                        new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class);

    }
}
