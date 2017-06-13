package kitcenter.app.homework.lesson8;

/**
 * Created by annabilous on 6/13/17.
 */
public class ArrayDimension {

        private int[][] getArray(int firstLevel, int secondLevel) {

            int[][] array = new int[firstLevel][secondLevel];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 90) + 10;
                    System.out.print(array[i][j] + " ");
                }
            }
            return array;
        }
    }


