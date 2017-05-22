package kitcenter.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/16/17.
 */
public class NarrowingCastingTest {
    private NarrowingCasting narrowingCasting = new NarrowingCasting();

    @Test
    public void narrowingTest() {
        float expectedResult = 40.3f;

        float actualResult = narrowingCasting.narrowing(40.3);
        Assert.assertEquals(expectedResult, actualResult, 2);

    }

}