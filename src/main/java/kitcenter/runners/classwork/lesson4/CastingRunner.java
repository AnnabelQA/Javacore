package kitcenter.runners.classwork.lesson4;

import kitcenter.app.classwork.lesson4.NarrowingCasting;
import kitcenter.app.classwork.lesson4.WideningCasting;

/**
 * Created by annabilous on 5/3/17.
 */
public class CastingRunner {
    public static void main(String[] args) {
        WideningCasting wideningCasting = new WideningCasting();

        wideningCasting.widening();

        NarrowingCasting narrowingCasting = new NarrowingCasting();

        narrowingCasting.narrowing();



    }



}
