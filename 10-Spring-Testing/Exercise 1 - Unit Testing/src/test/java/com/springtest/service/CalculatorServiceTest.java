package com.springtest.service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
    @InjectMocks
    private CalculatorService calculatorService;
    @Test
    public void testAdd() {
        int result = calculatorService.add(5, 3);
        assertEquals(8, result);
    }
    @Test
    public void testSubtract() {
        int result = calculatorService.subtract(10, 4);
        assertEquals(6, result);
    }
}
