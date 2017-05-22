package kitcenter.app.classwork.lesson5;

import kitcenter.app.classwork.lesson5.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/22/17.
 */
public class CarTest {

    private String carName;
    private Car car;


    @Before
    public void setup(){
        carName = "Jimmy";
        car  = new Car(carName);
    }

    @Test
    public void showInitialSpeedTest() {
        Integer speed = 0;
        String expectedResult = ("Car " + carName + " is moving with the speed: " + speed);

        String actualResult = car.showSpeed();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void showSpeedTest() {
        Integer speed = 10;
        car.setSpeed(speed);
        car.setName(carName + "_new");

        String expectedResult = ("Car " + carName + "_new" + " is moving with the speed: " + speed);
        String actualResult = car.showSpeed();
        Assert.assertEquals(expectedResult, actualResult);
    }

}