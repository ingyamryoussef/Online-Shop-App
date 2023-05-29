package sample;

import java.util.ArrayList;

public class Buyer extends ShoppingCart{
    private String buyer_name;
    private String address;
    private String telephone;
    private String email;
    private String city;
    //private DeliveryFee fee;

    public Buyer( ArrayList<String> items, ArrayList<Double> prices , ArrayList<Integer> quantity, String buyer_name, String address, String telephone, String email, String city){
        super();
        this.items=items;
        this.prices=prices;
        this.quantity=quantity;
        this.buyer_name=buyer_name;
        this.address=address;
        this.telephone=telephone;
        this.email=email;
        this.city=city;
    }
    public Buyer(){}
    public boolean CheckIfNull(){
        if(buyer_name=="null" || address=="null" || telephone=="null" || email=="null" || city=="null")
            return true;
        else
            return false;
    }
}
