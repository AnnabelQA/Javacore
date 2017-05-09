package kitcenter.app.classwork.lesson5;

import kitcenter.runners.classwork.lesson5.Calculator;
import org.junit.*;

/**
 * Created by annabilous on 5/3/17.
 */
public class CalculatorTest {

    int numberOne, numberTwo;

    /*
    Here is a comment
     */
    @BeforeClass
    public static void setBeforeClassSetup () {


    }
    @Before

    public void setUp()
    {
        numberOne = 10;
        numberTwo = 40;
    }

    @Test

    public void sumTest () {
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @After
    public void tearDown ()
    {
        System.out.println("Post condition for every test");
    }

    @AfterClass
    public void tearDownForClass ()
    {
        System.out.println("Post condition for class test");
    }

    @Test

    public void substractTest () {
        int numberOne = 40;
        int numberTwo = 10;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);

    }



}
