class Node {
    int data;       
    Node next;  

    Node(int data) {
        this.data = data; // Initialize node with given value
    }
}
public class Reverse {
    Node head; 
    // Method to add a new node at the end of the linked list
    void add(int data) {
        Node n = new Node(data); // Create a new node

        // If list is empty, make the new node the head
        if (head == null) {
            head = n;
            return;
        }
        Node t = head; // Start traversing from the head
        // Move to the last node
        while (t.next != null) {
            t = t.next;
        }
        t.next = n; // Connect the last node to the new node
    }
    void reverse() {
        Node prev = null; // Stores the previous node
        Node curr = head; // Starts from the first node
        Node next = null; // Temporarily stores the next node

        // Continue until all nodes are reversed
        while (curr != null) {

            next = curr.next;  // Save the next node before changing the link

            curr.next = prev;  // Reverse the link of the current node

            prev = curr;       // Move prev one step forward

            curr = next;       // Move curr to the next node
        }

        head = prev; // Update head to the new first node
    }
    void print() {
        Node t = head; 
        // Print nodes until the end of the linked list
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next; // Move to the next node
        }
        System.out.println("NULL"); // Indicates the end of the list
    }
    public static void main(String[] args) {
        Reverse list = new Reverse();
        // Insert elements into the linked list
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("Before: ");
        list.print();
        list.reverse();
        System.out.print("After:  ");
        list.print();
    }
}
