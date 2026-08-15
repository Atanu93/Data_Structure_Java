package LinkedList;

public class Implementation {

    // User-defined Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class InnerLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp; // Link old tail to new node
                tail = temp; // Move tail forward
            }

            size++;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head; // New node points to old head
                head = temp; // Move head to new node
            }

            size++;
        }

        void insertAtAnyPoint(int idx, int val) {
            Node tp = new Node(val);
            Node temp = head;

            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Wrong index!!");
                return;
            }
            for (int i = 0; i <= idx - 1; i++) {
                temp = temp.next;
            }

            tp.next = temp.next;
            temp.next = tp;

            size++;
        }

        int getAtElement(int idx) {
            Node temp = head;

            if (idx < 0 || idx >= size()) {
                System.out.println("Wrong index!!");
                return -1;
            }

            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        void deleteAtAnyPoint(int idx) {
            Node temp = head;

            if (idx == 0) {
                head = head.next;
                size --;
                return;
            }

            for (int index = 1; index <= idx - 1; index++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        void displayAll() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {

            return size;
        }

    }

    public static void main(String[] args) {

        InnerLinkedList l1 = new InnerLinkedList();

        l1.insertAtEnd(4);
        l1.insertAtEnd(7);
        l1.insertAtEnd(8);
        l1.insertAtEnd(9);
        l1.insertAtEnd(11);
        l1.insertAtEnd(100);

        // l1.displayAll();

        l1.insertAtHead(90);
        l1.insertAtHead(141);
        l1.insertAtHead(140);

        // l1.displayAll();

        // System.out.println(l1.size());

        l1.insertAtAnyPoint(4, 56);
        l1.displayAll();

        // System.out.println(l1.getAtElement(2));

        l1.deleteAtAnyPoint(6);
        l1.displayAll();
    }
}
