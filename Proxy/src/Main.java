public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        AccessControlService accessControlService = AccessControlService.getInstance();

        // Create unprotected documents
        library.createUnprotectedDocument("doc1", "This is an unprotected document.");
        library.createUnprotectedDocument("doc2", "This is another unprotected document.");

        // Create protected documents
        Document protectedDoc1 = library.createProtectedDocument("doc3", "This is a protected document.");

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Grant access to Alice for doc3 by document ID
        accessControlService.grantAccess(user1.getUsername(), "doc3");

        // User access examples
        try {
            UserContext.setUsername(user1.getUsername());
            System.out.println("User: " + user1.getUsername() + " accessed: " + protectedDoc1.getContent());
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        } finally {
            UserContext.clear();
        }

        try {
            UserContext.setUsername(user2.getUsername());
            System.out.println("User: " + user2.getUsername() + " accessed: " + protectedDoc1.getContent());
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        } finally {
            UserContext.clear();
        }

        // Access unprotected document
        Document unprotectedDoc1 = library.getDocument("doc1");
        System.out.println("Unprotected Document Content: " + unprotectedDoc1.getContent());
    }
}
