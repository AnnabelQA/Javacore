package kitcenter.runners.classwork.lesson6;

import kitcenter.app.classwork.lesson6.EvenOrOdd;

import java.util.Scanner;

/**
 * Created by annabilous on 5/10/17.
 */
public class EvenOrOddRunner {

    public static void runEvenOrOddRunner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println(evenOrOdd.checkEvenOrOdd(firstNumber, secondNumber));
    }

    public static void main(String[] args) {
        runEvenOrOddRunner();
    }
}
