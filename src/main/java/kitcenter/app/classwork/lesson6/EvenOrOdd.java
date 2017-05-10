package kitcenter.app.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by annabilous on 5/10/17.
 */
public class EvenOrOdd {
    public static void checkEvenOrOdd() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        int result = firstNumber%secondNumber;

        if (result == 0)
        {

            System.out.println("Number is Even!");

        } else {

            System.out.println("Number is Odd!");

        }

    }
}