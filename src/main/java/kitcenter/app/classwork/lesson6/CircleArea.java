package kitcenter.app.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by annabilous on 5/6/17.
 */
public class CircleArea {
    public static final double PI = 3.14d;

    public static void calculateBigger(){
        int r1 = 20;
        int r2 = 5;
        double area1 = r1 * PI;
        double area2 = r2 * PI;
        if ((r1 > r2) || (area1 > area2)){

            System.out.println("Area1 is bigger");

            System.out.println("Area2 is smaller");

        } else {

            System.out.println("Area2 is bigger");

            System.out.println("Area1 is smaller");

        }

    }





//    public static void calculate(){
//        double piNumber = 3.14;
//
//        Scanner scanner = new Scanner(System.in);
//        double radius = scanner.nextDouble();
//        double circleArea = piNumber * Math.pow(radius, 2);
//
//        System.out.println("Area is " + circleArea);
//    }
}
