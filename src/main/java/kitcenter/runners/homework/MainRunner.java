package kitcenter.runners.homework;

import kitcenter.runners.classwork.lesson6.EvenOrOddRunner;
import kitcenter.runners.homework.lesson4.ConverterRunner;
import kitcenter.runners.homework.lesson6.NumberBiggerRunner;
import kitcenter.runners.homework.lesson6.TriangleAreaRunner;

import java.util.Scanner;

/**
 * Created by annabilous on 5/16/17.
 */
public class MainRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter lesson number or \"0\" to exit: ");
            int lessonNumber = scanner.nextInt();
            switch (lessonNumber) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                case 1:
                    EvenOrOddRunner.runEvenOrOddRunner();
                    break;
                case 2:
                    ConverterRunner.runConverterRunner();
                    break;
                case 3:
                    TriangleAreaRunner.runTriangleAreaRunner();
                    break;
                case 4:
                    NumberBiggerRunner.runNumberBiggerRunner(3,4);
                    break;

                default:
                    System.out.println("There is no lesson number " + lessonNumber + ". Enter correct number.");
                    break;

            }
            System.out.println("-----------------------");
        }
    }
}
