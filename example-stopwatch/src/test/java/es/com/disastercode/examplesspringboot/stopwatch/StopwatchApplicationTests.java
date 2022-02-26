package es.com.disastercode.examplesspringboot.stopwatch;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

@SpringBootTest
class StopwatchApplicationTests {

	static StopWatch stopWatch = new StopWatch();
	
	@BeforeAll
	static void setUp() {
		stopWatch =  new StopWatch();
	}
	
	@BeforeEach
	void timeSetUp(TestInfo testInfo) {
		stopWatch.start( testInfo.getTestMethod().get().getName());
	}
	
	@AfterAll
	static void setDown() {
		System.out.print( stopWatch.prettyPrint() );
	}
	
	@AfterEach
	void timeSetDown() {
		stopWatch.stop();
	}

	@Test
	void test_one() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test
	void test_two() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test
	void test_three() throws InterruptedException {
		Thread.sleep(2000);
	}

}
