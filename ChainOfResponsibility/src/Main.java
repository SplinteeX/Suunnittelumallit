public class Main {
    public static void main(String[] args) {
        Handler compensationHandler = new CompensationClaimHandler();
        Handler contactHandler = new ContactRequestHandler();
        Handler suggestionHandler = new DevelopmentSuggestionHandler();
        Handler feedbackHandler = new GeneralFeedbackHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(suggestionHandler);
        suggestionHandler.setNextHandler(feedbackHandler);

        Message message1 = new Message(Message.MessageType.COMPENSATION_CLAIM, "I want compensation for a damaged product.", "customer1@example.com");
        Message message2 = new Message(Message.MessageType.CONTACT_REQUEST, "Please contact me for further assistance.", "customer2@example.com");
        Message message3 = new Message(Message.MessageType.DEVELOPMENT_SUGGESTION, "I suggest adding more features to the product.", "customer3@example.com");
        Message message4 = new Message(Message.MessageType.GENERAL_FEEDBACK, "Great product, but can be improved.", "customer4@example.com");

        System.out.println("Processing messages:\n");
        compensationHandler.handle(message1);
        compensationHandler.handle(message2);
        compensationHandler.handle(message3);
        compensationHandler.handle(message4);
    }
}
