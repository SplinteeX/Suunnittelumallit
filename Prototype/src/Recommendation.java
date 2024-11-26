import java.util.ArrayList;
import java.util.List;

class Recommendation {
    private String targetAudience;
    private List<Book> books;

    // Constructor
    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    // Copy Constructor for Cloning
    public Recommendation(Recommendation recommendation) {
        this.targetAudience = recommendation.targetAudience;
        this.books = new ArrayList<>();
        for (Book book : recommendation.books) {
            this.books.add(new Book(book)); // Cloning each book
        }
    }

    // Add a Book
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        String result = "Target Audience: " + targetAudience + "\nBooks:\n";
        if (books.isEmpty()) {
            result += "No books added yet.";
        } else {
            for (Book book : books) {
                result += book + "\n";
            }
        }
        return result;
    }
}