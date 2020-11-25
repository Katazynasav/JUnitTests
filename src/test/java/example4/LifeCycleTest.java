package example4;

import org.junit.jupiter.api.*;

public class LifeCycleTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("Running before WHOLE test suite...");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Running before EVERY test case");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Running after WHOLE test suite...");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Running after EVERY test case");
    }

    @Test
    public void testOne(){
        System.out.println("First test is running");
    }

    @Test
    public void testTwo(){
        System.out.println("Second test is running");
    }

    @Disabled
    @Test
    public void toBeIgnored(){
        System.out.println("I am working, but will be ignored");
    }
}
