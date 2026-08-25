package Stacks;

import java.util.*;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // int n;
        // System.out.println("Enter the number of elements :");
        // n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // int x = sc.nextInt();
        // st.push(x);
        // }
        // System.out.println(st);

        st.push(2);
        st.push(3);
        st.push(7);
        st.push(8);
        st.push(5);

        System.out.println(st);

        Stack<Integer> ww = new Stack<>();

        while (st.size() > 0) {
            int x = st.peek();
            ww.push(x);
            st.pop();
        }
        System.out.println(ww);

        Stack<Integer> xx = new Stack<>();

        while (ww.size() > 0) {
            xx.push(ww.pop());
        }

        System.out.println(xx);
    }

}
