import java.util.ArrayList;

public class q2Heap {
    int capacity = 8;
    ArrayList<Integer> heap = new ArrayList<>();

    public int top() { // returns the min (top) element in the heap
        return heap.get(0);
    };

    public void insert(int x) {
        heap.add(x);
        heapify();
    };

    public void remove() { // removes the min (top) element in the heap
        heap.remove(heap.size()-1);
        heapify();
    };
    public void heapify() {
        int child = heap.size()-1;
        int parent;

        // System.out.println("Iniciando funcao heapify");
        // System.out.println("Filho:"+heap.get(child));

        while (child != 0) {
            if (child % 2 != 0) {
                parent = (child - 1) / 2;
                // System.out.println("Filho impar, pai:"+parent);
            }
            else{
                parent = child / 2;
                // System.out.println("Filho par, Pai:"+parent);
            }

            if (heap.get(parent) > heap.get(child)) {
                // System.out.println("Invertendo a posicao");
                int tmp = heap.get(child);
                heap.set(child, heap.get(parent));
                heap.set(parent, tmp);
            }
            child = parent;
        }
    }

    public static void main(String[] args) {
        q2Heap heap = new q2Heap();
          
        heap.insert(42);
        heap.insert(31);
        heap.insert(10);
        heap.insert(35);
        heap.insert(44);
        heap.insert(14);
        heap.insert(33);
        heap.insert(26);
        heap.insert(27);
        heap.insert(19);
        for (Integer i : heap.heap) {
                System.out.println(i);
        }


        // Print the top element
        // System.out.println("Top element: " + heap.top()); // Expected output: 1

        // Remove the top element
        // heap.remove();

        // Print the new top element
        // System.out.println("New top element: " + heap.top()); // Expected output: 3
    }
}