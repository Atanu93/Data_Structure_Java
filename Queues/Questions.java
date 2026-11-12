package Queues;

import java.util.*;

// print all elements of a queue in reverse order without using any extra space

public class Questions {
    public static void main(String[] args) {
        Queue<Integer> st = new LinkedList<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        // System.out.println(st);


        // Rear-> 5 4 3 2 1 -> Front
        Queue<Integer> hp = new ArrayDeque<>();
        while (st.size() > 0) {
            System.out.println(st.peek());
            hp.add(st.poll());
        }

        while (hp.size() > 0) {
            st.add(hp.poll());
        }

    }
}
