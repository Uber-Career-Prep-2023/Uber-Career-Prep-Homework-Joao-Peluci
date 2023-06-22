import java.util.ArrayList;

public class q3PriorityQueue {
    public static class Entry{
        int weight;
        String value;
        Entry(int w, String v){
            weight=w;
            value = v;
        };
    }
    ArrayList<Entry> heap = new ArrayList<>();

    public String top() { // returns the min (top) element in the heap
        return heap.get(0).value;
        
    };

    public void insert(Entry e) {
        heap.add(e);
        heapify();
    };

    public void remove() { // removes the min (top) element in the heap
        System.out.println("Removing: "+heap.get(heap.size()-1).value);
        heap.remove(heap.size()-1);
        heapify();
    };
    public void heapify() {
        int child = heap.size()-1;
        int parent;

        while (child != 0) {
            if (child % 2 != 0) {
                parent = (child - 1) / 2;
            }
            else{
                parent = child / 2;
            }

            if (heap.get(parent).weight < heap.get(child).weight) {
                Entry tmp = heap.get(child);
                heap.set(child, heap.get(parent));
                heap.set(parent, tmp);
            }
            child = parent;
        }
    }

    public static void main(String[] args) {
        q3PriorityQueue heap = new q3PriorityQueue();
        Entry e1 = new Entry(0, "Num 0");
        Entry e2 = new Entry(10, "Num 10");
        Entry e3 = new Entry(22, "Num 22");
        Entry e4 = new Entry(100, "Num 100");
        Entry e5 = new Entry(3, "Num 3");
        Entry e6 = new Entry(72, "Num 72");
        Entry e7 = new Entry(9, "Num 9");
        
        heap.insert(e1);
        heap.insert(e2);
        heap.insert(e3);
        heap.insert(e4);
        heap.insert(e5);
        heap.insert(e6);
        heap.insert(e7);

        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();  

        for (Entry e : heap.heap) {
                System.out.println(e.value);
        }
    }
}