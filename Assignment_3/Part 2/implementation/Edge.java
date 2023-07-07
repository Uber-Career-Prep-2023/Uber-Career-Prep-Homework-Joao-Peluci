package implementation;


public class Edge {
        char origin;
        char destination;
        String color;

        public Edge(char o, char d, String c) {
            this.origin = o;
            this.destination = d;
            this.color = c;
        }

        public char getOrigin() {
            return origin;
        }

        public char getDestination() {
            return destination;
        }

        public String getColor() {
            return color;
        }

        
    }
