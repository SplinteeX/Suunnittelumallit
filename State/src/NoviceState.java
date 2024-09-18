public class NoviceState extends State {
    public NoviceState(Character character) {
        super(character);
    }

    @Override
    public void action() {
        System.out.println("You are a Novice! You can only train.");
        String[] options = {"Train"};
        if (this.getCharacter().readUserChoice(options) == 1) {
            this.getCharacter().gainExperience(10);
            checkLevelUp();
        }
    }

    private void checkLevelUp() {
        if (this.getCharacter().getExperience() >= 20) {
            System.out.println("You have advanced to Intermediate level!");
            this.getCharacter().setState(new IntermediateState(getCharacter()));
        }
    }
}