package es.com.disastercode.examplesspringboot.stopwatch.listener;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;
import org.springframework.util.StopWatch;

public class ExecutionTimeTestListener extends AbstractTestExecutionListener {

    private StopWatch stopWatch;

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        super.beforeTestClass(testContext);
        stopWatch = new StopWatch(testContext.getTestClass().getSimpleName());
    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        super.beforeTestMethod(testContext);
        stopWatch.start(testContext.getTestMethod().getName());
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        if (stopWatch.isRunning()) {
            stopWatch.stop();
        }
        super.afterTestMethod(testContext);
    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {
        System.out.println(stopWatch.prettyPrint());
        super.afterTestClass(testContext);
    }
}
