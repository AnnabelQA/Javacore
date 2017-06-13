package kitcenter.runners.homework.lesson6;

import kitcenter.app.homework.lesson6.NumberBigger;

import java.util.Scanner;

/**
 * Created by annabilous on 5/16/17.
 */
public class NumberBiggerRunner {

    public static int runNumberBiggerRunner(int firstNumber,int secondNumber) {

        NumberBigger numberBigger = new NumberBigger();
        int result = numberBigger.numComparator(firstNumber, secondNumber);

        if (result == 0) {
            return result;
        } else if (result > 0) {
            return result;
        } else {
            return result;
        }


    }
}
