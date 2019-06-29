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
import java.util.ResourceBundle;

public class MainController implements Initializable {

//    protected static ObservableList<String> data = FXCollections.observableArrayList();
    protected static ObservableList<Text> data = FXCollections.observableArrayList();

    @FXML
    private ListView<Text> life_listview = new ListView<Text>();;

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
        if(selectedIndex >= 0){
            data.remove(selectedIndex);
        }
        updateDataCSV();

        System.out.println(data);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        readDataCSV();
        System.out.println("this is list: " + data.toString());
        life_listview.setItems(data);
    }

    private void readDataCSV(){
        File file = new File("record.csv");

        if(file.exists()){ // file exist, start reading
            System.out.println("file is here");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String rowData;

                while((rowData = reader.readLine())!=null){

                    if(rowData.charAt(0) == '-'){
                        System.out.println(rowData + " is negative");
                        Text txt = new Text();
                        txt.setText(rowData);
                        txt.setFill(Color.RED);
                        data.add(txt);
                    }else{
                        System.out.println(rowData + " is positive");
                        Text txt = new Text();
                        txt.setText(rowData);
                        txt.setFill(Color.GREEN);
                        data.add(txt);
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{ // file not exist, create one
            System.out.println("file not here");
            try {
                Writer writer = new BufferedWriter(new FileWriter(file)); // create file
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected static void updateDataCSV(){
        try {
            FileWriter writer = new FileWriter("record.csv");

            for (Text row : data) {
                writer.write(row.getText()+"\n");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
