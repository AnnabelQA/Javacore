package kitcenter.runners.classwork.lesson11;

/**
 * Created by annabilous on 5/31/17.
 */
public class StringConcatinotion {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++)
            c = c.concat(b);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
