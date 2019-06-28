package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    protected static ObservableList<String> data = FXCollections.observableArrayList();

    @FXML
    private ListView<String> life_listview = new ListView<String>();;

    @FXML
    private Pane addRecord_interface;

    @FXML
    private void makeAddRecordVisiable(){
        addRecord_interface.setVisible(true);
    }
    @FXML
    private void makeShowStatsVisiable(){

    }
    @FXML
    private void deleteRecord(){
        int selectedIndex = life_listview.getSelectionModel().getSelectedIndex();
        data.remove(selectedIndex);
        System.out.println(data);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        data =FXCollections.observableArrayList (
                "example");
        life_listview.setItems(data);
    }
}
