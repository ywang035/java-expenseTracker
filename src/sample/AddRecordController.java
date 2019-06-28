package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddRecordController implements Initializable {

    private String inputStr;
    private ArrayList<String> inputArr = new ArrayList<String>();

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

    @FXML
    private void addNum1(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_1.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_1.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }

    }
    @FXML
    private void addNum2(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_2.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_2.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum3(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_3.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_3.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum4(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_4.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_4.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum5(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_5.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_5.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum6(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_6.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_6.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum7(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_7.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_7.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum8(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_8.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_8.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum9(){
        if(inputArr.size()==1 && inputArr.get(0) == "0"){
            inputArr.remove(0);
            inputArr.add(num_9.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            inputArr.add(num_9.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addNum0() {
        if (inputArr.size() == 1 && inputArr.get(0) == "0") {
            System.out.println(inputStr);
        }else if (inputArr.size() == 0){
            inputArr.add("0");
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else if(inputArr.size() > 0 ){
            inputArr.add("0");
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }
    }
    @FXML
    private void addDot(){
        if(inputArr.size() == 0){
            inputArr.add("0");
            inputArr.add(num_dot.getText());
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else{
            if(!inputArr.contains(".")){
                inputArr.add(num_dot.getText());
                inputStr = String.join("", inputArr);
                display_txt.setText(inputStr);
                System.out.println(inputStr);
            }
        }
    }
    @FXML
    private void deleteNum(){
        if(inputArr.size() > 1){
            inputArr.remove(inputArr.size()-1);
            inputStr = String.join("", inputArr);
            display_txt.setText(inputStr);
            System.out.println(inputStr);
        }else if(inputArr.size() == 1){
            if(inputArr.get(0) != "0"){
                inputArr.remove(0);
                inputArr.add("0");
                inputStr = String.join("", inputArr);
                display_txt.setText(inputStr);
                System.out.println(inputStr);
            }
        }
        System.out.println(inputStr);
    }

    @FXML
    private void enterNum(){
        if(inputStr != null){
            MainController.data.add(inputStr);
            inputStr = null;
            inputArr.clear();
            display_txt.setText("0");
        }

        System.out.println(MainController.data);
    }


    @FXML
    private void selectInFlow(){
        outFlow.setSelected(false);
        inFlow.setSelected(true);
    }
    @FXML
    private void selectOutFlow(){
        inFlow.setSelected(false);
        outFlow.setSelected(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
