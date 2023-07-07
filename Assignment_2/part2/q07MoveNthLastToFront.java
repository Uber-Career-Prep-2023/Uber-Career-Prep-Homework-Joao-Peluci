import implementations.Node;
//Given a singly linked list, move the nth from the last element to the front of the list.
public class q07MoveNthLastToFront {
    //Slow-fast pointer technique
    //Time complexity O(n)
    //35min
    public static Node moveElement(Node head, int k){
        Node iterate = new Node();
        Node lower, higher = iterate;
        lower = head;
        higher = head;

        //Advance pointer to create a gap
        for (int i = 0; i < k; i++) {
            higher=higher.next;
        }
        //If we reach null with higher, it means that we want to move the first element to first pos
        if (higher==null) return head;

        //Advance higher until null
        if (higher.next!=null){
            higher = higher.next;
            lower = lower.next;
        }
        //Here we need to take our new first node (lower.next)
        Node first = new Node();
        first = lower.next;
        first.next = head;
        lower.next=lower.next.next;
        
        return first;
        
    }

    public static void main(String[] args) {
        // create a linked list
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        // move the 2nd element to the front

        Node.printList(moveElement(node1, 1));
    }
}
