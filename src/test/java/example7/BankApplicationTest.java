package example7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class BankApplicationTest {
   @Mock //annotation used to create mock,same as mock(Class.class)
    MarginCalculationService marginCalculationService;

   @InjectMocks
    BankApplication bankApplication = new BankApplication();

   @Test
    public void testComplicatedCalculations(){
       when(marginCalculationService.calculateMargin(2.0,4.0)).thenReturn(2.0);
       double actualResult = bankApplication.doComplicatedMarginCalculations(2.0,4.0);
       assertEquals(2.0,actualResult);
   }

    @Test
    void smartCalculateMethod() {
        when(marginCalculationService.calculateMargin(2.0,4.0)).thenReturn(2.0);
        double actualResult = bankApplication.smartCalculateMethod(2.0,4.0);
        assertEquals(7.2,actualResult);
    }
}