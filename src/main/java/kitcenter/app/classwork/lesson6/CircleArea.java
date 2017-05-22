package kitcenter.app.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by annabilous on 5/6/17.
 */
public class CircleArea {
    private final double PI = 3.14d;


    public String calculateBigger(int r1,int r2){

        double area1 = r1 * PI;
        double area2 = r2 * PI;

        if ((r1 > r2) || (area1 > area2)){
            return "Area #1 is bigger than Area #2";
        } else {

            return "Area #2 is bigger than Area #1";
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
