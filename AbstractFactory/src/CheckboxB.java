class CheckboxB extends Checkbox {

    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[X] This is CheckBox B - " + text);
    }
}