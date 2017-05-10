package kitcenter.runners.classwork.lesson5;

import static java.lang.Math.sqrt;

/**
 * Created by annabilous on 5/3/17.
 */
public class Calculator {

    public int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;

    }

    public int substract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;

    }

    public int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;

    }

    public int divide(int numberOne, int numberTwo) {
        return numberOne / numberTwo;

    }
    public double square(double numberOne) {
        double result = Math.sqrt(numberOne);
        return result ;


    }
}