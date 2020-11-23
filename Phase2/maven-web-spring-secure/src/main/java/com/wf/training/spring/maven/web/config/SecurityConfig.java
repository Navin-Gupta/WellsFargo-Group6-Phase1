package com.wf.training.spring.maven.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

// WebSecurityConfigurerAdapter : class provides methods to add config

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	// 3 configuration method
	
	// define the credentials
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// in memory auth : fixed hard coded credential
		// database 
		// ldap based 
		
		//  create user (in-memory auth)
		UserBuilder builder = User.withDefaultPasswordEncoder(); 
		auth.inMemoryAuthentication()
			.withUser(builder.username("First").password("abc").roles("STUDENT"))
			.withUser(builder.username("Second").password("abc").roles("EMLPLOYEE"));
		
	}
	
	// define the rules to access
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() // start defining auth rule
			.anyRequest()
			.authenticated()
		.and()
			// .httpBasic();
			.formLogin();
	}
}
