package part2;
//20min
//Time complexity O(n)
//Space complexity O(n)

import part2.implementations.Node;

class q6DedupSortedList {
    public Node dedupNode(Node head) {
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
}