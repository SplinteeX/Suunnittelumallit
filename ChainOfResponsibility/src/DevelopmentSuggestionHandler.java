public class DevelopmentSuggestionHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Logging development suggestion from: " + message.getSenderEmail());
        } else {
            super.handle(message);
        }
    }
}