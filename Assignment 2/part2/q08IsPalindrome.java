package part2;

import part2.implementations.Node;

public class q8IsPalindrome {
    //Given a doubly linked list, determine if it is a palindrome.
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
    

}
