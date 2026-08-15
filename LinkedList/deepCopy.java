package LinkedList;

public class deepCopy {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node copyingDeeply(Node head) {

        // Dummy node
        Node soul = new Node(100);

        Node temp2 = soul;
        Node temp1 = head;

        while (temp1 != null) {

            // Create a completely new node
            Node a = new Node(temp1.data);

            // Attach new node to copied list
            temp2.next = a;

            // Move temp2 to the newly created node
            temp2 = a;

            // Move through original list
            temp1 = temp1.next;
        }

        // Skip dummy node
        soul = soul.next;

        return soul;
    }

    public static void displayList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
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

        System.out.println("The Main List:");
        displayList(a);

        System.out.println("The Copied List:");
        Node copiedHead = copyingDeeply(a);
        displayList(copiedHead);
    }
}
