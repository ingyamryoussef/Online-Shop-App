package sample;

import java.util.ArrayList;

public class Store extends ShoppingCart{
    protected String factory_name;
    public Store( ArrayList<String> items,ArrayList<Double> prices, ArrayList<Integer> quantity,String factory_name){
        super();
        this.items=items;
        this.prices=prices;
        this.quantity=quantity;
        this.factory_name=factory_name;
    }
}
