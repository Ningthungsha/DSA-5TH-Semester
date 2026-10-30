class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteAtEnd {

    static Node deleteAtEnd(Node head) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // If only one node
        if (head.next == null) {
            return null;
        }

        Node temp = head;

        // Go to the second-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete last node
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = deleteAtEnd(head);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}