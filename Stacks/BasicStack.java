package Stacks;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(34);
        st.push(5);
        st.push(4);
        st.push(44);
        st.push(46);

        // System.out.println(st.peek()); // 4

        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is: " + st.size());
        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());

    }
}