package kitcenter.runners.classwork.lesson10;

/**
 * Created by annabilous on 5/27/17.
 */
public class StringToPrimitiveAndBack {
    public static void main(String[] args) {
        String integer = "11";
        Integer resultInt = Integer.valueOf(integer);
        int y = Integer.parseInt(integer);

        System.out.println("Here is int: " + y);

        Integer newInt = new Integer(y);
        String s = String.valueOf(newInt);

        System.out.println(s);

        //  String integer = String.valueOf(y);
    }


}
