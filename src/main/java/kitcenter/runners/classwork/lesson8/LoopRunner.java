package kitcenter.runners.classwork.lesson8;

/**
 * Created by annabilous on 5/24/17.
 */
public class LoopRunner {
    public static void main(String[] args) {
        int a=5;
        int b= 10;
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        System.out.println(a > b ? printNumber(a) : printNumber(b));
    }
    public  static int printNumber(int number){
        System.out.println(number);
        return number;
    }
}
