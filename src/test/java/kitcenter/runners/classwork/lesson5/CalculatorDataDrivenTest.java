package kitcenter.runners.classwork.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/24/17.
 */

@RunWith(JUnitParamsRunner.class)
public class CalculatorDataDrivenTest {
    Calculator calculator = new Calculator();
    @Test
    @FileParameters(value = "src/test/resources/dataForSumCalculator")
    public void sum(int numberOne, int numberTwo, int expectedResult) throws Exception {
        int actualResult = calculator.sum(numberOne,numberTwo);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    @FileParameters(value = "src/test/resources/dataForSubstractCalculator")
    public void substract(int numberOne, int numberTwo, int expectedResult) throws Exception {
            int actualResult = calculator.substract(numberOne,numberTwo);
            Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    @FileParameters(value = "src/test/resources/dataForMultiplyCalculator")
    public void multiply(int numberOne, int numberTwo, int expectedResult) throws Exception {
        int actualResult = calculator.multiply(numberOne,numberTwo);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    @FileParameters(value = "src/test/resources/dataForDivideCalculator")
    public void divide(int numberOne, int numberTwo, int expectedResult) throws Exception {
        int actualResult = calculator.divide(numberOne,numberTwo);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    @FileParameters(value = "src/test/resources/dataForSquareCalculator")
    public void square(double numberOne, double expectedResult) throws Exception {
        double actualResult = calculator.square(numberOne);
        Assert.assertEquals(expectedResult, actualResult,2);

    }

}