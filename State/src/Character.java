public class Character {
    private String name;
    private int experience;
    private int health;
    private State state;

    public Character(String name) {
        this.name = name;
        this.experience = 0;
        this.health = 100;
        this.state = new NoviceState(this);  // Start as Novice
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for experience
    public int getExperience() {
        return experience;
    }

    // Method to gain experience
    public void gainExperience(int amount) {
        experience += amount;
        System.out.println("Gained " + amount + " experience. Total experience: " + experience);
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Method to gain health
    public void gainHealth(int amount) {
        health += amount;
        if (health > 100) {
            health = 100;
            System.out.println("Health is full.");
        } else {
            System.out.println("Gained " + amount + " health. Total health: " + health);
        }
    }

    // Method to take damage
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println("Took " + amount + " damage. Total health: " + health);
    }

    // Method to change the state (level) of the character
    public void setState(State state) {
        this.state = state;
    }

    // Method to get the current state (to check the level)
    public State getState() {
        return this.state;
    }

    // Method to perform the action based on the current state
    public void performAction() {
        state.action();
    }

    // Simulating user input (can be replaced with actual input)
    public int readUserChoice(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }
}
