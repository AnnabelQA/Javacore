package kitcenter.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/23/17.
 */

@RunWith(JUnitParamsRunner.class)

public class NumberBiggerDataDrivenTest {

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv")
    public void numComparator(int firstNumber, int secondNumber, int expectedResult) throws Exception {
        NumberBigger numberBigger = new NumberBigger();
        int actualResult = numberBigger.numComparator(firstNumber,secondNumber);
        Assert.assertEquals(expectedResult, actualResult);
    }

}