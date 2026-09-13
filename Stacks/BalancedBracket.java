package Stacks;

import java.util.*;

public class BalancedBracket {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }

        if (st.size() > 0)
            return false;
        else
            return true;

    }

    // Find the min no of brackets that we need to remove to make the given bracket
    // sequence balanced
    public static int probableBracketRemove(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); // Found a matching pair
                } else {
                    st.push(ch); // Unmatched ')'
                }
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println("Enter your String :");
            System.out.println(isBalanced(str));
            System.out.println(probableBracketRemove(str));
        }

    }
}
