package kitcenter.app.classwork.lesson4;

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

public class WideningCastingDataDrivenTest {
    @Test
    @FileParameters(value = "src/test/resources/dataForWideningCasting")
    public void widening(double value, double expectedResult) throws Exception {
        WideningCasting wideningCasting = new WideningCasting();
        byte actualResult = wideningCasting.widening(value);
        Assert.assertEquals(expectedResult, actualResult,2);
    }

}