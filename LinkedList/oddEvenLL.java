package LinkedList;

// Given a linked list, split it into two lists such that
// one contains odd values, while the other contains even values.

public class oddEvenLL {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Result class to store two linked list heads
    public static class Result {
        Node odd;
        Node even;

        Result(Node odd, Node even) {
            this.odd = odd;
            this.even = even;
        }
    }

    // Split linked list into odd and even lists
    public static Result splitLinkedListTwo(Node head) {

        Node temp = head;

        // Dummy node for odd list
        Node oddNode = new Node(100);
        Node tempO = oddNode;

        // Dummy node for even list
        Node evNode = new Node(200);
        Node tempE = evNode;

        while (temp != null) {

            if (temp.data % 2 == 0) {

                // Even value
                Node a = new Node(temp.data);

                tempE.next = a;
                tempE = a;

            } else {

                // Odd value
                Node a = new Node(temp.data);

                tempO.next = a;
                tempO = a;
            }

            // Move through original list
            temp = temp.next;
        }

        // Skip dummy nodes
        Node oddHeadNode = oddNode.next;
        Node evenHeadNode = evNode.next;

        // Return both lists
        return new Result(oddHeadNode, evenHeadNode);
    }

    // Display linked list
    public static void displayList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Creating original linked list
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        Result result = splitLinkedListTwo(a);

        
        System.out.print("Odd List: ");
        displayList(result.odd);

        // Display even list
        System.out.print("Even List: ");
        displayList(result.even);
    }
}