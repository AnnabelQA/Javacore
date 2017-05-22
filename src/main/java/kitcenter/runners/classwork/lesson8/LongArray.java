package kitcenter.runners.classwork.lesson8;

/**
 * Created by annabilous on 5/17/17.
 */
public class LongArray {
    public static void main(String[] args) {
        long [] longArrInitial = new long [5];
        longArrInitial[0] = 3;
        longArrInitial[1] = 4;
        longArrInitial[2] = 5;
        longArrInitial[3] = 6;
        longArrInitial[4] = 7;
        for (long item: longArrInitial){
            System.out.println(item);
        }

    }
}