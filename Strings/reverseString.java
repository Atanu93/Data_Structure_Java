package Strings;

//Java program to reverse each word in String....

public class reverseString {
    public static void main(String[] args) {
        String str = "I am an online educator";
        String ans = " ";
        StringBuilder ab = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                ab.append(ch);
            } else {
                ab.reverse();
                ans += ab;
                ans += " ";
                ab = new StringBuilder();
            }
        }
        ab.reverse();
        ans += ab; 
        System.out.println(ans);
    }
}
