package otp;

public class SimpleOTPGenerator {
    public static String generateOTP() {
        int randomPin = (int) (Math.random() * 9000) + 1000;
        return String.valueOf(randomPin);
    }

    public static void main(String args[]) {
        String otpString = generateOTP();
        System.out.println("OTP : " + otpString);
    }
}
