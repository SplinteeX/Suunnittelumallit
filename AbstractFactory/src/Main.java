public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();

        Button button = factory.createButton("Click Me");
        TextField textField = factory.createTextField("Enter Text");
        Checkbox checkbox = factory.createCheckbox("Accept Terms");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("New Button Text");
        textField.setText("New TextField Text");
        checkbox.setText("New Checkbox Text");

        System.out.println("\nAfter text change:");
        button.display();
        textField.display();
        checkbox.display();

        factory = new BFactory();

        button = factory.createButton("Submit");
        textField = factory.createTextField("Type Here");
        checkbox = factory.createCheckbox("I agree");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("Confirmed");
        textField.setText("Updated Field");
        checkbox.setText("Confirmed Agreement");

        System.out.println("\nAfter text change:");
        button.display();
        textField.display();
        checkbox.display();
    }
}