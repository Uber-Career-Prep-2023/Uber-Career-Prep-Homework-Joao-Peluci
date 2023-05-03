package part2;

import part2.implementations.Node;

public class q7MoveNthLastToFront {
    //Given a singly linked list, move the nth from the last element to the front of the list.
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
}
