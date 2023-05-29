package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Electronics extends Product {
    protected boolean laptops;
    protected boolean mobiles;
    protected String processer_type;
    protected int ram_size;

    public Electronics(String store_name,String product_name,String brand,String code,String color,boolean laptops,
                       boolean mobiles,String processer_type,int ram_size){

        super();
        this.store_name=store_name;
        this.product_name=product_name;
        this.brand=brand;
        this.code=code;
        this.color=color;
        this.laptops=laptops;
        this.mobiles=mobiles;
        this.processer_type=processer_type;
        this.ram_size=ram_size;
    }

    public double price(){
        double x=0;
        if (laptops==true)
        {
            if (getBrand()=="Lenovo" &&processer_type=="i6") x=5000+(ram_size*0.01);
            else if (getBrand()=="Lenovo" &&processer_type=="i7") x=6000+(ram_size*0.01);
            else if (getBrand()=="Hp" &&processer_type=="i6") x=3000+(ram_size*0.01);
            else if (getBrand()=="Hp" &&processer_type=="i7") x=4000+(ram_size*0.01);
        }
        else if (mobiles==true)
        {
            if (getBrand()=="Samsung") x=5000+(ram_size*0.01);
            else if (getBrand()=="Iphone") x=7000+(ram_size*0.01);
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
            if(this.laptops==true)
            output.write("laptop \t");
            else output.write("mobile\t");
            output.write(this.processer_type+"\t");
            output.write(this.ram_size + "\n");
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
    public double Calculate_Tax(String  code) {
        double p = price();
        p=p+(0.08*p);
        return p;
    }
}
