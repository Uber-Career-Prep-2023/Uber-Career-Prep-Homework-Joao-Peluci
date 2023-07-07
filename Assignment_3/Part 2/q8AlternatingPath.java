import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import implementation.Edge;

//Time elapsed: 120min. Tried hard because I had a great learning time with this question and didn't want to give up
//Working, but I think with errors
//Time complexity: O(N)
//Space Complexity: O(N)
//Method used: Hashmap and Queue


public class q8AlternatingPath {

    public static int shortestPath(char origin, char destination, HashMap<Character, ArrayList<Edge>> map) {
        Queue<Character> queueBlue = new LinkedList<>();
        Queue<Character> queueRed = new LinkedList<>();
        String colorBlue = "blue";
        String colorRed = "red";
        int shortestBlue = 1;
        int shortestRed = 1;
        boolean foundBlue = false;
        boolean foundRed = false;
        queueBlue.add(origin);
        queueRed.add(origin);

        while (!queueBlue.isEmpty()) {// Looks up to paths we can go with first path being blue
            Character current = queueBlue.poll();
            ArrayList<Edge> array = map.get(current);
            if (current == destination) {
                foundBlue = true;
                break;
            }
            for (Edge edge : array) {
                if (edge.getColor() != colorBlue) {
                    shortestBlue++;
                    queueBlue.add(edge.getDestination());
                }
            }
        }
        while (!queueRed.isEmpty()) {// Looks up to paths we can go with first path being Red
            Character current = queueRed.poll();
            ArrayList<Edge> array = map.get(current);
            if (current == destination) {
                foundRed = true;
                break;
            }
            for (Edge edge : array) {
                if (edge.getColor() != colorRed) {
                    shortestRed++;
                    queueRed.add(edge.getDestination());
                }
            }
        }
        if (foundRed && foundBlue) {
            return Integer.min(shortestRed, shortestBlue);
        } else if (foundBlue) {
            return shortestBlue;
        } else if (foundRed) {
            return shortestRed;
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();

        Edge e1 = new Edge('A', 'B', "blue");
        Edge e2 = new Edge('A', 'C', "red");
        Edge e3 = new Edge('B', 'D', "blue");
        Edge e4 = new Edge('B', 'E', "blue");
        Edge e5 = new Edge('C', 'B', "red");
        Edge e6 = new Edge('D', 'C', "blue");
        Edge e7 = new Edge('A', 'D', "red");
        Edge e8 = new Edge('D', 'E', "red");
        Edge e9 = new Edge('E', 'C', "red");

        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        edges.add(e5);
        edges.add(e6);
        edges.add(e7);
        edges.add(e8);
        edges.add(e9);

        HashMap<Character, ArrayList<Edge>> map = new HashMap<>();
        for (Edge edge : edges) { // Filling the Map used as entry in function
            if (!map.containsKey(edge.getOrigin())) {
                ArrayList<Edge> e = new ArrayList<>();
                e.add(edge);
                map.put(edge.getOrigin(), e);
            } else {
                ArrayList<Edge> e = map.get(edge.getOrigin());
                e.add(edge);
                map.put(edge.getOrigin(), e);
            }
        }
        System.out.println(shortestPath('A', 'D', map));
        System.out.println(shortestPath('E', 'D', map));
    }
}
