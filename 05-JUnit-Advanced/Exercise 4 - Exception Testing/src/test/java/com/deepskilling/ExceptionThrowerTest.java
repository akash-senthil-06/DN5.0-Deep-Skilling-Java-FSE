package com.deepskilling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class ExceptionThrowerTest {
    @Test
    public void testThrowException() {
        ExceptionThrower thrower = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, () -> {
            thrower.throwException(null);
        });
    }
    public static void main(String[] args) {
        TestRunner.runTests(ExceptionThrowerTest.class);
    }
}
