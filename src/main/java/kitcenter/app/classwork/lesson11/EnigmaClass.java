package kitcenter.app.classwork.lesson11;

/**
 * Created by annabilous on 5/31/17.
 */
public class EnigmaClass {
    public static String stringEncode (String stringToEncode){
        String plainText = "1234qwert";
        String enigmaText = "qwert1234";
        StringBuilder stringBuilder  = new StringBuilder(stringToEncode);
        String  encodedString = "";

        for (int i = 0; i<stringBuilder.length(); i++){
            for (int j = 0; i<plainText.length(); j++){
                if (stringBuilder.charAt(i) == plainText.charAt(j)) {
                    stringBuilder.setCharAt(i, enigmaText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
