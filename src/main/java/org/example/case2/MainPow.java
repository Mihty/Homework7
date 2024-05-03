package org.example.case2;

public class MainPow {
    public static void main(String[] args) {
        Pow power = (number, pow) -> {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result *= number;
            }
            return result;
        };

        int base = 2;
        int exponent = 3;
        int result = power.pow(base, exponent);
        System.out.println(base + " в степени " + exponent + " = " + result);
    }
}