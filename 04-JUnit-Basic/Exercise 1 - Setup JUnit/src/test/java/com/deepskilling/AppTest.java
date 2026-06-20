package com.deepskilling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AppTest {
    @Test
    public void testSetup() {
        System.out.println("JUnit 5 setup is working correctly!");
        assertTrue(true);
    }
    public static void main(String[] args) {
        TestRunner.runTests(AppTest.class);
    }
}
