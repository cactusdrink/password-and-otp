package password;

public class UniquePasswordGenerator {
    public static long code() {
        return (long) ((Math.random() * 9 * Math.pow(10, 15)) + Math.pow(10, 15));
    }

    public static void main(String[] args) {
        long code = code();
        String uniquePassword = "";
        for (long i = code; i != 0; i /= 100) {
            long digit = i % 100;
            if (digit <= 90) digit += 32;
            char ch = (char) digit;
            uniquePassword = ch + uniquePassword;
        }
        System.out.println("Unique password = " + uniquePassword);
    }
}
