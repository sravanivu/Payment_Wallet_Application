package com.capgemini.paymentwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PaymentWalletApplication1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(PaymentWalletApplication1Application.class, args);
		
		System.out.println("connected succesfully");
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins("*").allowedMethods("GET","POST","OPTIONS","PUT","DELETE");
			}
		};
	}


}
