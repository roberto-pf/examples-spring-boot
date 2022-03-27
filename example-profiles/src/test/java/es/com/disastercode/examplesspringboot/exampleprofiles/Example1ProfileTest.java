package es.com.disastercode.examplesspringboot.exampleprofiles;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Example1ProfileTest {

	@Value("${custom.hello.world}")
	private String customHelloWorld;
	
	@Value("${spring.profiles.active}")
	private String profileActive;
	
	 @BeforeEach
	 public void beforeMethod() {
		 assumeTrue( profileActive.equals("prof1"));
	 }
	
	@Test
	void dummyTest() {
		Assertions.assertEquals(customHelloWorld, "Hello World prof1");
	}

}
