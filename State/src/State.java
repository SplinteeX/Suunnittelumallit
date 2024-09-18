public abstract class State {
    private Character character;

    public State(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public abstract void action();
}