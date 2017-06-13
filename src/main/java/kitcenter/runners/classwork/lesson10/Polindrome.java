package kitcenter.runners.classwork.lesson10;

/**
 * Created by annabilous on 5/27/17.
 */
public class Polindrome {
    public static void main(String[] args) {
        String variable = "moor";

        StringBuffer rev = new StringBuffer(variable).reverse();

        String strRev = rev.toString();

        if(variable.equalsIgnoreCase(strRev)){
            System.out.println("It's polindrome");
        }
        else {System.out.println("It's NOT polindrome");}
    }
}
