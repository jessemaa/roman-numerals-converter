package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToDecimal("MMVI"));
        System.out.println(romanToDecimal("MCMXLIV"));
    }

    public static int value(char i) {
        if (i == 'I') { return 1; }
        if (i == 'V') { return 5; }
        if (i == 'X') { return 10; }
        if (i == 'L') { return 50; }
        if (i == 'C') { return 100; }
        if (i == 'D') { return 500; }
        if (i == 'M') { return 1000; }
        else { return -1; }
    }

    public static int romanToDecimal(String romanNumber) {
        int num = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            int value1 = value(romanNumber.charAt(i));

            if (i + 1 < romanNumber.length()) {
                int value2 = value(romanNumber.charAt(i + 1));
                if (value1 >= value2) {
                    num += value1;
                } else {
                    num += value2 - value1;
                    i++;
                }
            } else { num += value1; }
        }
        return num;
    }
}
