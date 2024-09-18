import java.util.Base64;

public class EncryptedPrinter extends BasicPrinter {
    private Printer printer;

    public EncryptedPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        String encryptedText = encrypt(text);
        printer.print(encryptedText);
    }

    private String encrypt(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    public String decrypt(String encryptedText) {
        return new String(Base64.getDecoder().decode(encryptedText));
    }
}
