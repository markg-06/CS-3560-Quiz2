//Calculator tests here

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum(){

        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtraction(){

        int expected = -1;
        int actual = calculator.subtraction(1,2);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtractionWithNegatives(){

        int expected = 1;
        int actual = calculator.subtraction(-1,-2);
        assertEquals(expected, actual);
    }
    @Test
    public void testMultiply(){

        int expected = 2;
        int actual = calculator.multiply(1,2);
        assertEquals(expected, actual);
    }
    @Test
    public void testMultiplyByZero(){

        int expected = 0;
        int actual = calculator.multiply(1,0);
        assertEquals(expected, actual);
    }
    @Test
    public void testDivide(){

        int expected = 2;
        int actual = calculator.divide(2,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven(){
        boolean expected = true;
        boolean actual = calculator.isEven(2);
        assertEquals(expected,actual);
    }
    @Test
    public void testIsOdd(){
        boolean actual = calculator.isEven(3);

        assertFalse(actual);
    }
    @Test
    public void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0) );


    }
}
