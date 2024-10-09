public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.GENERAL_FEEDBACK) {
            System.out.println("Analyzing general feedback from: " + message.getSenderEmail());
        } else {
            super.handle(message);
        }
    }
}