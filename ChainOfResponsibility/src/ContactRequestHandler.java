public class ContactRequestHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.CONTACT_REQUEST) {
            System.out.println("Forwarding contact request from: " + message.getSenderEmail());
        } else {
            super.handle(message);
        }
    }
}