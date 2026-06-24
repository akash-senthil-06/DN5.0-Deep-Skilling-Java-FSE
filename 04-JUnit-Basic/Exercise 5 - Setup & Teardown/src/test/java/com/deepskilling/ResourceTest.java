package com.deepskilling;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class ResourceTest {
    @BeforeEach
    public void setUp() {
        System.out.println("  [SETUP] Initializing test resources...");
    }
    @AfterEach
    public void tearDown() {
        System.out.println("  [TEARDOWN] Cleaning up test resources...");
    }
    @Test
    public void testCase1() {
        System.out.println("    Executing Test Case 1");
        assertTrue(true);
    }
    @Test
    public void testCase2() {
        System.out.println("    Executing Test Case 2");
        assertTrue(true);
    }
    public static void main(String[] args) {
        TestRunner.runTests(ResourceTest.class);
    }
}
