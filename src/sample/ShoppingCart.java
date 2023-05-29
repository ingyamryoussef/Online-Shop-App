package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class ShoppingCart {

    protected ArrayList<String> items=new ArrayList<>();
    protected ArrayList<Double> prices=new ArrayList<>();
    protected ArrayList<Integer> quantity=new ArrayList<>();

    public ShoppingCart( ArrayList<String> items,ArrayList<Double> cart_elements, ArrayList<Integer> quantity)
    {
        this.items=items;
        this.prices=cart_elements;
        this.quantity=quantity;
    }


    public ShoppingCart() { }

    public void getElements(){

    }


    public double CalculatePrice(){
        int i=0;
        double tp=0;
        for (i=0;i<prices.size();i++)
        {
            tp+=prices.get(i)*quantity.get(i);
        }
        return tp;
    }


//         int q=quantity.get(0);
//            q++;
  //         quantity.set(1,q);
//            q1.setText(String.valueOf(q));

    //@FXML
    //public void select(ActionEvent actionEvent)
//    {
//        comboBox.getItems().addAll("Black", "Grey", "Blue", "White");
//    }
//    ObservableList<String> options =
//            FXCollections.observableArrayList(
//                    "Option 1",
//                    "Option 2",
//                    "Option 3"
//            );
//    comboBox = new ComboBox(options);


}
