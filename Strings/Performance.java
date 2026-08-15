package Strings;

import java.util.*;

public class Performance {
    public static void main(String[] args) {
        // String str = "";
        // for (int i = 0; i < 10; i++) {
        // str += i;
        // }
        // System.out.println(str);

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        // Toggle -> Touppercase to lowercase and it reverse using strinbuilder

        for (int i = 0; i < str.length(); i++) {

            // check -> alphabet - small or capital;
            boolean flag = true; // Initially it is a capital letter
            char ch = str.charAt(i);
            int AsCii = (int) ch;

            if (ch == ' ' || Character.isDigit(ch))
                continue;

            if (AsCii >= 97)
                flag = false; // small letter;

            if (flag == true) {
                AsCii += 32;
                char new_combo = (char) AsCii;
                str.setCharAt(i, new_combo);
            } else {
                AsCii -= 32;
                char new_combo = (char) AsCii;
                str.setCharAt(i, new_combo);
            }

        }

        System.out.println(str);

    }
}
