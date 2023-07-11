package implementation;


public class Path {
        String destination;
        double time;

        public Path(String d, double t) {
            this.destination = d;
            this.time = t;
        }

        public String getDestination() {
            return destination;
        }

        public double getTime() {
            return time;
        }

        
    }
