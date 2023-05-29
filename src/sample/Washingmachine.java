package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Washingmachine extends Product{
    private double speed;
    private double capacity;
    private String type;

    public Washingmachine(String store_name,String product_name,String brand,String code,String color,double speed,double capacity,String type){
        super();
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
        this.speed=speed;
        this.capacity=capacity;
        this.type=type;
    }

    @Override
    public double price(){
        double x=0;
        if(capacity==20 && speed==50 && getBrand()=="Toshiba")
            x = 20000;
        else if(capacity==20 && speed==50 && getBrand()=="Fresh")
            x = 25000;
        else if (capacity==40&& speed==50&& getBrand()=="Toshiba")
            x=30000;
        else if (capacity==40&& speed==50&& getBrand()=="Fresh")
            x=38000;
        else if(capacity==20&& speed==70 && getBrand()=="Toshiba")
            x=35000;
        else if(capacity==20&& speed==70 && getBrand()=="Fresh")
            x=40000;
        else if(capacity==40&& speed==70 && getBrand()=="Toshiba")
            x=45000;
        else if(capacity==40&& speed==70 && getBrand()=="Fresh")
            x=50000;

        return x+Calculate_Tax(code);

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
            output.write(this.speed+"\t");
            output.write(this.capacity+"\t");
            output.write(this.type + "\n");
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
        p=p+(0.04*p);
        return p;
    }
}

