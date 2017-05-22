package kitcenter.app.classwork.lesson6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/22/17.
 */
public class EvenOrOddTest {

    EvenOrOdd evenOrOdd = new EvenOrOdd();

    @Test
    public void checkThatEven() throws Exception {
        String expectedResult = ("Number is Even!");

        String actualResult = evenOrOdd.checkEvenOrOdd(10, 5);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void checkThatOdd() throws Exception {
        String expectedResult = ("Number is Odd!");

        String actualResult = evenOrOdd.checkEvenOrOdd(1, 5);
        Assert.assertEquals(expectedResult, actualResult);

    }

}