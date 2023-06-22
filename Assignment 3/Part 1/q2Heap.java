import java.util.ArrayList;
import java.util.List;

public class q2Heap {
    List<Integer> arr = new ArrayList<>();
    
    public int top(){ //returns the min (top) element in the heap
        return 0;
    }; 
    public void insert(int x){
        int index = 0;
        if(this.arr.size()==0){
            this.arr.add(x);
        }
        else{
            while (x>this.arr.indexOf(index)){
                
            }
        }
    };
    public void remove(){ //removes the min (top) element in the heap

    };
    public void heapify(){
        
    }

    public static void main(String[] args) {
        q2Heap heap = new q2Heap();

        // Insert elements into the heap
        heap.insert(5);
        heap.insert(8);
        heap.insert(3);
        heap.insert(10);
        heap.insert(1);

        // Print the top element
        System.out.println("Top element: " + heap.top()); // Expected output: 1

        // Remove the top element
        heap.remove();

        // Print the new top element
        System.out.println("New top element: " + heap.top()); // Expected output: 3
    }
}