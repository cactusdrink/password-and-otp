package password;

import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(geekPassword(length));
    }

    static char[] geekPassword(int len) {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");

        String CapitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SmallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = CapitalChars + SmallChars + numbers + symbols;

        Random rndmMethod = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(rndmMethod.nextInt(values.length()));
        }
        return password;
    }
}
