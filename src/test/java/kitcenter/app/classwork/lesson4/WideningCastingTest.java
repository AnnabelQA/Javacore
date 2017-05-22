package kitcenter.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/16/17.
 */
public class WideningCastingTest {
    private WideningCasting wideningCasting = new WideningCasting();

    @Test
    public void wideningTestPositiv() throws Exception {
        double num = 127.0d;
        byte expectedResult = 127;
        double actualResult = wideningCasting.widening(127.0d);
        Assert.assertEquals(expectedResult, actualResult, 2);

    }

}