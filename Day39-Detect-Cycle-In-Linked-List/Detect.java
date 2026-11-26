class Node {
    int data;
    Node next;
    // Constructor to create a new node
    Node(int data) {
        this.data = data;
    }
}
public class Detect {
    Node head;
    // Detect Cycle in Linked List
    boolean hasCycle() {
        // Initialize two pointers at the head
        Node slow = head;
        Node fast = head;
        // Continue until fast reaches the end of the list
        while (fast != null && fast.next != null) {
            // Slow pointer moves one step forward
            slow = slow.next;
            // Fast pointer moves two steps forward
            fast = fast.next.next;
            // If both pointers meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     // Create a linked list object
        Detect list = new Detect();
        // Create four nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        // Connect nodes to form a linked list
        list.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        // Test 1 - Linked list without a cycle
        System.out.println("No Cycle: " + list.hasCycle());
        n4.next = n2;
        // Test 2 - Linked list with a cycle
        System.out.println("With Cycle: " + list.hasCycle());
    }
}
