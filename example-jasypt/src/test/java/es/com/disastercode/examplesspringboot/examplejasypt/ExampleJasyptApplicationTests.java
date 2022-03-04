package es.com.disastercode.examplesspringboot.examplejasypt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootTest
@EnableEncryptableProperties
class ExampleJasyptApplicationTests {

	@Autowired
	Environment environment;
	
	@Test
	void encryption_test() {
	    assertEquals(
	      "theValueYouWantToEncrypt", 
	      environment.getProperty("prop.encrypt"));
	}

}
