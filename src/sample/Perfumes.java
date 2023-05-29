package sample;

import java.io.*;

public class Perfumes extends Product {
    private int size;//in millileters

    public Perfumes(String store_name,String product_name,String brand,String code,String color,int size){
        super();
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
        this.size=size;
    }
    public Perfumes(){}
    @Override
    public double price(){  //You have to add brands to price
        double x=0;
        if(size==100 && getBrand()=="Gucci"){
            x= 500;}

        else if (size==200 && getBrand()=="Gucci"){
            x= 550;}

        else if(size==350 && getBrand()=="Gucci"){
            x= 600;}

        else if(size==500 && getBrand()=="Gucci"){
            x= 1000;}
        else if(size==100 && getBrand()=="One Million"){
            x= 600;}

        else if (size==200 && getBrand()=="One Million"){
            x= 650;}

        else if(size==350 && getBrand()=="One Million"){
            x= 700;}

        else if(size==500 && getBrand()=="One Million"){
            x= 1400;}

        return x+CalculateTax(code);

    }

    @Override
    public void addToCart()  {
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
            output.write(this.size + "\n");
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
        p=p+(0.03*p);
        return p;
    }
}
