package es.com.disastercode.examplesspringboot.exampleprofiles;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.event.annotation.BeforeTestClass;

@SpringBootTest
class Example5ProfileTest {

	@Value("${custom.hello.world}")
	private String customHelloWorld;

	@Value("${spring.profiles.active}")
	private String profileActive;

	@BeforeEach
	public void beforeMethod() {
		assumeTrue(profileActive.equals("prof5"));
	}

	@Test
	void dummyTest() {
		Assertions.assertEquals(customHelloWorld, "Hello World prof5");
	}

}