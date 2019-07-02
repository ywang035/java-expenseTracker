package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Callback;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

// controller for [main] scene
// including a list view and 3 buttons
public class MainController implements Initializable {

    protected static ObservableList<Text> dataList = FXCollections.observableArrayList();

    @FXML
    private ListView<Text> life_listview = new ListView<Text>();;
    @FXML
    private Pane add_interface;
    @FXML
    private Pane stats_interface;

    @FXML
    private void makeAddRecordVisiable(){
        stats_interface.setVisible(false);
        add_interface.setVisible(true);
    }

    @FXML
    private void makeShowStatsVisiable(){
        add_interface.setVisible(false);
        stats_interface.setVisible(true);
        StatsController sc = new StatsController();
        sc.getList();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        readDataCSV();
        life_listview.setItems(dataList);
    }

    // method to read CSV file when opened
    private static void readDataCSV(){
        File file = new File("record.csv");

        if(file.exists()){ // file exist, start reading
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String rowData;

                while((rowData = reader.readLine())!=null){

                    if(rowData.charAt(0) == '-'){
                        Text txt = new Text();
                        txt.setText(rowData);
                        txt.setFill(Color.RED);
                        dataList.add(txt);
                    }else{
                        Text txt = new Text();
                        txt.setText(rowData);
                        txt.setFill(Color.GREEN);
                        dataList.add(txt);
                    }

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{ // file not exist, create one
            try {
                Writer writer = new BufferedWriter(new FileWriter(file)); // create file
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // method to update and save CSV when list view is updated with add/delete transaction
    protected static void updateDataCSV(){
        try {



            FileWriter writer = new FileWriter("record.csv");

            for (Text row : dataList) {
                writer.write(row.getText()+"\n");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // method to delete a transaction
    @FXML
    private void deleteRecord(){
        int selectedIndex = life_listview.getSelectionModel().getSelectedIndex();
        if(selectedIndex >= 0){
            dataList.remove(selectedIndex);
        }
        updateDataCSV();
    }

}
