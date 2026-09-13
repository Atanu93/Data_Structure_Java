package Stacks;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] previousGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Remove elements that are smaller than or equal to current
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is empty, no previous greater element
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            // Current element becomes a candidate
            st.push(arr[i]);
        }

        return res;
    }

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 2; i >= 0; i--) {
            while (st.peek() < arr[i] && st.size() > 0) {
                st.pop();
            }

            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
                st.push(arr[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = -1; 

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
