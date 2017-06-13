package kitcenter.runners.homework.lesson13;

import kitcenter.app.homework.lesson13.WhiteCollar;

/**
 * Created by annabilous on 6/13/17.
 */
public class WhiteCollarRunner {

    public static void main(String[] args) {

        WhiteCollar wc = new WhiteCollar(10, "BLa", "BlaCompany");
        System.out.println(wc.getAge());
        System.out.println(wc.getName());
        System.out.println(wc.getCompany());
        wc.setCompany("ffFF-sd,sd -sd ");
    }

}

