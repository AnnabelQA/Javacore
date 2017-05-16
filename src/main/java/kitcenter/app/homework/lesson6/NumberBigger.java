package kitcenter.app.homework.lesson6;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by annabilous on 5/16/17.
 */
public class NumberBigger {

    public int numComparator(Number a, Number b){
        return new BigDecimal(a.toString()).compareTo(new BigDecimal(b.toString()));

    }
}
