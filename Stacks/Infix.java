package Stacks;

import java.util.*;

public class Infix {

    // Performs one calculation
    public static void calculate(Stack<Integer> val,
            Stack<Character> op) {

        int v2 = val.pop();
        int v1 = val.pop();

        char operator = op.pop();

        if (operator == '+') {
            val.push(v1 + v2);
        } else if (operator == '-') {
            val.push(v1 - v2);
        } else if (operator == '*') {
            val.push(v1 * v2);
        } else if (operator == '/') {
            val.push(v1 / v2);
        }
    }

    public static void main(String[] args) {

        String str = "9-(5+3)*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // 1. Number
            if (ch >= '0' && ch <= '9') {

                val.push(ch - '0');
            }

            // 2. Opening bracket
            else if (ch == '(') {

                op.push(ch);
            }

            // 3. Closing bracket
            else if (ch == ')') {

                while (op.peek() != '(') {
                    calculate(val, op);
                }

                // Remove '('
                op.pop();
            }

            // 4. Operator
            else {

                if (ch == '+' || ch == '-') {

                    // Calculate everything already present
                    // because + and - have lowest precedence
                    while (!op.isEmpty() && op.peek() != '(') {
                        calculate(val, op);
                    }

                    op.push(ch);
                }

                else if (ch == '*' || ch == '/') {

                    // Calculate only * and /
                    while (!op.isEmpty()
                            && op.peek() != '('
                            && (op.peek() == '*' || op.peek() == '/')) {

                        calculate(val, op);
                    }

                    op.push(ch);
                }
            }
        }

        // Calculate remaining operators
        while (!op.isEmpty()) {
            calculate(val, op);
        }

        System.out.println(val.peek());
    }
}