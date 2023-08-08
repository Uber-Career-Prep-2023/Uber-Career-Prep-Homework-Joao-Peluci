import java.util.LinkedList;
import java.util.Queue;

public class q9AdoptAPet {
    // An animal shelter that houses cats and dogs wants to ensure no pet has to
    // wait too long for a forever home. Therefore, anyone who comes to adopt a pet
    // can pick the species (cat or dog) but not the specific animal; they are
    // assigned the animal of that species that has been in the shelter longest. If
    // there are no animals available of the desired species, they must take the
    // other species. You are given a list of pets in the shelter with their names,
    // species, and time in the shelter at the start of a week. You receive a
    // sequence of incoming people (to adopt pets) and animals (new additions to the
    // shelter) one at a time. Print the names and species of the pets as they are
    // adopted out.
    Queue<Pet> queueCat = new LinkedList<>();
    Queue<Pet> queueDog = new LinkedList<>();

    public void addPet(Pet p) {
        if (p.type == "dog") {
            queueDog.add(p);
        } else if (p.type == "cat") {
            queueCat.add(p);
        }
    }

    public void adoptAPet(Person p) {
        Pet adopted = new Pet();
        if (p.preference == "dog") {
            if (queueDog.isEmpty()) {
                adopted = queueCat.poll();
            } else {
                adopted = queueDog.poll();
            }
        }

        else if (p.preference == "cat") {
            if (queueCat.isEmpty()) {
                adopted = queueDog.poll();
            } else {
                adopted = queueCat.poll();
            }
        }
        System.out.println(adopted.name + ", " + adopted.type);

    }

    public static class Pet {
        String name;
        String type;
        int shelterTime;

        Pet() {
        }

        Pet(String n, String t, int s) {
            this.name = n;
            this.type = t;
            this.shelterTime = s;
        }

    }

    public static class Person {
        String name;
        String preference;

        Person(String n, String p) {
            this.name = n;
            this.preference = p;
        }

    }

    public static void main(String[] args) {
        //100% done
        //Strategy: mantain two queues
        // Time complexity O(1)
        // Space complexity O(n)
        //Time elapsed: 24min
        q9AdoptAPet solution = new q9AdoptAPet();
        Pet pet = new Pet("Sadie", "dog", 4);
        solution.addPet(pet);
        pet = new Pet("Woof", "cat", 7);
        solution.addPet(pet);
        pet = new Pet("Chirpy", "dog", 2);
        solution.addPet(pet);
        pet = new Pet("Lola", "dog", 1);
        solution.addPet(pet);
        // Adoption 1
        Person person = new Person("Bob", "dog");
        solution.adoptAPet(person);

        // New pet
        pet = new Pet("Floofy", "cat", 1);
        solution.addPet(pet);

        // Adoption 2
        person = new Person("Sally", "cat");
        solution.adoptAPet(person);

        // Adoption 3
        person = new Person("Ji", "cat");
        solution.adoptAPet(person);

        // Adoption 4
        person = new Person("Ali", "dog");
        solution.adoptAPet(person);
    }
}
