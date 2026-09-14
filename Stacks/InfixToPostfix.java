package Stacks;

import java.util.*;

public class InfixToPostfix {

    public static void main(String[] args) {

        String postFix = "9-(5+3)*4/6"; //953+4*6/-

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < postFix.length(); i++) {

            char ch = postFix.charAt(i);

            // 1. Number
            if (ch >= '0' && ch <= '9') {

                val.push("" + ch);
            }

            // 2. Opening bracket
            else if (ch == '(') {

                op.push(ch);
            }

            // 3. Closing bracket
            else if (ch == ')') {

                while (op.peek() != '(') {

                    String v2 = val.pop();
                    String v1 = val.pop();

                    char o = op.pop();

                    String t = v1 + v2 + o;

                    val.push(t);
                }

                // Remove '('
                op.pop();
            }

            // 4. Operator
            else {

                if (ch == '+' || ch == '-') {

                    // + and - have lowest precedence
                    while (!op.isEmpty() && op.peek() != '(') {

                        String v2 = val.pop();
                        String v1 = val.pop();

                        char o = op.pop();

                        String t = v1 + v2 + o;

                        val.push(t);
                    }

                    op.push(ch);
                }

                else if (ch == '*' || ch == '/') {

                    // Calculate only * and /
                    while (!op.isEmpty()
                            && op.peek() != '('
                            && (op.peek() == '*' || op.peek() == '/')) {

                        String v2 = val.pop();
                        String v1 = val.pop();

                        char o = op.pop();

                        String t = v1 + v2 + o;

                        val.push(t);
                    }

                    op.push(ch);
                }
            }
        }

        // Process remaining operators
        while (!op.isEmpty()) {

            String v2 = val.pop();
            String v1 = val.pop();

            char o = op.pop();

            String t = v1 + v2 + o;

            val.push(t);
        }

        String prefix = val.pop();

        System.out.println(prefix);
    }
}
