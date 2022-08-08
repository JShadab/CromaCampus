package com.croma.SpringBootWithJPA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket demoAPI() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).groupName("Demo-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.croma.RestWebServicesWithJPA.controller")).build();
	}

	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder().description("This is for learning purpose").title("MyAPIs").version("2022.6.1")
				.license("Stricltly Resitricted").licenseUrl("http://www.mummy.com")
				.contact(new Contact("Your Big Brother", "http://www.brother.com", "brother@gmail.com"))
				.termsOfServiceUrl("http://www.papa.com").build();
	}

}
