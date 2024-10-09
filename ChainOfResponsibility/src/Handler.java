public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Message message) {
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}