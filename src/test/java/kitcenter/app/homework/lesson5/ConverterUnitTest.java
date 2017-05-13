package kitcenter.app.homework.lesson5;

import kitcenter.app.homework.lesson4.PrimitiveConverter;
import kitcenter.runners.homework.lesson4.ConverterRunner;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annabilous on 5/9/17.
 */
public class ConverterUnitTest {
    int intToBeConverted = 2;
    float floatToBeConverted = 3.0f;
    char charToBeConverted = '1';
    char resultString;
    PrimitiveConverter primitiveConverter = new PrimitiveConverter();

    @Test
    public void intToDoubleTest() {

        double expectedResult = 2.0d;

        double actualResult = primitiveConverter.intToDouble(intToBeConverted);
        assertEquals(expectedResult, actualResult, 2);
        System.out.println("Executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

    @Test
    public void floatToIntTest() {

        int expectedResult = 3;

        int actualResult = primitiveConverter.floatToInt(floatToBeConverted);
        assertEquals(expectedResult, actualResult, 2);
        System.out.println("Executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

    @Test
    public void charToIntTest() {

        int expectedResult = 49;

        int actualResult = primitiveConverter.charToInt(charToBeConverted);
        assertEquals(expectedResult, actualResult);
        System.out.println("Executed successfully. Actual Result: " + actualResult + ". " + "Expected result: " + expectedResult);

    }

    @Test
    public void intToCharTestResultArraySize() {
        int expectedResultArrayLength = 1;
        char expectedResult = '2';

        char[] actualResult = primitiveConverter.intToChar(intToBeConverted);
        assertEquals(expectedResultArrayLength, actualResult.length);
        System.out.println("Executed successfully. Actual Result: " + actualResult[0] + ". " + "Expected result: " + expectedResult);
    }

    @Test
    public void intToCharTestResultArrayContent() {
        char expectedResult = '2';

        char[] actualResult = primitiveConverter.intToChar(intToBeConverted);
        assertEquals(expectedResult, actualResult[0]);
        System.out.println("Executed successfully. Actual Result: " + actualResult[0] + ". " + "Expected result: " + expectedResult);
    }

    @Test
    public void intToCharTestResultArrayIsNotEmpty() {
        char[] actualResult = primitiveConverter.intToChar(intToBeConverted);
        assertTrue(actualResult.length >0);
    }

}
