package com.deepskilling;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
public class TestRunner {
    public static void runTests(Class<?> testClass) {
        System.out.println("Running Mockito tests for: " + testClass.getName());
        int passed = 0;
        int failed = 0;
        try {
            Object testInstance = testClass.getDeclaredConstructor().newInstance();
            List<Method> testMethods = new ArrayList<>();
            for (Method m : testClass.getDeclaredMethods()) {
                if (m.isAnnotationPresent(Test.class)) {
                    testMethods.add(m);
                }
            }
            testMethods.sort(new Comparator<Method>() {
                @Override
                public int compare(Method m1, Method m2) {
                    int order1 = m1.isAnnotationPresent(Order.class) ? m1.getAnnotation(Order.class).value() : java.lang.Integer.MAX_VALUE;
                    int order2 = m2.isAnnotationPresent(Order.class) ? m2.getAnnotation(Order.class).value() : java.lang.Integer.MAX_VALUE;
                    return java.lang.Integer.compare(order1, order2);
                }
            });
            for (Method method : testMethods) {
                try {
                    method.invoke(testInstance);
                    System.out.println("  [PASS] " + method.getName());
                    passed++;
                } catch (Exception e) {
                    System.out.println("  [FAIL] " + method.getName() + " -> " + e.getCause());
                    failed++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error instantiating test class: " + e.getMessage());
        }
        System.out.println("Tests run completed: " + (passed + failed) + " (Passed: " + passed + ", Failed: " + failed + ")");
    }
}
