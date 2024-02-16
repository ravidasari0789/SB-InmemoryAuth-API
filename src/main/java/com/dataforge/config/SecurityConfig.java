package com.dataforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		// @formatter:off
		http.authorizeHttpRequests(httprequest->httprequest.requestMatchers("/home","/contact")
				.permitAll().anyRequest().authenticated()
				).httpBasic(withDefaults()).formLogin(withDefaults());
		return http.build();
	}
	@Bean
	public InMemoryUserDetailsManager userdetails() {
		UserDetails admin=User.withDefaultPasswordEncoder().
				username("ravi").
				password("4htST2CPE9r9FPo").
				authorities("Admin").
				build();
		UserDetails user=User.withDefaultPasswordEncoder().
				username("baba").
				password("lVneHY1kLhgjxH1tgVVfYFk").
				authorities("User").
				build();
		return new InMemoryUserDetailsManager(admin,user); 
	}

}
