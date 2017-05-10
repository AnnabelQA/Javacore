package kitcenter.app.homework.lesson4;

/**
 * Created by annabilous on 5/9/17.
 */
public class PrimitiveConverter {

   public char[] floatToChar(float floatToBeConverted) {

       String resultString = Float.toString(floatToBeConverted);
       char[] resultCharsArray = resultString.toCharArray();

       System.out.println("Input float value is " + floatToBeConverted + ". Output char value is " + resultString);
       return resultCharsArray;
   }

    public char[] intToChar(int intToBeConverted) {
        String resultString = Integer.toString(intToBeConverted);
        char[] resultCharsArray = resultString.toCharArray();

        System.out.println("Input int value is " + intToBeConverted + ". Output char value is " + resultString);
        return resultCharsArray;
    }

    public int charToInt(char charToBeConverted) {
        int resultInt = (int)charToBeConverted;
        System.out.println("Input char value is " + charToBeConverted + ". Output int value is " + resultInt);
        return resultInt; //get index of char
    }

    public int floatToInt(float floatToBeConverted) {
        int resultInt = (int)floatToBeConverted;
        System.out.println("Input float value is " + floatToBeConverted + ". Output int value is " + resultInt);
        return resultInt;
    }

    public double intToDouble(int intToBeConverted) {
        double resultDouble = (double)intToBeConverted;
        System.out.println("Input float value is " + intToBeConverted + ". Output int value is " + resultDouble);
        return resultDouble;
    }
}
