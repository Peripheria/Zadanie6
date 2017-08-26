package com.example.zd6;

import java.util.Scanner;

class Chisla {
    private static Scanner in;

    public static void main(String[] argv) throws java.io.IOException {
        in = new Scanner(System.in);
        System.out.print("Введите строку:");
        String s = in.nextLine(), r = "";
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                if (Character.isUpperCase(c)) c = Character.toLowerCase(c);
                else if (Character.isLowerCase(c)) c = Character.toUpperCase(c);
                r += c;
            }
        }
        System.out.println("Результат:" + r);
    }
}
