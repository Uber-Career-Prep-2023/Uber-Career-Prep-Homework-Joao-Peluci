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

    public static void main(String[] args) {
        // create a linked list with a cycle
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3; // cycle
        
        Node.printList(disconnectCycle(head));

    }
}
