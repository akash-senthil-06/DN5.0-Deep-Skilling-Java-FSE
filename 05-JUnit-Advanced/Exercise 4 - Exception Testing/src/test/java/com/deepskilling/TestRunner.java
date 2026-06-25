package com.deepskilling;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class TestRunner {
    public static void runTests(Class<?> testClass) {
        if (testClass.isAnnotationPresent(org.junit.platform.suite.api.SelectClasses.class)) {
            System.out.println("Running Test Suite: " + testClass.getName());
            org.junit.platform.suite.api.SelectClasses selectClasses = 
                testClass.getAnnotation(org.junit.platform.suite.api.SelectClasses.class);
            Class<?>[] classes = selectClasses.value();
            for (Class<?> c : classes) {
                runTests(c);
            }
            return;
        }
        System.out.println("Running advanced tests for: " + testClass.getName());
        int passed = 0;
        int failed = 0;
        try {
            Object testInstance = testClass.getDeclaredConstructor().newInstance();
            List<Method> testMethods = new ArrayList<>();
            for (Method m : testClass.getDeclaredMethods()) {
                if (m.isAnnotationPresent(Test.class) || m.isAnnotationPresent(ParameterizedTest.class)) {
                    testMethods.add(m);
                }
            }
            testMethods.sort(new Comparator<Method>() {
                @Override
                public int compare(Method m1, Method m2) {
                    int order1 = m1.isAnnotationPresent(Order.class) ? m1.getAnnotation(Order.class).value() : Integer.MAX_VALUE;
                    int order2 = m2.isAnnotationPresent(Order.class) ? m2.getAnnotation(Order.class).value() : Integer.MAX_VALUE;
                    return Integer.compare(order1, order2);
                }
            });
            for (Method method : testMethods) {
                if (method.isAnnotationPresent(ParameterizedTest.class)) {
                    if (method.isAnnotationPresent(ValueSource.class)) {
                        ValueSource valueSource = method.getAnnotation(ValueSource.class);
                        int[] ints = valueSource.ints();
                        for (int val : ints) {
                            try {
                                method.invoke(testInstance, val);
                                System.out.println("  [PASS] " + method.getName() + " with input: " + val);
                                passed++;
                            } catch (Exception e) {
                                System.out.println("  [FAIL] " + method.getName() + " with input: " + val + " -> " + e.getCause());
                                failed++;
                            }
                        }
                    }
                } else if (method.isAnnotationPresent(Test.class)) {
                    try {
                        method.invoke(testInstance);
                        System.out.println("  [PASS] " + method.getName());
                        passed++;
                    } catch (Exception e) {
                        System.out.println("  [FAIL] " + method.getName() + " -> " + e.getCause());
                        failed++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error instantiating test class: " + e.getMessage());
        }
        System.out.println("Tests run completed: " + (passed + failed) + " (Passed: " + passed + ", Failed: " + failed + ")");
    }
}
