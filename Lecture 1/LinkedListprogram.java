class Node {
    int data;
    Node next;

    Node (int d) {
        this.data = d;
        this.next = null;
    }
}
public class LinkedListprogram {
    public static void main(String[]args){
        Node head = new Node(10);

        Node second = new Node(15);
        head.next =  second;

        Node third = new Node(20);
        second.next = third;

        Node forth = new Node(25);
        third.next = forth;

        Node temp = head; 
           while(temp !=null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        
    }
}