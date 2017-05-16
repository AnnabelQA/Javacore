package kitcenter.runners.homework.lesson4;

import kitcenter.app.homework.lesson4.PrimitiveConverter;

/**
 * Created by annabilous on 5/9/17.
 */
public class ConverterRunner {

    public static void runConverterRunner() {
        System.out.println("Task number 2 is running...");
        PrimitiveConverter primitiveConverter = new PrimitiveConverter();
        primitiveConverter.floatToChar(0.4f);
        primitiveConverter.intToChar(3);
        primitiveConverter.charToInt('1');
        primitiveConverter.floatToInt(10.7f);
        primitiveConverter.intToDouble(33);

    }
}
