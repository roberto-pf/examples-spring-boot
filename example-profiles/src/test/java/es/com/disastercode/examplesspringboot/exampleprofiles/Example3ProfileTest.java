package es.com.disastercode.examplesspringboot.exampleprofiles;

import javax.annotation.Resource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("prof3")
class Example3ProfileTest {

	@Resource(name = "helloWorld")
	private String helloWorld;
	
	@Test
	void dummyTest() {
		Assertions.assertEquals(helloWorld, "Hello World prof3");
	}

}
