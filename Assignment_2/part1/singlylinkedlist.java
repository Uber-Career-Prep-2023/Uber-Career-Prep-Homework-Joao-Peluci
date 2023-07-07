import implementations.Node;
public class singlylinkedlist {
    Node head;
    Node insertAtFront(Node head, int val) {// creates new Node with data val at front; returns new head
        Node front = new Node(); //Creates new node
        front.data=val; //Add data to node
        front.next=head; //Points the old head to next node
        return front; //Returns new head
    }

    void insertAtBack(Node head, int val) {// creates new Node with data val at end
        Node pointer = head; //Using temp variable for iteration
        while(pointer.next!=null){
            pointer = pointer.next;
        }
        Node back = new Node();
        back.data = val;
        if (pointer.next==null){
            pointer.next = back;
        }
    }
    
    void insertAfter(Node head, int val, Node loc) {// creates new Node with data val after Node loc
        Node node = new Node();
        node.data = val;
        node.next=loc.next;
        loc.next = node;        
    }
    
    Node deleteFront(Node head) {// removes first Node; returns new head
        Node newHead = head.next;
        head = null;
        return newHead;
    }
    
    void deleteBack(Node head) {// removes last Node
        Node pointer = head;
        while (pointer.next!=null){
            pointer=pointer.next;
        }
        if (pointer.next==null){
            pointer = null;
        }
    }

    int length(Node head) {// returns length of the list
        int length = 0;
        Node pointer = head;
        while (pointer.next!=null){
            length+=1;
        }
        return length;
    }
    
    Node reverseIterative(Node head) {// reverses the linked list iteratively
        Node next = null;
        Node prev = null;
        Node curr = head;
        while (curr!=null){
            next = curr.next;
            prev = curr;
            curr.next = prev;
            curr = next;
        }
        return head;
    }

    Node reverseRecursive(Node head) {// reverses the linked list recursevely
        return head;
        //Missing
    }

}

/*
 * Q1
 * My question is about scope and local/global variables
 * When looking into a void function, if I take a head and put the head.next value inside it
 * Am I also messing up with the pointer of the head outside the function?
 * Summarizing: Do I need to create temporary Nodes for pointer?
 */