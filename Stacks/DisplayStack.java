package Stacks;

import java.util.*;

public class DisplayStack {

    public static void displayRecursively(Stack<Integer> st) {

        if (st.size() == 0)
            return;

        int top = st.pop();
        System.out.print(top + " ");
        displayRecursively(st);
        st.push(top);
    }

    public static void displayRec(Stack<Integer> st) {

        if (st.size() == 0)
            return;

        int top = st.pop();
        displayRecursively(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void PushAtBottom(Stack<Integer> st, int x) {

        if (st.size() == 0) {
            st.push(x);
            return;
        }

        int top = st.pop();
        PushAtBottom(st, x);
        st.push(top);

    }

    static void reverseStack(Stack<Integer> st) {

        if (st.size() == 1) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        PushAtBottom(st, top);
    }

    public static void removeFromBottom(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();

        while (st.size() > 1) {
            rt.push(st.pop());
        }

        st.pop();

        while (rt.size() > 0) {
            st.push(rt.pop());
        }
    }

    public static void removeFromAtAnyIndex(Stack<Integer> st, int idx) {
        // 1. Bounds checking
        if (idx < 0 || idx >= st.size()) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + st.size());
        }

        Stack<Integer> rt = new Stack<>();

        // 2. Stop when the element at `idx` is at the top of `st`
        while (st.size() > idx + 1) {
            rt.push(st.pop());
        }

        // 3. Remove the target element
        st.pop();

        // 4. Restore remaining elements back into original order
        while (!rt.isEmpty()) {
            st.push(rt.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(8);
        st.push(5);
        // System.out.println(st);
        // displayRecursively(st);

        // displayRec(st);

        removeFromAtAnyIndex(st, 2);
        System.out.println(st);

    }
}
