
class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
        this.nextNode = null;
    }
    Node(int data, Node node) {
        this.data = data;
        this.nextNode = node;
    }

}

public class LinkedListInsertion {

    static Node createLinkedList(int[] arr) {
        Node headNode = new Node(arr[0]);
        Node temp = headNode;

        for (int i = 1; i < arr.length; ++i) {
            Node node = new Node(arr[i]);
            temp.nextNode = node;
            temp = node;

        }
        return headNode;

    }

    static void printLL(Node head) {
        System.out.println("Linked List elements");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }

    static Node InsertionAtBegining(Node head, int val){
        return new Node(val, head);

    }

    static Node InsertionAtEnd(Node head, int val){
        Node temp =head;
        while(temp.nextNode!=null){
            temp=temp.nextNode;
        }
        temp.nextNode=new Node(val);
        return head;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 6, 7, 1 };
        Node head = createLinkedList(arr);
        printLL(head);

        // Insertion at the begining
        head=InsertionAtBegining(head,10);
        printLL(head);

        // Insertion at the end
        head = InsertionAtEnd(head, 11);
        printLL(head);
        

    }
}
