class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Copy Constructor for Cloning
    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author;
    }
}