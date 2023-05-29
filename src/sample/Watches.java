package sample;


import java.io.*;

public class Watches extends Product{
    private boolean digital;
    private boolean analog;

    public Watches(String store_name,String product_name,String brand,String code,String color,boolean digital,boolean analog){
        super();
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
        this.digital=digital;
        this.analog=analog;
    }
    public Watches(){}
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
            if(this.digital==true)
                output.write("Digital \n");
            else output.write("Analog\n");
            output.close();
        }
        catch (FileNotFoundException e){}
        catch (IOException e1) {}
    }

    @Override
    public double price(){
        double x=0;
        if(analog== true && getBrand()=="Casio"){
            x=500;
        }
        else if (digital==true && getBrand()=="Casio"){
            x=1000;
        }
        else if (analog==true && getBrand()=="Rolex"){
            x=100000;
        }
        else if (digital==true && getBrand()=="Rolex"){
            x=500000;
        }
        return x+CalculateTax(code);
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
        p=p+(0.05*p);
        return p;
    }
}
