package seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

@Configuration
@EnableWebSecurity
public class ConfirmacionSeguridad {
	@Bean
	public AuthenticationManager
	authenticationManager(HttpSecurity http) {
		AuthenticationManagerBuilder authBuilder=
				http.getSharedObject(AuthenticationManagerBuilder.class);
		authBuilder
		.inMemoryAuthentication()

	.passwordEncoder(PasswordEncoderFactories
			.createDelegatingPasswordEncoder())
	.withUser("admin")
	.password("{noop}admi")
	.roles("ADMIN")
	}
	
}
