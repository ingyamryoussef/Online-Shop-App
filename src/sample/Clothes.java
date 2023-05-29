package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Clothes extends Product{
    protected String size;
    protected String type;
    protected String no_of_items;

    public Clothes(String store_name,String product_name,String brand,String code,String color,String size,String type,String no_of_items){
        super();
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
        this.size=size;
        this.type=type;
        this.no_of_items=no_of_items;
    }

    public double price(){
        double x=0.0;
        if(getBrand()=="H&M" && type=="Pants") x=250.0;
        else if(getBrand()=="H&M" && type=="Blouse") x=150.0;
        else if(getBrand()=="Zara" && type=="Blouse") x=500.0;
        else if(getBrand()=="Zara" && type=="Pants") x=350.0;
        return x+CalculateTax(code);
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void addToCart(){
        try {
            File cart = new File("mycart.txt");
            //PrintWriter output = new PrintWriter(cart);
            FileWriter output = new FileWriter(cart, true);

            output.write(getStore_name()+"\t");
            output.write(getProduct_name()+"\t");
            output.write(getBrand()+"\t");
            output.write(getCode()+"\t");
            output.write(this.getColor()+"\t");
            output.write(price()+"\t");
            output.write(this.type+"\t");
            output.write(this.size+"\t");
            output.write(this.no_of_items+"\n");
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
        p=p+(0.015*p);
        return p;
    }
}
