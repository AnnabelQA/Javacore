package kitcenter.app.homework.lesson5;

import kitcenter.runners.classwork.lesson5.Calculator;
import org.junit.*;
/**
 * Created by annabilous on 5/9/17.
 */
public class CalculatorUnitTest {
    int numberOne, numberTwo;
    Calculator calculator = new Calculator();


    @Before
    public void setUp()
    {
        numberOne = 40;
        numberTwo = 10;
    }

    @Test
    public void sumTest () {
        int expectedResult = 50;

        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Sum executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }


    @Test
    public void substractTest () {

        int expectedResult = 30;
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Substract executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

    @Test
    public void multiplyTest() {
        int expectedResult = 400;
        int actualResult = calculator.multiply(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Multiply executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

    @Test
    public void multiplyTestByZero() {
        numberOne = 40;
        numberTwo = 0;
    int expectedResult = 0;
    int actualResult = calculator.multiply(numberOne, numberTwo);
    Assert.assertEquals(expectedResult, actualResult);
    System.out.println("Multiply by Zero executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

}

    @Test
    public void divideTest() {
        int expectedResult = 4;
        int actualResult = calculator.divide(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Divide executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

    @Test
    public void divideByZeroTest1() {
        numberOne = 0;
        numberTwo = 40;
        int expectedResult = 0;
        int actualResult = calculator.divide(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Divide by Zero executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest2() {
        numberOne = 40;
        numberTwo = 0;
        calculator.divide(numberOne, numberTwo);
    }

    @Test
    public void squareTest() {
        numberOne = 9;
        double expectedResult = 3;
        double actualResult = calculator.square(numberOne);
        Assert.assertEquals(expectedResult, actualResult,2);
        System.out.println("Square executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

}