package kitcenter.runners.classwork.lesson8;

import kitcenter.app.classwork.lesson5.Car;
import kitcenter.app.classwork.lesson8.ArrayUtil;

import java.util.Arrays;

/**
 * Created by annabilous on 5/17/17.
 */
public class ArrayRunner {
    public static void main(String[] args) {

        //empty multi-dimension array 2x2

        int[][] intArray = new int[2][3];

        for(int j=0; j<intArray.length; j++){
            for (int k=0; k<intArray[j].length; k++){
                intArray[j][k] = j*k;
                System.out.print(intArray[j][k]);
            }

        }
        ArrayUtil arrayUtil = new ArrayUtil();
       // int [][] Array = arrayUtil.createAndFill(2,3);
        System.out.println(Arrays.deepToString(intArray));
        for (int[] itemArray: intArray){
            for(int item: itemArray){
                System.out.println(item);

            }
        }

//        int[][] a = new int[2][2];
//
//        a[0][0] = 1;
//
//        a[0][1] = 2;
//
//        a[1][0] = 3;
//
//        a[1][1] = 4;
//
//        for(int j=0; j<a.length; j++){
//            for (int k=0; k<a[j].length; k++){
//                a[j][k] = j*k;
//                System.out.println(a[j]);
//            }
//
//        }
//


//        int[][] multidimenEmpty = new int[2][];
//        multidimenEmpty [0] = new int[3];
//        multidimenEmpty [1] = new int[4];
//
//        int[][] multidimenFull = new int[2][];
//        multidimenFull [0] = new int[]{3,4,5};
//        multidimenFull [1] = new int[]{3,4,5,5};
//

//        int [] intArr = {3,4,5,6};
//        int [] intArrInitial = new int [4];
//        intArrInitial[0] = 3;
//        intArrInitial[1] = 4;
//        intArrInitial[2] = 5;
//        intArrInitial[3] = 6;
//        intArrInitial[0] = 7;
//        System.out.println(intArrInitial[0]);
//        for (int item: intArrInitial){
//            System.out.println(item);
//        }
////
//        for (int i=0; i<intArr.length; i++){
//            System.out.println(intArr[i]);
//
//        }

//        Car[] carArr = new Car[2];
//        Car bmw = new Car();
//        bmw.name = "BMW";
//        Car audi = new Car();
//        audi.name = "Audi";
//        carArr[0] = bmw;
//        carArr[1] = audi;
//
//        for (Car car: carArr){
//            System.out.println(car.name);
//        }


    }
}
