package Strings;
//The string should be compressed such that consecutive duplicates of charecters are replaced with the character and followed by the numbers of consecutive duplicates.

public class consecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbccddee";
        String ans = " " + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                ans += count;
                count = 1;
                ans += curr;
            }
        }
        ans += count;

        System.out.println(ans);

    }
}
