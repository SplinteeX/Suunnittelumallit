import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HistoryGui {
    private Controller controller;

    public HistoryGui(Controller controller) {
        this.controller = controller;
    }

    // Method to show the history of states
    public void showHistory() {
        Stage historyStage = new Stage();
        historyStage.initModality(Modality.APPLICATION_MODAL);
        historyStage.setTitle("History of States");

        // ListView to display the history of states
        ListView<String> listView = new ListView<>();
        for (int i = 0; i < controller.getHistorySize(); i++) {
            String stateMetadata = "State " + (i + 1) + ": " + controller.getHistoryMetadata(i);
            listView.getItems().add(stateMetadata);
        }

        // Button to restore the selected state
        Button restoreButton = new Button("Restore Selected State");
        restoreButton.setOnAction(event -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            if (selectedIndex != -1) {
                controller.restoreFromHistory(selectedIndex);
                historyStage.close();
            }
        });

        // Layout for the history window
        VBox layout = new VBox(10);
        layout.getChildren().addAll(listView, restoreButton);
        Scene scene = new Scene(layout, 300, 300);
        historyStage.setScene(scene);
        historyStage.show();
    }
}