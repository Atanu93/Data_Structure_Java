package Stacks;

public class ArrayUsingStack {

    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("The stack is empty!");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("The stack is empty!");
                return -1;
            }

            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;

            return top;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return idx == arr.length;
        }

        int capacity() {
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(8);
        st.push(5);

        st.display(); // Output: 2 3 7 8 5
        System.out.println(st.size()); // Output: 5

        st.pop();
        st.display(); // Output: 2 3 7 8
        System.out.println(st.size()); // Output: 4
    }
}
