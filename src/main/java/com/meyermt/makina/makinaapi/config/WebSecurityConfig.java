package com.meyermt.makina.makinaapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    //for now allow anyone
    http
        .authorizeRequests()
        .anyRequest().permitAll()
        .and()
        // TODO: should remove csrf disabling
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/makinate").permitAll();
  }

}
