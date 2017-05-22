package kitcenter.runners.classwork.lesson5;

import kitcenter.app.classwork.lesson5.Car;

/**
 * Created by annabilous on 5/6/17.
 */
public class CarRunner {

    public static void main (String [] args) {
        Car car = new Car("BMV");
        car.setSpeed(15);
        System.out.println(car.showSpeed());
    }
}
