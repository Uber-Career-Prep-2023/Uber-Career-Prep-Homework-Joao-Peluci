import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

// Question 10: PrerequisiteCourses
// Given a list of courses that a student needs to take to complete 
// their major and a map of courses to their prerequisites, return 
// a valid order for them to take their courses assuming they onlytake
// one course for their major at once.

// Time Complexity: O(n)
// Space Complexity: O(n)
// Technique: Hashmap, Stack, Queue
// Time elapsed: 50min

public class q10PrerequisiteCourses {

    public static Queue<String> prerequisiteCourses(HashMap<String, ArrayList<String>> map, ArrayList<String> courses) {
        Queue<String> queue = new ArrayDeque<>();
        Stack<String> stack = new Stack<>();

        for (String string : courses) {
            stack.add(string);
        }

        while (!stack.isEmpty()) {
            String curr = stack.pop();
            // System.out.println(curr);
            if (queue.contains(curr)) {
                // System.out.println("A fila ja contem o elemento: " + curr);
                continue;
            } else if (!map.containsKey(curr)) { // Subject has no prerequisites
                queue.add(curr);
                // System.out.println("O elemento '" + curr + "' acaba de ser adicionado na
                // fila");
            } else {
                ArrayList<String> addToQueue = map.get(curr);
                // if (addToQueue.size() > 0) {
                // stack.add(curr);
                // }
                for (String element : addToQueue) {
                    if (!queue.contains(element)) {
                        queue.add(element);
                        // System.out.println("Adicionando prerequisito '" + element + "'");

                    }
                }
                queue.add(curr);
                // System.out.println("O elemento '" + curr + "', com prerequisitos, acaba de
                // ser adicionado na fila");

            }
        }
        return queue;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Intro to Programming");
        courses.add("Databases");
        courses.add("Operating Systems");
        courses.add("Advanced Algorithms");
        courses.add("Data Structures");

        map.put("Data Structures", new ArrayList<>());
        map.put("Advanced Algorithms", new ArrayList<>());
        map.put("Operating Systems", new ArrayList<>());
        map.put("Databases", new ArrayList<>());

        map.get("Data Structures").add("Intro to Programming");
        map.get("Advanced Algorithms").add("Data Structures");
        map.get("Operating Systems").add("Advanced Algorithms");
        map.get("Databases").add("Advanced Algorithms");

        Queue<String> result = prerequisiteCourses(map, courses);

        for (String string : result) {
            System.out.println(string);
        }

        HashMap<String, ArrayList<String>> map2 = new HashMap<>();
        ArrayList<String> courses2 = new ArrayList<>();

        courses2.add("Intro to Writing");
        courses2.add("Contemporary Literature");
        courses2.add("Ancient Literature");
        courses2.add("Comparative Literature");
        courses2.add("Plays & Screenplays");

        map2.put("Contemporary Literature", new ArrayList<>());
        map2.put("Ancient Literature", new ArrayList<>());
        map2.put("Comparative Literature", new ArrayList<>());
        map2.put("Plays & Screenplays", new ArrayList<>());

        map2.get("Contemporary Literature").add("Intro to Writing");
        map2.get("Ancient Literature").add("Intro to Writing");
        map2.get("Comparative Literature").add("Ancient Literature");
        map2.get("Comparative Literature").add("Contemporary Literature");
        map2.get("Plays & Screenplays").add("Intro to Writing");

        Queue<String> result2 = prerequisiteCourses(map2, courses2);

        for (String string : result2) {
            System.out.println(string);
        }

    }
}
