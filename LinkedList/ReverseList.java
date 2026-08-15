package LinkedList;

public class ReverseList {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void displayLL(Node head) {
        if (head == null)
            return;

        System.out.print(head.val + " ");
        displayLL(head.next);
    }

    public static Node recursivelyDisplayLL(Node head) {
        if (head == null)
            return head;
        Node newHead = recursivelyDisplayLL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        displayLL(a);

        a = recursivelyDisplayLL(a);
        displayLL(a);
    }
}
