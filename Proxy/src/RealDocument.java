import java.time.LocalDate;

public class RealDocument implements Document {
    private final String identifier;
    private final LocalDate creationDate;
    private final String content;

    public RealDocument(String identifier, String content) {
        this.identifier = identifier;
        this.creationDate = LocalDate.now();
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getCreationDate() {
        return creationDate.toString();
    }

    public String getIdentifier() {
        return identifier;
    }
}