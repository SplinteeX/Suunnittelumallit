import java.text.SimpleDateFormat;
import java.util.Date;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private String savedTime;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone();
        this.isSelected = isSelected;
        this.savedTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public int[] getOptions() {
        return options;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    @Override
    public String getSavedTime() {
        return savedTime;
    }
}