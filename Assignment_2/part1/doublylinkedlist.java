public class doublylinkedlist {
    Node head;
    public class Node{
        Node next;
        Node prev;
        int data;
        Node (int value){
            data = value;
            next = null;
            prev = null;
        }
    }
Node insertAtFront(Node head, int val) // creates new Node with data val at front; returns new head
{
    Node node = new Node(val);
    node.next = head;
    head.prev = node;
    head = node;
    return head;
};

void insertAtBack(Node head, int val) // creates new Node with data val at end
{
    	Node node = new Node(val);
        Node tailing = head;
        while (tailing.next!=null){
            tailing = tailing.next;
        }
        if (tailing.next==null){
            node.prev = tailing;
            tailing.next = node;    
        }
};
void insertAfter(Node head, int val, Node loc) // creates new Node with data val after Node loc
{
    Node node = new Node(val);
    node.next = loc.next;
    node.prev = loc;
    loc.next = node;
}
Node deleteFront(Node head) // removes first Node; returns new head
{
    Node newHead = head.next;
    head = null;
    return newHead;
}
void deleteBack(Node head) // removes last Node
{
    Node tailing = head;
    while (tailing.next!=null)
    {
        tailing = tailing.next;
    }
    if (tailing.next==null)
    {
        tailing = null;
    }
}
Node deleteNode(Node head, Node loc) // deletes Node loc; returns head
{
    loc.prev.next = loc.next;
    loc.next.prev = loc.prev;
    loc = null;
    return head;
}
int length(Node head) // returns length of the list
{   
    Node tailing = head;
    int length = 0;
    while(tailing.next!=null){
        tailing = tailing.next;
        length++;
    }
    return length;
}
Node reverseIterative(Node head) // reverses the linked list iteratively
{
    Node curr = head;
    Node next = null;
    while(curr.next!=null){
        next = curr.next;
        curr.next = curr.prev;
        curr.prev = next;
        curr = next;
    }
    return curr;
}



Node reverseRecursive(Node head){ // reverses the linked list recursively (Hint: you will need a helper function)
//Missing
return head;
}
}