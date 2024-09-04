class ButtonA extends Button {

    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("This is Button A");
        System.out.println("│ " + text + " │");
    }
}