package es.com.disastercode.examplesspringboot.exampleprofiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("prof2")
class Example2ProfileTest {

	@Value("${custom.hello.world}")
	private String customHelloWorld;
	
	@Test
	void dummyTest() {
		Assertions.assertEquals(customHelloWorld, "Hello World prof2");
	}

}
