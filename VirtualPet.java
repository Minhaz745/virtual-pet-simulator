
public class VirtualPet {
    private String name;
    private int hunger;
    private int happiness;
    private int energy;

    // Constructor
    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;
        this.happiness = 50;
        this.energy = 50;
    }

    // Methods to interact with the pet
    public void feed() {
        if (hunger > 0) {
            hunger -= 10;
            happiness += 5;
            System.out.println(name + " is eating. Hunger reduced!");
        } else {
            System.out.println(name + " is already full!");
        }
    }

    public void play() {
        if (energy > 10) {
            happiness += 10;
            energy -= 15;
            System.out.println(name + " is playing and is very happy!");
        } else {
            System.out.println(name + " is too tired to play.");
        }
    }

    public void sleep() {
        energy += 20;
        hunger += 5;
        System.out.println(name + " is sleeping. Energy restored!");
    }

    public void checkStatus() {
        System.out.println("\n--- " + name + "'s Status ---");
        System.out.println("Hunger: " + hunger + "/100");
        System.out.println("Happiness: " + happiness + "/100");
        System.out.println("Energy: " + energy + "/100");
    }

    // Method to handle pet's mood changes over time
    public void timePasses() {
        hunger += 5;
        happiness -= 5;
        energy -= 5;

        if (hunger > 100) hunger = 100;
        if (happiness < 0) happiness = 0;
        if (energy < 0) energy = 0;

        if (hunger == 100) {
            System.out.println(name + " is starving! Please feed it.");
        }
        if (happiness == 0) {
            System.out.println(name + " is very unhappy! Please play with it.");
        }
        if (energy == 0) {
            System.out.println(name + " is exhausted! Let it sleep.");
        }
    }
}
