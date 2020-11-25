package example2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AssertTest {
    @Test
    public void assertTest(){
        String firstString = "Hi";
        String secondString = "Hi";
        assertEquals(firstString,secondString);

        boolean isTrue = true;
        assertTrue(isTrue);

        Double digit = 5.0;
        assertNotNull(digit);
        digit = null;
        assertNull(digit);

        Person person = new Person();
        Person otherPerson = new Person();
        assertNotSame(otherPerson,person);
        person = otherPerson;
        assertSame(person,otherPerson);

        String[] names = {"Tom","Buna"};
        String[] otherNames = {"Tom","Buna"};
        assertArrayEquals(names,otherNames);
    }
}
