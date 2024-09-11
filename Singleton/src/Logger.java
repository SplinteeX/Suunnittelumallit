import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Logger {
    private static Logger instance;
    private PrintWriter writer;
    private String fileName;

    private Logger() {
        this.fileName = "DefaultLog.txt";
        openFile();
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    private void openFile() {
        try {
            writer = new PrintWriter(new FileWriter(fileName, true), true);
        } catch (IOException e) {
            System.out.println("Error opening the log file: " + e.getMessage());
        }

    }
    public void setFileName(String newFileName) {
        if (writer != null) {
            writer.close();
        }
        this.fileName = newFileName;
        openFile();
    }
    public void write(String message) {
        if (writer != null) {
            writer.println(message);
        } else {
            System.out.println("Error: Log file not opened");
        }
    }
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
