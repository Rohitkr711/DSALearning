// package Java_Code.5_LinkedList;

class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

}

public class ArrayToLinkedList {

    static Node convertArrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; ++i) {
            Node newNode = new Node(arr[i]);
            temp.nextNode = newNode;
            temp = newNode;
        }
        return head;

    }

    static void printLL(Node head) {
        // System.out.println("Linked List elements");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }

    static Node deleteHead(Node head) {
        if (head == null)
            return null;
        Node temp = head;
        head = head.nextNode;
        return head;

    }

    static Node deleteTail(Node head) {
        if (head == null || head.nextNode == null)
            return null;

        Node temp = head;
        while (temp.nextNode.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = null;
        return head;

    }

    static Node deleteKthNode(Node head, int k) {
        if(head==null) return null;
        if(k==1){
            head = head.nextNode;
            return head;
        }

        int counter=0;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            ++counter;
            if(counter==k){
               prev.nextNode=prev.nextNode.nextNode;
               break;
            }
            prev=temp;
            temp=temp.nextNode;
        }

        return head;

    }

    static Node deleteElementsNode(Node head, int ele) {
        if(head==null) return null;
        if(head.data==ele){
            head = head.nextNode;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data==ele){
               prev.nextNode=prev.nextNode.nextNode;
               break;
            }
            prev=temp;
            temp=temp.nextNode;
        }

        return head;

    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 9 };
        // Linked list creation
        System.out.println("Linked List created");
        Node head = convertArrayToLinkedList(arr);

        // Linked List Traversal
        // System.out.println("Linked List traversal");
        // printLL(head);

        // Delete head of LL
        // System.out.println("Linked List head deletion");
        // Node newHead = deleteHead(head);
        // printLL(newHead);

        // Delete Tail of a LL
        // System.out.println("Linked List Tail deletion");
        // Node newHead1 = deleteTail(newHead);
        // printLL(newHead1);

        // Remove kth node
        // Node newHead2 = deleteKthNode(head, 2);
        // printLL(newHead2);

        // Remove element's node
        Node newHead3 = deleteElementsNode(head, 6);
        printLL(newHead3);

    }
}
