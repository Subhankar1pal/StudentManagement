package com.example.researchLab;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	/*@Override
    public void configure(HttpSecurity http) throws Exception {
			http.csrf()
	        .and()
	        .authorizeRequests(authz -> authz.mvcMatchers("/student/details/*").access("hasRole('ROLE_USER')")
	            .anyRequest()
	            .authenticated())
	        .oauth2Login()
	        .and()
	        .logout()
	        .logoutSuccessUrl("/");
    }*/
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {

		
		http.csrf(csrf -> csrf.disable())
		.authorizeRequests()
        .antMatchers("/register/student")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/student**")
        .hasRole("USER")
        .and()
        .authorizeRequests()
        .antMatchers("/getAll/StudentDetails")
        .hasRole("ADMIN")
        .anyRequest()
        .authenticated()
        .and()
        .oauth2Login()
        .and()
        .logout()
        .logoutSuccessUrl("/");
		
	}
	
}
