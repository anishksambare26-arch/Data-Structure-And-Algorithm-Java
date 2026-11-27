class ListNode {
    int val;
    ListNode next;
    // Constructor to create a new node
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Start {
    // Method to find the starting node of the cycle
    public static ListNode detectCycle(ListNode head) {
        // If the list is empty or has only one node, no cycle exists
        if (head == null || head.next == null) return null;
        // Initialize slow and fast pointers at the head
        ListNode slow = head;
        ListNode fast = head;
        // Move slow by 1 step and fast by 2 steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // If both pointers meet, a cycle is detected
            if (slow == fast) {
                // Move slow back to the head
                slow = head;
                // Move both pointers one step at a time
                // Their meeting point will be the cycle's starting node
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the node where the cycle starts
                return slow;
            }
        }
       // If fast reaches null, no cycle is present
        return null;
    }
    public static void main(String[] args) {
        // Create four nodes
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        // Connect nodes to form a linked list
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        // Connect the last node back to node2 to create a cycle
        node4.next = node2;
        // Find the starting node of the cycle
        ListNode start = detectCycle(head);
        // Print the result
        if (start != null)
            System.out.println("Cycle starts at: " + start.val);
        else
            System.out.println("No cycle");
    }
}
