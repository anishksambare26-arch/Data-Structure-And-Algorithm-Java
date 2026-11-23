class Node {
    int data;       
    Node next;      
    // Constructor to initialize a new node
    Node(int data) {
        this.data = data;
    }
}

public class Linked {
    Node head; 
    void add(int data) {
        Node n = new Node(data); 
        // If the list is empty, make the new node the head
        if (head == null) {
            head = n;
            return;
        }
        Node t = head; 
        // Move until the last node is reached
        while (t.next != null) {
            t = t.next;
        }
        // Connect the last node to the new node
        t.next = n;
    }
    // Method to add a new node at the beginning
    void addFirst(int data) {
        Node n = new Node(data); 
        n.next = head; 
        head = n;      
    }
    void delete(int data) {
        // If the list is empty, nothing to delete
        if (head == null) return;
        // If the first node contains the value to delete
        if (head.data == data) {
            head = head.next; 
            return;
        }
        Node t = head;
        // Find the node just before the node to be deleted
        while (t.next != null && t.next.data != data) {
            t = t.next;
        }
        // If the value is found, skip that node
        if (t.next != null) {
            t.next = t.next.next;
        }
    }
    void print() {
        Node t = head; 
        // Traverse until the end of the linked list
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next; 
        }
        // Print NULL to indicate the end of the list
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Create a linked list object
        Linked list = new Linked();
        // Add elements at the end
        list.add(10);
        list.add(20);
        list.add(30);
        // Add an element at the beginning
        list.addFirst(5);
        // Display the linked list
        list.print();
        // Delete the node containing 20
        list.delete(20);
        // Display the updated linked list
        list.print();
    }
}
