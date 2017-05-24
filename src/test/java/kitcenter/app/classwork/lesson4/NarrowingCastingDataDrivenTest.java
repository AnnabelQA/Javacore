package kitcenter.app.classwork.lesson4;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/23/17.
 */

@RunWith(JUnitParamsRunner.class)

public class NarrowingCastingDataDrivenTest {
    @Test
    @FileParameters(value = "src/test/resources/dataForNarrowingCasting")
    public void narrowing(double firstNumber, double expectedResult) throws Exception {
        NarrowingCasting narrowingCasting = new NarrowingCasting();
            float actualResult = narrowingCasting.narrowing(firstNumber);
            Assert.assertEquals(expectedResult, actualResult, 2);
        }

}