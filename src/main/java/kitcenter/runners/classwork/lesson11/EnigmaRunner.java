package kitcenter.runners.classwork.lesson11;

import kitcenter.app.classwork.lesson11.EnigmaClass;

/**
 * Created by annabilous on 5/31/17.
 */
public class EnigmaRunner {
    public static void main(String[] args) {

        EnigmaClass enigmaClass = new EnigmaClass();
        String encoded = EnigmaClass.stringEncode("111");
        System.out.println(encoded);
    }

    }

