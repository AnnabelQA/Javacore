package kitcenter.app.classwork.lesson7;

import java.util.Scanner;

/**
 * Created by annabilous on 5/13/17.
 */
public class DoWhilePrintNumber {

    int a;
    int b;

    public void askUserNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        if (a > b) {

            do
                a = a - 1;

             while (a == b);

        }
        if (a <= b){
            System.out.println(firstNumber + " " + secondNumber);

        }

        }
    }