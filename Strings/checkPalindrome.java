package Strings;

// Given a string, check whether it is a palindrome or not.
public class checkPalindrome {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abbd";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if (isPalindrome(sub)) {
                    System.out.print(sub + " ");
                    count++;
                }
            }
        }
        System.out.println("\n The number of palindromic substrings are: " + count);
    }
}
