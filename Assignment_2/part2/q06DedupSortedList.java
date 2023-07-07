//20min
//Time complexity O(n)
//Space complexity O(n)

import implementations.Node;

class q06DedupSortedList {
    public static Node dedupNode(Node head) {
        Node node = head; // Iterates over node
        while (node != null && node.next != null) {
            if (node.data != node.next.data) {
                node = node.next;
            } else {// Skips next node
                node.next = node.next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
    
        Node.printList(dedupNode(head));
    }
    

}