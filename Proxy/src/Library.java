import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Document> documents = new HashMap<>();

    public void addDocument(String id, Document document) {
        documents.put(id, document);
    }

    public void createUnprotectedDocument(String id, String content) {
        RealDocument document = new RealDocument(id, content);
        addDocument(id, document);
    }

    public Document createProtectedDocument(String id, String content) {
        RealDocument realDocument = new RealDocument(id, content);
        DocumentProxy proxy = new DocumentProxy(realDocument, AccessControlService.getInstance());
        addDocument(id, proxy);
        return proxy;
    }

    public Document getDocument(String id) {
        return documents.get(id);
    }
}
