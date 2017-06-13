package kitcenter.app.classwork.lesson4;

/**
 * Created by annabilous on 5/3/17.
 */
public class WideningCasting {

    byte byte1;

    short short1;

    int int1;

    long long1;

    float float1;

    double double1;

//correct conversion 64f<=32f<=64<=32<=16<=8

    public byte widening(double doubleValue ){

        double1 = float1 = long1 = int1 = short1 = byte1;
        byte byteValue = (byte) doubleValue;
        System.out.println(byteValue);
        return byteValue;

    }

}
