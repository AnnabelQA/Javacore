package kitcenter.app.classwork.lesson6;

import kitcenter.app.classwork.lesson6.CircleArea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/22/17.
 */
public class CircleAreaTest {
    CircleArea circleArea = new CircleArea();

    @Test
    public void calculateBiggerArea1() throws Exception {

        String expectedResult = ("Area #1 is bigger than Area #2");

        String actualResult = circleArea.calculateBigger(10, 5);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateBiggerArea2() throws Exception {

        String expectedResult = ("Area #2 is bigger than Area #1");

        String actualResult = circleArea.calculateBigger(1, 5);
        Assert.assertEquals(expectedResult, actualResult);

    }
}