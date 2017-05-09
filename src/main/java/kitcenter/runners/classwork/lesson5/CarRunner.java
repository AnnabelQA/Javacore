package kitcenter.runners.classwork.lesson5;

import kitcenter.app.classwork.lesson5.Car;

/**
 * Created by annabilous on 5/6/17.
 */
public class CarRunner {
    public static void main (String [] args) {
        Car car = new Car();
        car.name = "BMV";
        System.out.println(car.name);
        System.out.println(Car.speed);
        Car.speed = 15;
        Car.showSpeed();// статики вызываються через класс, а не метод

    }
}
