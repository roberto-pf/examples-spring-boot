package es.com.disastercode.examplesspringboot.stopwatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.com.disastercode.examplesspringboot.stopwatch.service.ProductService;

@SpringBootTest
class StopwatchWithAopApplicationTests {

	@Autowired
	private ProductService productService;

	@Test
	void test_one() throws InterruptedException {
		assertEquals("name 2", this.productService.findNameProductById(2));
	}

}
