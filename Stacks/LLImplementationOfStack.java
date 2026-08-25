package Stacks;

public class LLImplementationOfStack {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    public static class LLstack {
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void display_Rev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void display_rec(Node h) {

            if (h == null)
                return;

            display_rec(h.next);
            System.out.print(h.val + " ");

        }

        void display() {
            display_rec(head);
            System.out.println();
        }

        int size() { // getter
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int x = head.val;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.val;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }

            return false;
        }

    }

    public static void main(String[] args) {
        LLstack st = new LLstack();
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