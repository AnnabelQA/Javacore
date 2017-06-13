package kitcenter.runners.classwork.lesson8;

import kitcenter.app.classwork.lesson8.Flat;

/**
 * Created by annabilous on 5/17/17.
 */
public class FlatArray {
    public static void main(String[] args) {

        Flat[] flatArr = new Flat[2];
        Flat flat1 = new Flat();
        Flat flat2 = new Flat();
        flat1.flatAddress = "Tennesy str, \\ 345";
        flat2.flatAddress = "Long str, 34";
        flatArr[0] = flat1;
        flatArr[1] = flat2;

        for (Flat flat: flatArr){
            System.out.println(flat.flatAddress);
        }

    }
}