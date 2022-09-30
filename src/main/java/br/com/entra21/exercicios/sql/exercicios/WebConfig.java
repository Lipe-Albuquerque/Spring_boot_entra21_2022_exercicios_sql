package br.com.entra21.exercicios.sql.exercicios;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
	@Override

	public void addCorsMappings(CorsRegistry registry) {

	registry.addMapping("/**")

	.allowedOrigins("*") 

	        .allowedMethods("GET","POST","PUT", "DELETE");


	}
}
