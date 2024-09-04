class CheckboxA extends Checkbox {

    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ ] This is checkBox A - " + text);
    }
}