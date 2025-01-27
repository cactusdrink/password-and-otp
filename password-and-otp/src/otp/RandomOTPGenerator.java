package otp;

import java.util.Random;

public class RandomOTPGenerator {
    static char[] generateOTP(int len) {
        System.out.println("Generating OTP using random() : ");
        System.out.print("Your OTP is : ");

        String numbers = "0123456789";

        Random rndmMethod = new Random();

        char[] otp = new char[len];

        for (int i = 0; i < len; i++) {
            otp[i] = numbers.charAt(rndmMethod.nextInt(numbers.length()));
        }
        return otp;
    }

    public static void main(String[] args) {
        int length = 4;
        System.out.println(generateOTP(length));
    }
}
