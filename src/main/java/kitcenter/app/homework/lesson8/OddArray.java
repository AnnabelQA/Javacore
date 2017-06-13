package kitcenter.app.homework.lesson8;

/**
 * Created by annabilous on 5/26/17.
 */
public class OddArray {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) a++;
        }
        int[] array = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 == 1) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}