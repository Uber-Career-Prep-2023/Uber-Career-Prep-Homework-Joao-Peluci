package implementations;
public class Node {
    public int data;
    public Node next;
    public Node prev;
    public Node() {}
    public Node(int val) { this.data= val; }
    public Node(int val, Node next) { this.data = val; this.next = next; }
    public Node(int val, Node next, Node prev) { this.data = val; this.next = next; this.prev = prev;}
}

