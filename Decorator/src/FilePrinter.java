import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FilePrinter extends BasicPrinter {
    private String FileName;

    public FilePrinter(Printer printer) {
        this.FileName = "Output.txt";
    }

    @Override
    public void print(String text) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(FileName, true), true);
            writer.println(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }







}