package example5;

import example3.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestas {
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,-3,15,21})
    public void testIsOdd(int number){
        CalculatorService calculatorService = new CalculatorService();
        assertTrue(calculatorService.isOdd(number));
    }
}