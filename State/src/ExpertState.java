public class ExpertState extends State {
    public ExpertState(Character character) {
        super(character);
    }

    @Override
    public void action() {
        System.out.println("You are an Expert! You can train, meditate, or fight.");
        String[] options = {"Train", "Meditate", "Fight"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().gainExperience(20);
                break;
            case 2:
                this.getCharacter().gainHealth(10);
                break;
            case 3:
                System.out.println("You engage in a fight!");
                this.getCharacter().takeDamage(10);
                this.getCharacter().gainExperience(25);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        checkLevelUp();
    }

    private void checkLevelUp() {
        if (this.getCharacter().getExperience() >= 100) {
            System.out.println("Congratulations! You have reached Master level!");
            this.getCharacter().setState(new MasterState(getCharacter()));
        }
    }
}