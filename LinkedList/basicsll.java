package LinkedList;

public class basicsll {

    public static int lengthOfLinkList(Node H) {
        int count = 0;

        while (H != null) {
            count++;
            H = H.next;
        }

        return count;
    }

    public static void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;

        while (t.next != null) {
            t = t.next;
        }

        t.next = temp;
    }

    public static void displayRecursively(Node head) {
        if (head == null)
            return;

        System.out.println(head.data);
        displayRecursively(head.next);
    }

    public static void displayLinkedList(Node head) {
        Node tp = head;

        while (tp != null) {
            System.out.print(tp.data + " ");
            tp = tp.next;
        }
    }

    public static class Node {
        int data;// value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b; // 5 - 3
        b.next = c; // 5 - 3 - 9
        c.next = d; // 5 - 3 - 9 - 8
        d.next = e; // 5 - 3 - 9 - 8 - 16 - null

        /*
         * System.out.println(a.data);
         * System.out.println(a.next.data);
         * System.out.println(a.next.next.data);
         * System.out.println(a.next.next.next.data);
         * System.out.println(a.next.next.next.next.data);
         * // System.out.println(a.next);
         */

        /*
         * Node temp = a;
         * for (int i = 1; i <= 5; i++) {
         * System.out.println(temp.data);
         * temp = temp.next;
         * }
         */
        System.out.println(lengthOfLinkList(a));

        insertAtEnd(a, 90);

    }
}