import java.util.HashMap;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance;
    private final Map<String, String> accessMap = new HashMap<>(); // (username, documentId) pairs

    private AccessControlService() {}

    public static synchronized AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess(String username, String documentId) {
        accessMap.put(documentId + ":" + username, "allowed");
    }

    public boolean isAllowed(String documentId, String username) {
        return accessMap.containsKey(documentId + ":" + username);
    }
}
