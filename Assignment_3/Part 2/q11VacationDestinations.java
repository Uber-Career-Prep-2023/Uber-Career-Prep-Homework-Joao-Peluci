import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import implementation.Path;

public class q11VacationDestinations {

    // Q11. VacationDestinations
    // Given an origin city, a maximum travel time k, and pairs of destinations that
    // can be reached directly from each other with corresponding travel times in
    // hours, return the number of destinations within k hours of the origin. Assume
    // that having a stopover in a city adds an hour of travel time.

    public static int vacationDestinations(String origin, double k, Map<String, ArrayList<Path>> map) {
        Stack<Path> stack = new Stack<>();
        Path originPath = new Path(origin, 0);
        stack.add(originPath);
        ArrayList<String> destinations = new ArrayList<>();
        int stopTime = 0;
        while (!stack.isEmpty()) {
            Path current = stack.pop();
            if (current.getDestination() != origin) {
                destinations.add(current.getDestination());
                stopTime = 1;
            }
            if (map.get(current.getDestination()) != null) {
                ArrayList<Path> search = map.get(current.getDestination());
                for (Path path : search) {
                    if (path.getTime() + current.getTime() + stopTime <= k) {
                        Path temp = new Path(path.getDestination(), path.getTime() + stopTime + current.getTime());
                        stack.add(temp);
                    }
                }
            }
        }
        return destinations.size();
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Path>> map = new HashMap<>();

        // Input
        map.put("Boston", new ArrayList<>());
        map.get("Boston").add(new Path("Newport", 1.5));
        map.get("Boston").add(new Path("Portland", 2.5));

        map.put("New York", new ArrayList<>());
        map.get("New York").add(new Path("Philadelphia", 2));
        map.get("New York").add(new Path("Boston", 4));

        map.put("Philadelphia", new ArrayList<>());
        map.get("Philadelphia").add(new Path("Washington, D.C.", 2.5));

        map.put("Washington, D.C.", new ArrayList<>());
        map.get("Washington, D.C.").add(new Path("Harper's Ferry", 1));

        int dest5 = vacationDestinations("New York", 5, map);
        int dest7 = vacationDestinations("New York", 7, map);
        int dest8 = vacationDestinations("New York", 8, map);

        System.out.println(dest5);
        System.out.println(dest7);
        System.out.println(dest8);
        // !!! The example in homework has a mistaken output number.
    }
}
