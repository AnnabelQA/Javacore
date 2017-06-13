package kitcenter.runners.homework.lesson11;

import kitcenter.app.homework.lesson11.CaesarCoder;

import java.util.Scanner;

/**
 * Created by annabilous on 5/31/17.
 */
public class CaesarRunner {

    public static void main(String[] args) {
        CaesarCoder caesarCoder = new CaesarCoder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string for Encryption:");

        String message = new String();

        message = sc.next();

        System.out.println(caesarCoder.encrypt(message,3));
        System.out.println(caesarCoder.decrypt(message,3));

        sc.close();

    }

}
