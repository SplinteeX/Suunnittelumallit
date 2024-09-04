class ButtonB extends Button {

    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("This is button B");
        System.out.println("* " + text + " *");
    }
}