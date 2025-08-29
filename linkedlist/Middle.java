package linkedlist;
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Middle {
    public static double findMedian(ListNode head) {
        if (head == null) return 0;
        if (head.next == null) return head.val;
        
        // First pass to count nodes
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        // Find middle node(s)
        current = head;
        if (count % 2 == 0) {
            // Even number of nodes
            int middleIndex = count / 2;
            for (int i = 0; i < middleIndex - 1; i++) {
                current = current.next;
            }
            // Calculate average of two middle nodes
            return (current.val + current.next.val) / 2.0;
        } else {
            // Odd number of nodes
            int middleIndex = count / 2;
            for (int i = 0; i < middleIndex; i++) {
                current = current.next;
            }
            return current.val;
        }
    }
    
    public static void main(String[] args) {
        // Test with odd number of nodes
        ListNode head1 = new ListNode(25);
        head1.next = new ListNode(15);
        head1.next.next = new ListNode(46);
        head1.next.next.next = new ListNode(5);
        head1.next.next.next.next = new ListNode(14);
        
        System.out.println("Median for odd length: " + findMedian(head1));
        
        // Test with even number of nodes
        ListNode head2 = new ListNode(25);
        head2.next = new ListNode(15);
        head2.next.next = new ListNode(46);
        head2.next.next.next = new ListNode(5);
        
        System.out.println("Median for even length: " + findMedian(head2));
    }
}