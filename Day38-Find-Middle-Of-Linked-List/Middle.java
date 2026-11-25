class Node {
    int data;   
    Node next;      

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
    }
}

public class Middle {
    Node head; 
    // Method to add a new node at the end
    void add(int data) {
        Node n = new Node(data);  // Create a new node
        // If the list is empty, make the new node the head
        if (head == null) {
            head = n;
            return;
        }

        Node t = head;  // Start traversing from the first node

        // Move to the last node
        while (t.next != null) {
            t = t.next;
        }
        // Connect the last node to the new node
        t.next = n;
    }
    int findMiddle() {
        Node slow = head;  // Slow pointer moves one step at a time
        Node fast = head;  // Fast pointer moves two steps at a time

        // Continue until fast reaches the end of the list
        while (fast != null && fast.next != null) {

            slow = slow.next;       // Move slow pointer by one node
            fast = fast.next.next;  // Move fast pointer by two nodes
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Middle list = new Middle();

        // Add elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("Middle is: " + list.findMiddle()); 
    }
}
