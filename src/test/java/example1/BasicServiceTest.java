package example1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicServiceTest {
    private BasicService basicService = new BasicService();

    @Test
    public void testBasicMethod(){
        String actualResult = basicService.basicMethod();
        assertEquals("BasicString",actualResult);
    }
    @Test
    public void testNotBasicMethod(){
        String firstGivenString = "name";
        String secondGivenString = "surname";
        String actualResult = basicService.notBasicMethod(firstGivenString,secondGivenString);
        String expectedResult = "namesurname";
        assertEquals(expectedResult,actualResult);

        String nullExpected = "";
        String nullActualResult = basicService.notBasicMethod(null,null);
        assertEquals(nullExpected,nullActualResult);

        String nameActualResult = basicService.notBasicMethod(firstGivenString,null);
        assertEquals(firstGivenString,nameActualResult);

        String surnameActualResult  =basicService.notBasicMethod(null,secondGivenString);
        assertEquals(secondGivenString,surnameActualResult);
    }
}
