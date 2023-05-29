package sample;

import java.io.*;

public class Accessories extends Product {
    boolean necklace;
    boolean braclet;
    boolean earing;
    boolean anklet;

    public Accessories(String store_name,String product_name,String brand,String code,String color,boolean necklace,boolean braclet,boolean earing,boolean anklet){
        super();
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
        this.necklace=necklace;
        this.braclet=braclet;
        this.earing=earing;
        this.anklet=anklet;

    }

    @Override
    public double price() {//You have to add brands to price
        double x=0;
        if(necklace==true && getBrand()=="ALDO"){
            x=200;//(100+value) according to each brand
        }
        else if(necklace==true && getBrand()=="Velvet"){
            return 150;
        }
        else if (braclet==true && getBrand()=="ALDO"){
            x=300;
        }
        else if (braclet==true && getBrand()=="Velvet"){
            x=200;
        }
        else if(earing==true && getBrand()=="ALDO"){
            x=150;
        }
        else if(earing==true && getBrand()=="Velvet"){
            x=100;
        }
        else if(anklet==true && getBrand()=="ALDO") {
            x = 160;
        }
        else if(anklet==true && getBrand()=="Velvet"){
            x=150;
        }
        return x+CalculateTax(code);
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
            output.write(this.necklace+"\t");
            output.write(this.braclet+"\t");
            output.write(this.earing+"\t");
            output.write(this.anklet + "\n");
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
        p=p+(0.01*p);
        return p;
    }
}
