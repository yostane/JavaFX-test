package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public ListView itemListView;
    public Label selectedLabel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList (
                "Single", "Double", "Suite", "Family App");
        itemListView.setItems(items);
    }

    public void onButtonClick(ActionEvent actionEvent) {
        selectedLabel.setText(itemListView.getSelectionModel().getSelectedItem().toString());
    }
}
