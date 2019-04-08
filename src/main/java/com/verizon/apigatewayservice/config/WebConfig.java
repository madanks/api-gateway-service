package com.verizon.apigatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author madan Date Apr 7, 2019
 *
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/resources/**")
                    .addResourceLocations("/resources/");
    }
	
	
//	@Bean
//	public CorsConfigurationSource corsConfigurationSource() {
//	    final CorsConfiguration configuration = new CorsConfiguration();
//	    configuration.setAllowedOrigins(asList("*"));
//	    configuration.setAllowedMethods(asList("HEAD",
//	            "GET", "POST", "PUT", "DELETE", "PATCH"));
//	    // setAllowCredentials(true) is important, otherwise:
//	    // The value of the 'Access-Control-Allow-Origin' header in the response must not be the wildcard '*' when the request's credentials mode is 'include'.
//	    configuration.setAllowCredentials(true);
//	    // setAllowedHeaders is important! Without it, OPTIONS preflight request
//	    // will fail with 403 Invalid CORS request
//	    configuration.setAllowedHeaders(asList("Authorization", "Cache-Control", "Content-Type"));
//	    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    source.registerCorsConfiguration("/**", configuration);
//	    return source;
//	}

}
