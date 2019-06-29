package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class AddRecordController implements Initializable {

    private String inputCate;
    private String inputStr;
    private ArrayList<String> inputArr = new ArrayList<String>();
    private Boolean flowFlag = true; // true for out, falso for in
    private ObservableList<String> category = FXCollections.observableArrayList("food", "water");

    @FXML
    private Text display_txt;
    @FXML
    private TextField num_memo;
    @FXML
    private RadioButton outFlow;
    @FXML
    private RadioButton inFlow;
    @FXML
    private ChoiceBox num_menu;

    @FXML
    private Button num_1;
    @FXML
    private Button num_2;
    @FXML
    private Button num_3;
    @FXML
    private Button num_4;
    @FXML
    private Button num_5;
    @FXML
    private Button num_6;
    @FXML
    private Button num_7;
    @FXML
    private Button num_8;
    @FXML
    private Button num_9;
    @FXML
    private Button num_0;
    @FXML
    private Button num_enter;
    @FXML
    private Button num_del;
    @FXML
    private Button num_dot;

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
        if(inputStr != null){
            if(!inputStr.equals("0") && !inputArr.get(inputArr.size()-1).equals(".")
                    && !inputStr.equals("0.00") && !inputStr.equals("0.0") ){

                Text txt = new Text();
                inputCate = num_menu.getSelectionModel().getSelectedItem().toString();

                if(flowFlag == true){
                    txt.setText("-" + inputStr + ", " + inputCate);
                    txt.setFill(Color.RED);
                }else{
                    txt.setText("+" + inputStr + ", " + inputCate);
                    txt.setFill(Color.GREEN);
                }
                MainController.data.add(txt);
                MainController.updateDataCSV();
                selectOutFlow();

                inputStr = null;
                inputArr.clear();
                display_txt.setText("0");
            }
        }
        System.out.println(MainController.data);
    }


    @FXML
    private void selectInFlow(){
        outFlow.setSelected(false);
        inFlow.setSelected(true);
        flowFlag = false;
        System.out.println(flowFlag);
    }
    @FXML
    private void selectOutFlow(){
        inFlow.setSelected(false);
        outFlow.setSelected(true);
        flowFlag = true;
        System.out.println(flowFlag);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //System.out.println(flowFlag);
        num_menu.setValue("food");
        num_menu.setItems(category);

    }
}
