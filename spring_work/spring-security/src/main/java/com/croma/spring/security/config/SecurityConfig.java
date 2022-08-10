package com.croma.spring.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		//auth.inMemoryAuthentication().passwordEncoder(getEncoder()).withUser("yash").password("1234").roles("ADMIN");
		
		PasswordEncoder encoder = getEncoder();
		
		auth.jdbcAuthentication().dataSource(dataSource)
		//.withDefaultSchema()
		.usersByUsernameQuery(
                "select username,password, enabled from users where username=?")
        .authoritiesByUsernameQuery(
                "select username, role from user_roles where username=?")
		.withUser("sachin").password(encoder.encode("1234")).roles("ADMIN")
		.and()
		.withUser("ankit").password(encoder.encode("4321")).roles("MANAGER");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/h2-console/**");
	}

	private PasswordEncoder getEncoder() {
		// return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder();
	}

}
