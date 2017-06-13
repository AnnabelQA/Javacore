package kitcenter.runners.classwork.lesson10;

/**
 * Created by annabilous on 5/27/17.
 */
public class StringRunner {
    public static void main(String[] args) {
        String center = new String("KT");
        String center2 = new String("KT");
        //System.out.println(center == center2);
        //System.out.println(center.equals(center2));
        //String centerIntern = center.intern();// intern do literal from object
        //String center3 = "KT";
        //System.out.println(centerIntern == center3);
        //System.out.println(center.contains("K"));
        String text = "fgjkfjkh";
        String[] split = text.split(",");
        System.out.println((split[0]));





    }
}
