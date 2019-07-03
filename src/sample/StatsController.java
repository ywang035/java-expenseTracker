package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

// controller for [show statistic] scene
public class StatsController implements Initializable {

    private static ObservableList<Text> dataList = FXCollections.observableArrayList();

    @FXML
    private Text totalIncomeText, totalSpendText, totalNumText, numTrans;

    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    protected void getList(){
        dataList = MainController.dataList;
    }

    // method to update total money and showing spend percentage in pie chart
    @FXML
    protected void updateMoney(){
        ArrayList<String[]> allRecords = new ArrayList<String[]>();
        float totalFloat = 0;
        float spendFloat = 0;
        float incomeFloat = 0;
        for (Text row : dataList){
            String record = row.getText();
            String[] recordSplited = record.split(",");
            allRecords.add(recordSplited);
        }
        for (String[] i : allRecords) {
            float money = Float.parseFloat(i[0]);
            totalFloat += money;
            if(money<0){
                spendFloat += money;
            }else if(money>0){
                incomeFloat += money;
            }
        }

        String totalStr = Float.toString(totalFloat);
        String spendStr = Float.toString(spendFloat);
        String incomeStr = Float.toString(incomeFloat);

        totalNumText.setText("Total:\t\t" + totalStr);
        totalIncomeText.setText("Income:\t\t" + incomeStr);
        totalSpendText.setText("Spend:\t\t" + spendStr);
        numTrans.setText("Records:\t\t" + dataList.size());

        updatePichart();
    }

    // method to update pie chart
    @FXML
    private void updatePichart(){
        ArrayList<String[]> allRecords = new ArrayList<String[]>();
        float foodFloat = 0;
        float waterFloat = 0;
        float otherFloat = 0;
        for(Text row : dataList){
            String record = row.getText();
            String[] recordSplited = record.split(",");
            allRecords.add((recordSplited));
        }
        for(String[] i : allRecords){
            float money = Float.parseFloat(i[0]);
            String category = i[1];
            System.out.println(i[1]);
            if(category.equals(" food") && money < 0){
                foodFloat += money;
            }else if(category.equals(" water") && money < 0){
                waterFloat += money;
            }else if(category.equals(" other") && money < 0){
                otherFloat += money;
            }
        }

        double foodPercent = foodFloat/(foodFloat+waterFloat+otherFloat) * 100;
        String foodPercentStr = "food " + String.format ("%.2f", foodPercent)+"%";

        double waterPercent = waterFloat/(foodFloat+waterFloat+otherFloat) * 100;
        String waterPercentStr = "water " + String.format ("%.2f", waterPercent)+"%";

        double otherPercent = otherFloat/(foodFloat+waterFloat+otherFloat) * 100;
        String otherPercentStr = "other " + String.format ("%.2f", otherPercent) +"%";

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data(foodPercentStr, foodPercent),
                new PieChart.Data(waterPercentStr, waterPercent),
                new PieChart.Data(otherPercentStr, otherPercent));

        pieChart.setTitle("Spending Pie Chart");
        pieChart.setData(pieChartData);
    }
}
