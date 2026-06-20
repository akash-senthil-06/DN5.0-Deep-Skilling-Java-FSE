package com.deepskilling;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
public class TestRunner {
    public static void runTests(Class<?> testClass) {
        System.out.println("Running tests for: " + testClass.getName());
        int passed = 0;
        int failed = 0;
        try {
            Object testInstance = testClass.getDeclaredConstructor().newInstance();
            Method beforeEachMethod = null;
            Method afterEachMethod = null;
            for (Method m : testClass.getDeclaredMethods()) {
                if (m.isAnnotationPresent(org.junit.jupiter.api.BeforeEach.class)) {
                    beforeEachMethod = m;
                }
                if (m.isAnnotationPresent(org.junit.jupiter.api.AfterEach.class)) {
                    afterEachMethod = m;
                }
            }
            for (Method method : testClass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Test.class)) {
                    try {
                        if (beforeEachMethod != null) {
                            beforeEachMethod.invoke(testInstance);
                        }
                        method.invoke(testInstance);
                        System.out.println("  [PASS] " + method.getName());
                        passed++;
                        if (afterEachMethod != null) {
                            afterEachMethod.invoke(testInstance);
                        }
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
