public class CompensationClaimHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.COMPENSATION_CLAIM) {
            System.out.println("Handling compensation claim for: " + message.getSenderEmail());
        } else {
            super.handle(message);
        }
    }
}