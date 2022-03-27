package es.com.disastercode.examplesspringboot.exampleprofiles.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!prof3")
@Configuration
public class NotProf3Configuration {
	
	@Bean
	public String helloWorld() {
		return "Hello World other not prof3";
	}
}
