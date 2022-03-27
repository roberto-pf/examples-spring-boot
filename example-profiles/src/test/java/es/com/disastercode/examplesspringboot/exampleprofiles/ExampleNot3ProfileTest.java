package es.com.disastercode.examplesspringboot.exampleprofiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("other")
class ExampleNot3ProfileTest {

	@Autowired
	private String helloWorld;
	
	@Test
	void dummyTest() {
		Assertions.assertEquals(helloWorld, "Hello World other not prof3");
	}

}
