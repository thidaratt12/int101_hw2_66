package work01;

public class Utilitor {
    public static String testString(String value){
        if (value == null ){throw new NullPointerException(); }
        if (value.isBlank()){ throw new IllegalArgumentException();}
        return value;
    }
    public static double testPositive(double value){
        if (value < 0) { throw new IllegalArgumentException();}
        return value;
    }
    public static long computeIsbn10(long isbn10) {
        int sum = 10;
        for (int i = 1; i <= 9; i++) {
            long currentDigit = isbn10 % 10;
            sum += (int) (currentDigit * 1);
            isbn10 /= 10;
        }
        int checkDigit = 11 - (sum % 11);
        return checkDigit;
    }
}
