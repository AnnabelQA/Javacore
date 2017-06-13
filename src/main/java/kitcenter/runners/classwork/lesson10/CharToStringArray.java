package kitcenter.runners.classwork.lesson10;

import java.util.Arrays;

/**
 * Created by annabilous on 5/27/17.
 */
public class CharToStringArray {

    public static void main(String[] args) {
        String stringToDisplay = "";

        char[] charArrayToString = {'a','b','c','d'};
        stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",","")
                .replace("[","")
                .replace("]","")
                .trim();

        System.out.println(stringToDisplay);
//        for (int i=0; i<charArrayToString.length; i++){
//
//            stringToDisplay += charArrayToString[i];
    }
        //System.out.println(stringToDisplay);

    }


