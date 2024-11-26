public class Main {
    public static void main(String[] args) {
        // Create a Recommendation
        Recommendation rec1 = new Recommendation("Young Adults");
        rec1.addBook(new Book("Harry Potter", "J.K. Rowling"));
        rec1.addBook(new Book("The Hunger Games", "Suzanne Collins"));

        // Clone the Recommendation
        Recommendation rec2 = new Recommendation(rec1);
        rec2.addBook(new Book("Divergent", "Veronica Roth"));

        // Print Both Recommendations
        System.out.println("Original Recommendation:\n" + rec1);
        System.out.println("\nCloned and Modified Recommendation:\n" + rec2);
    }
}