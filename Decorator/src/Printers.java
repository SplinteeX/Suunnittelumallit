public class Printers {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello World!");

        Printer filePrinter = new FilePrinter(new BasicPrinter());
        filePrinter.print("This is written to a file.");

        Printer encryptedPrinter = new EncryptedPrinter(new BasicPrinter());
        encryptedPrinter.print("This is encrypted!");

        Printer encryptedFilePrinter = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        encryptedFilePrinter.print("This is encrypted and written to a file.");
    }
}