class TextFieldB extends TextField {

    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("This is TextField B");
        System.out.println("| " + text + " |");
    }
}