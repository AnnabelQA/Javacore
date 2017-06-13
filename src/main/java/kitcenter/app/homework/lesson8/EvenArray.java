package kitcenter.app.homework.lesson8;

/**
 * Created by annabilous on 5/26/17.
 */
public class EvenArray {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] array = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}