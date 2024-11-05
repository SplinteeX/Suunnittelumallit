public class DocumentProxy implements Document {
    private final RealDocument realDocument;
    private final AccessControlService accessControlService;

    public DocumentProxy(RealDocument realDocument, AccessControlService accessControlService) {
        this.realDocument = realDocument;
        this.accessControlService = accessControlService;
    }

    @Override
    public String getContent() throws AccessDeniedException {
        String username = UserContext.getUsername();
        if (accessControlService.isAllowed(realDocument.getIdentifier(), username)) {
            return realDocument.getContent();
        } else {
            throw new AccessDeniedException("Access denied to document: " + realDocument.getIdentifier());
        }
    }

    @Override
    public String getCreationDate() {
        return realDocument.getCreationDate();
    }
}
