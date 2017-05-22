package kitcenter.app.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by annabilous on 5/10/17.
 */
public class EvenOrOdd {

    public String checkEvenOrOdd(int firstNumber, int secondNumber) {
        int result = firstNumber%secondNumber;
        if (result == 0) {
            return "Number is Even!";
        } else {
            return "Number is Odd!";
        }
    }
}