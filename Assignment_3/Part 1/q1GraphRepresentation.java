import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class q1GraphRepresentation{
    
    public static Map<Integer,Set<Integer>> adjacencySet(int[][] edges){
        Map<Integer,Set<Integer>> result = new HashMap<>();
        //edges[i][0] - first int of tuple
        //edges[i][1] - second int of tuple
        for (int i = 0; i < edges.length; i++) {
            if (result.containsKey(edges[i][0])){
                Set<Integer> temp = result.get(edges[i][0]); //Restores the value of the existing set
                temp.add(edges[i][1]); //Put inside the set new value
                result.put(edges[i][0], temp);
            }
            else{ //The key doesn't exist yet
                Set<Integer> temp = new HashSet<>(); //Creates new set 
                temp.add(edges[i][1]); //Stores the value inside set
                result.put(edges[i][0], temp);
            }
        }
        return result;
    };

    public static void print(Map<Integer, Set<Integer>> graph){
        for (int vertex : graph.keySet()) {
            System.out.println(vertex + ": " + graph.get(vertex));
        }
    };

    public static boolean bfs(int target, Map<Integer, Set<Integer>> graph){
        Set<Integer> visited = new HashSet<>(); //Store already visited nodes
        Integer firstNode = graph.keySet().iterator().next(); //Picks node to visit
        Queue<Integer> q = new LinkedList<>(); //For order vsisits
        q.offer(firstNode);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            visited.add(curr);
            
            if (curr==target){ //If key found is target
                return true;
            }
            
            for (int v : graph.get(curr)) { //Enter the node
                if(!visited.contains(v))
                    q.offer(v); //Concatenate the vertex associate with node
            }
        }
        return false;
    };

    public static boolean dfs(int target, Map<Integer, Set<Integer>> graph){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> s = new Stack<>();
        //To make a working Depth First Search, we'll need to use a stack to
        //Keep track of which nodes weren't fully explored
        
        //Visit first node
        int firstNode = graph.keySet().iterator().next();
        s.push(firstNode);
        while (!s.isEmpty()){

            int currNode = s.pop();
            visited.add(currNode);

            if (currNode==target) return true;

            for (int vertex : graph.get(currNode)) {
                if (!visited.contains(vertex))
                    s.push(vertex);
            }
        }
        return false;
    };

    public static ArrayList<Integer> topologicalSort(Map<Integer, Set<Integer>> graph){
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> s = new Stack<>();
        //To make a working Depth First Search, we'll need to use a stack to
        //Keep track of which nodes weren't fully explored
        
        //Visit first node
        int firstNode = graph.keySet().iterator().next();
        s.push(firstNode);
        while (!s.isEmpty()){
            int currNode = s.pop();
            visited.add(currNode);
            result.add(currNode);
            for (int vertex : graph.get(currNode)) {
                if (!visited.contains(vertex))
                    s.push(vertex);
            }
        }
        return result;
    };

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}, {3, 0}};        
        Map<Integer, Set<Integer>> adjacencySet = adjacencySet(edges);

        //1. Test adjacencySet function
        print(adjacencySet);
        
        //2. Test BFS
        // System.out.println(bfs(7, adjacencySet));

        //3. Test DFS
        // System.out.println(dfs(5, adjacencySet));

        //4. Topological sort
        // System.out.println(topologicalSort(adjacencySet));
    }
}