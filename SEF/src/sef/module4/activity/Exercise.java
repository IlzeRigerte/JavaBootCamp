package activity;

public class Exercise {
    public static void exercise(String[]args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 5000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}
