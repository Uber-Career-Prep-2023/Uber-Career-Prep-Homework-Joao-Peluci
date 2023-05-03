import implementations.Node;
// Linked list fast-slow two-pointer
//Time Complexity O(n)
//Space Complexity O(1*2)
//20 min
public class q09DisconnectCycles {
    public static Node disconnectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        if (head==null) return head;
        while (slow!=null && slow.next!=null && fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow.next = null;
            }
        }
        return head;
    }
}
