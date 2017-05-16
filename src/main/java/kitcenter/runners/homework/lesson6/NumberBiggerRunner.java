package kitcenter.runners.homework.lesson6;

import kitcenter.app.homework.lesson6.NumberBigger;

import java.util.Scanner;

/**
 * Created by annabilous on 5/16/17.
 */
public class NumberBiggerRunner {

    public static void runNumberBiggerRunner() {
        System.out.println("Task number 4 is running...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        NumberBigger numberBigger = new NumberBigger();
        int result = numberBigger.numComparator(firstNumber, secondNumber);

        if (result == 0) {
            System.out.println("Numbers are equal!");
        } else if (result > 0) {
            System.out.println("First Number is bigger than Second!");
        } else {
            System.out.println("Second Number is bigger than First!");
        }


    }
}
