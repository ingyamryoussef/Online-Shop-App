package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Fridge extends Product {
    private String size;
    private double mintemp;
    private int noOfDoors;

    public Fridge(String store_name,String product_name,String brand,String code,String color,String size,double mintemp,int noOfDoors){
        super();
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
        this.size=size;
        this.mintemp=mintemp;
        this.noOfDoors=noOfDoors;
    }

    @Override
    public double price(){
        double x=0;
        if(noOfDoors==2 && size=="1x2"&& getBrand()=="Toshiba") {
            x=14499.99;
        }
        else if(noOfDoors==2 && size=="1x2"&& getBrand()=="Fresh"){
            x= 16000;
        }
        else if (noOfDoors==4 && size=="1x2"&& getBrand()=="Toshiba"){
            x=18999.99;
        }
        else if (noOfDoors==4 && size=="1x2"&& getBrand()=="Fresh"){
            x=20000;
        }

        else if(noOfDoors==2 && size=="1.5x2.5" && getBrand()=="Toshiba" ) {
            x=20000;
        }
        else if(noOfDoors==2 && size=="1.5x2.5" && getBrand()=="Fresh" ) {
            x=15999.99;
        }
        else if (noOfDoors==4 && size=="1.5x2.5"&& getBrand()=="Toshiba"){
            x=25699.99;
        }
        else if (noOfDoors==4 && size=="1.5x2.5"&& getBrand()=="Fresh"){
            x=30000;
        }

        return x + CalculateTax(code);
    }


    @Override
    public void addToCart(){
        try {
            File cart = new File("mycart.txt");
            FileWriter output = new FileWriter(cart, true);
            output.write(getStore_name()+"\t");
            output.write(getProduct_name()+"\t");
            output.write(getBrand()+"\t");
            output.write(getCode()+"\t");
            output.write(this.getColor()+"\t");
            output.write(price()+"\t");
            output.write(this.size+"\t");
            output.write(this.mintemp+"\t");
            output.write(this.noOfDoors+ "\n");
            output.close();
        }
        catch (FileNotFoundException e){}
        catch (IOException e1) {}
    }

    @Override
    public boolean CheckifAvailable(int code) {
        int x = (int)(Math.random()*2);
        if(x==0) return false;
        else return true;
    }

    @Override
    public double Calculate_Tax(String code) {
        double p = price();
        p=p+(0.06*p);
        return p;
    }
}
