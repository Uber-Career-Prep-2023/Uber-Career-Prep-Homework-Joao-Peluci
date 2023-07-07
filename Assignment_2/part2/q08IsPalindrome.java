import implementations.Node;

public class q08IsPalindrome {
    //Given a doubly linked list, determine if it is a palindrome.
    //Doubly linked list forward-backward two-pointer
    //10min
    //Time Complexity O(2*n)
    //Space Complexity O(2*n)
    public static boolean isPalindrome(Node head) {
        Node backwards = new Node();
        Node forwards = new Node();
        backwards = head;
        forwards = head;
        
        //Advance the pointer until the end of list
        while (backwards.next!=null){
            backwards = backwards.next;
        }    
        
        while (forwards.next!=null){
            if (forwards.data == backwards.data){
                forwards=forwards.next;
                backwards=backwards.prev;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(1);
    
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;
    
        boolean isPalindrome = isPalindrome(node1);
    
        if (isPalindrome) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }
    }
    

}
