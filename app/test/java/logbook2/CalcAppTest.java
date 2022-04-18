package logbook2;

/**
*   @author Fabio De Araujo
*   @version 1.0
*   @date 2022-04-18
*   @description This class is used to test the CalcApp class.
*/

//TestNG imports
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Test Class
public class CalcAppTest {
    
    private CalcApp calc;

    //This method is executed before each test
    @BeforeMethod
    public void setUp() {
        calc = new CalcApp();
    }

    //This method tests the add method
    @Test
    public void testAdd() {
        calc.add(10).add(20).add(30);
        assertEquals(calc.value(), 60.0);
    }

    //This method tests the subtract method
    @Test
    public void testSubtract() {
        calc.subtract(15).subtract(10);
        assertEquals(calc.value(), -25.0);
    }

    //This method tests the multiply method
    @Test
    public void testMultiply() {
        calc.add(10).multiply(2).multiply(5);
        assertEquals(calc.value(), 100.0);
    }

    //This method tests the divide method
    @Test
    public void testDivide() {
        calc.add(100).divide(5).divide(2);
        assertEquals(calc.value(), 10.0);
    }

    //This method tests the resetCalc method
    @Test
    public void testReset() {
        calc.add(10).add(20).add(30).subtract(15).multiply(2).divide(5);
        calc.resetCalc();
        assertEquals(calc.value(), 0.0);
    }
    
}