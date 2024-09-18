public class Game {
    public static void main(String[] args) {
        Character character = new Character("Hero");

        while (!(character.getState() instanceof MasterState)) {
            System.out.println("\nCharacter Status: ");
            System.out.println("Name: " + character.getName());
            System.out.println("Experience: " + character.getExperience());
            System.out.println("Health: " + character.getHealth());
            character.performAction();
        }
        System.out.println("Game Over. You have reached the Master level.");
    }
}