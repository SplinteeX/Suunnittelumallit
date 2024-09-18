public class IntermediateState extends State {
    public IntermediateState(Character character) {
        super(character);
    }

    @Override
    public void action() {
        System.out.println("You are an Intermediate! You can train or meditate.");
        String[] options = {"Train", "Meditate"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().gainExperience(15);
                break;
            case 2:
                this.getCharacter().gainHealth(5);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        checkLevelUp();
    }

    private void checkLevelUp() {
        if (this.getCharacter().getExperience() >= 50) {
            System.out.println("You have advanced to Expert level!");
            this.getCharacter().setState(new ExpertState(getCharacter()));
        }
    }
}