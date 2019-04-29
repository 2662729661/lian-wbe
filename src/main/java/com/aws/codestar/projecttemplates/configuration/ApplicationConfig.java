package com.aws.codestar.projecttemplates.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.aws.codestar.projecttemplates.controller.FileUploadController;
import com.aws.codestar.projecttemplates.controller.HelloWorldController;
import com.aws.codestar.projecttemplates.controller.SessionController;

/**
 * Spring configuration for sample application.
 */
@Configuration
@ComponentScan({ "com.aws.codestar.projecttemplates.configuration" })
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

	@Bean
	public HelloWorldController helloWorld() {
		return new HelloWorldController();
	}

	@Bean
	public SessionController SessionController() {
		return new SessionController();
	}
	
	@Bean
	public FileUploadController fileUploadController() {
		return new FileUploadController();
	}
	

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
