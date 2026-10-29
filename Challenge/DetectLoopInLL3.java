
package Challenge;

// ============== Leet code - 141. Linked List Cycle ==============

public class DetectLoopInLL3 {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Detect whether a loop exists
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps

            if (slow == fast) {
                return true;           // Loop found
            }
        }

        return false;                  // No loop
    }

    public static void main(String[] args) {

        // Create nodes: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Create a loop: node 4 points back to node 2
        head.next.next.next.next = head.next;

        DetectLoopInLL3 solution = new DetectLoopInLL3();

        boolean result = solution.hasCycle(head);

        if (result) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop detected");
        }
    }
}
