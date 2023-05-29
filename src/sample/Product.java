package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.*;

public abstract class Product implements Tax , Availability{

    protected String store_name;
    protected String product_name;
    protected String brand;
    protected String code;
    protected String color;

    public Product(String store_name, String product_name, String brand, String code, String color)
    {
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
    }
    public Product(){}
    public String getStore_name() {
        return this.store_name;
    }
    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }



    public String getProduct_name() {
        return this.product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }



    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }



    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }



    public abstract double price();

    public abstract void addToCart();
    public void addToCart(int quantity){
        try {
            File cart = new File("myorder.txt");

            FileWriter output = new FileWriter(cart, true);
            output.write(getProduct_name()+"\t");
            output.write(price()+"\n");

            output.close();
        }
        catch (FileNotFoundException e){}
        catch (IOException e1) {}
    }

    public double CalculateTax(String  code){ return 0;}



    public boolean CheckIfAvailable(int code){return false;}
}
