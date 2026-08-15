package LinkedList;

public class nthNodeFromEnd {
    public static Node nthNode(Node head, int idx) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int m = size - idx + 1;

        // mth node from start
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }

        return temp;

    }

    public static Node nthFromEndNode(Node head, int idx) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static Node deleteNthFromNodeEnd(Node head, int idx) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    // Finding middle element of a linked list and return left middle
    public static Node middleElementLeft(Node head) {

        if (head == null)
            return null;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void DisplayList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // // Node q = nthNode(a, 4);
        // Node q = nthFromEndNode(a, 2);
        // System.out.println(q.data);
        // DisplayList(a);
        // a = deleteNthFromNodeEnd(a, 6);
        // DisplayList(a);

        Node mid = middleElementLeft(a);

        if (mid != null) {
            System.out.println(mid.data);
        }

    }
}
