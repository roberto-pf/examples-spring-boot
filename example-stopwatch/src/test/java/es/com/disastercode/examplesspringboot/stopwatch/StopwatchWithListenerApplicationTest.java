package es.com.disastercode.examplesspringboot.stopwatch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import es.com.disastercode.examplesspringboot.stopwatch.listener.ExecutionTimeTestListener;

@ExtendWith(SpringExtension.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, 
	ExecutionTimeTestListener.class})
class StopwatchWithListenerApplicationTest {

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
