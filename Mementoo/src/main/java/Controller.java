import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> redoHistory; // Redo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        redoHistory.clear(); // Clear redo history after a new change
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
        redoHistory.clear(); // Clear redo history after a new change
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            // Save the current state to redo history before undoing
            IMemento currentState = model.createMemento();
            redoHistory.add(currentState);

            // Undo the last action
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            // Save the current state to history before redoing
            IMemento currentState = model.createMemento();
            history.add(currentState);

            // Redo the last undone action
            IMemento previousState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    public int getHistorySize() {
        return history.size();
    }

    public String getHistoryMetadata(int index) {
        if (index >= 0 && index < history.size()) {
            IMemento memento = history.get(index);
            return "Saved Time: " + memento.getSavedTime();
        }
        return "";
    }

    // Restore from history and allow subsequent redo action
    public void restoreFromHistory(int index) {
        if (index >= 0 && index < history.size()) {
            IMemento currentState = model.createMemento();
            redoHistory.add(currentState);

            IMemento memento = history.get(index);
            model.restoreState(memento);
            gui.updateGui();
        }
    }
}