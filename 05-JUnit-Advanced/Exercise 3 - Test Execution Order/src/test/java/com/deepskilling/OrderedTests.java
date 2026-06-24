package com.deepskilling;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {
    @Test
    @Order(1)
    public void testFirst() {
        System.out.println("    Executing first test (Order = 1)");
        assertTrue(true);
    }
    @Test
    @Order(2)
    public void testSecond() {
        System.out.println("    Executing second test (Order = 2)");
        assertTrue(true);
    }
    @Test
    @Order(3)
    public void testThird() {
        System.out.println("    Executing third test (Order = 3)");
        assertTrue(true);
    }
    public static void main(String[] args) {
        TestRunner.runTests(OrderedTests.class);
    }
}
