package com.deepskilling;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;
public class PerformanceTesterTest {
    @Test
    public void testPerformanceTimeout() {
        PerformanceTester tester = new PerformanceTester();
        assertTimeout(Duration.ofMillis(200), () -> {
            tester.performTask();
        });
    }
    public static void main(String[] args) {
        TestRunner.runTests(PerformanceTesterTest.class);
    }
}
