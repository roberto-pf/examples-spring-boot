package es.com.disastercode.examplesspringboot.exampleprofiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Example4ProfileTest {

	@Value("${custom.hello.world.4a}")
	private String customHelloWorld4a;
	
	@Value("${custom.hello.world.4b}")
	private String customHelloWorld4b;
	
	@Test
	void dummyTest() {
		Assertions.assertEquals(customHelloWorld4a, "Hello World prof4a");
		Assertions.assertEquals(customHelloWorld4b, "Hello World prof4b");
	}

}
