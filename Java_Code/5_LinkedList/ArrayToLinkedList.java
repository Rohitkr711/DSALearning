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

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 9 };
        // Linked list creation
        Node head = convertArrayToLinkedList(arr);
        System.out.println("Output:"+head.data);
        
        // Linked List Traversal
        System.out.println("LinkedList traversal");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.nextNode;
        }

    }
}
