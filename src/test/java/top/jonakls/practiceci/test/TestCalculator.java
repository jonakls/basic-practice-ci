package top.jonakls.practiceci.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import top.jonakls.practiceci.Calculator;

public class TestCalculator {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Calculator Test")
    public void totalTest() {
        Assertions.assertEquals(5, calculator.add(2, 3));
        Assertions.assertEquals(1, calculator.subtract(5, 4));
        Assertions.assertEquals(6, calculator.multiply(2, 3));
        Assertions.assertEquals(2, calculator.divide(6, 3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @DisplayName("Calculator Test fail")
    public void falseTest() {
        Assertions.assertEquals(6, calculator.add(2, 3));
    }
}
