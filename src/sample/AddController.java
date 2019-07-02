package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.*;


// controller for [Add Transaction] scene
public class AddController implements Initializable {

    private String inputCate;
    private String inputStr;
    private ArrayList<String> inputArr = new ArrayList<String>();
    private Boolean flowFlag = true; // true for out, falso for in
    private ObservableList<String> category = FXCollections.observableArrayList("food", "water", "other");
    private ObservableList<Text> dataList = FXCollections.observableArrayList();

    @FXML
    private Pane AddRecordPane;
    @FXML
    private Text display_txt;
    @FXML
    private TextField num_memo;
    @FXML
    private RadioButton outFlow, inFlow;
    @FXML
    private ChoiceBox num_menu;
    @FXML
    private Button num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_dot;
    @FXML
    private DatePicker num_date;

    // ****** below are functions for different controls ******

    @FXML
    private void addNum1(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_1.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_1.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);

    }
    @FXML
    private void addNum2(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_2.getText());

        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_2.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum3(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_3.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_3.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum4(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_4.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_4.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum5(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_5.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_5.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum6(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_6.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_6.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum7(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_7.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_7.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum8(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_8.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_8.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum9(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_9.getText());
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add(num_9.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addNum0(){
        if(inputArr.size() == 1 && inputArr.get(0).equals("0")) {

        }else if (inputArr.size() == 0){
            inputArr.add("0");
        }else{
            if(inputArr.contains(".") && inputArr.size()-inputArr.indexOf(".")>2){

            }else{
                inputArr.add("0");
            }

        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void addDot(){
        if(inputArr.size() == 0){
            inputArr.add("0");
            inputArr.add(num_dot.getText());
        }else{
            if(!inputArr.contains(".")){
                inputArr.add(num_dot.getText());
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }
    @FXML
    private void deleteNum(){
        if(inputArr.size() > 1){
            inputArr.remove(inputArr.size()-1);
        }else if(inputArr.size() == 1){
            if(inputArr.get(0) != "0"){
                inputArr.remove(0);
                inputArr.add("0");
            }
        }
        inputStr = String.join("", inputArr);
        display_txt.setText(inputStr);
    }

    @FXML
    private void enterNum() {

        if(inputStr != null && num_date.getValue() != null){
            Text txt = new Text();
            String noteStr = num_memo.getText();
            String dateStr = num_date.getValue().toString();

            if(!inputStr.equals("0") && !inputArr.get(inputArr.size()-1).equals(".")
                    && !inputStr.equals("0.00") && !inputStr.equals("0.0") ){

                inputCate = num_menu.getSelectionModel().getSelectedItem().toString();

                if(flowFlag == true){
                    txt.setText("-" + inputStr + ", " + inputCate + ", " + noteStr + ", " + dateStr);
                    txt.setFill(Color.RED);
                }else{
                    txt.setText("+" + inputStr + ", " + inputCate);
                    txt.setFill(Color.GREEN);
                }

                MainController.dataList.add(txt);
                MainController.updateDataCSV();

                num_menu.setValue("food");
                selectOutFlow();
                inputStr = null;
                inputArr.clear();
                display_txt.setText("0");

                AddRecordPane.setVisible(false);
            }
        }
    }

    @FXML
    private void selectInFlow(){
        outFlow.setSelected(false);
        inFlow.setSelected(true);
        flowFlag = false;
    }
    @FXML
    private void selectOutFlow(){
        inFlow.setSelected(false);
        outFlow.setSelected(true);
        flowFlag = true;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        num_menu.setValue("food");
        num_menu.setItems(category);
    }

}
