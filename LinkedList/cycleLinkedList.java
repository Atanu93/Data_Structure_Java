package LinkedList;

/* Find out the node where the cycle begins, i.e. the node at which
the tail node points

     cycle detection + Number of nodes in cycle
     cycle detection + interesting observy
*/

public class cycleLinkedList {

    public static Node detectTheTailNodeOfCyclNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow)
                break;
        }

        Node temp = head;

        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return slow;
    }

    public static class Node {
        int data;// value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        Node mx = detectTheTailNodeOfCyclNode(a);

        if (mx != null) {
            System.out.println(mx.data);
        }
    }
}