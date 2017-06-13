package kitcenter.app.homework.lesson8;
import java.util.Random;

public class ArrayRandom{

    public static void main(String[] args){
        int b = 0;
        int[] array = new int[15];
        for(int i = 0;i < array.length;i++){
            Random random = new Random();
            array[i]=random.nextInt(9);
            System.out.print(array[i] +  " ");
            if(array[i] > 0 & array[i]%2 == 0)b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве "+ b +" четных");
    }
}