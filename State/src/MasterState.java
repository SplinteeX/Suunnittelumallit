public class MasterState extends State {
    public MasterState(Character character) {
        super(character);
    }

    @Override
    public void action() {
        System.out.println("You have reached the Master level! The game is over.");
        // The game ends here, so no further actions
    }
}