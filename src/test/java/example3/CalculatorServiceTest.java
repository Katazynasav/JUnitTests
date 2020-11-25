package example3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private static CalculatorService calculatorService;
    @BeforeAll
    public static void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void add() {
        int actualResult = calculatorService.add(3,5);

        assertEquals(8,actualResult);
    }

    @Test
    void subtract() {
        int actualResult = calculatorService.subtract(1234,1334);

        assertEquals(-100,actualResult);
    }

    @Test
    void multiply() {
        int actualResult = calculatorService.multiply(50,5);

        assertEquals(250,actualResult);
    }

    @Test
    void divide() {
        int actualResult = calculatorService.divide(50,5);

        assertEquals(10,actualResult);
    }

    @Test
    void testFindMax(){
        int[] arejus = {1,2,3,4,5};
        int actualMaxValue = calculatorService.findMax(arejus);
        assertEquals(5,actualMaxValue);

        arejus = new int[]{-12,-4,-34};
        actualMaxValue = calculatorService.findMax(arejus);
        assertEquals(-4,actualMaxValue);
    }

    @Test
    void exceptionTest(){
        ArithmeticException arithmeticException = assertThrows(
                ArithmeticException.class,() -> calculatorService.divide(5,0),
                "expected to throw exception, but it didn't"
        );
        assertTrue(arithmeticException.getMessage().contains("by zero"));
    }
}