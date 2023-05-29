package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

          Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("categories.fxml"));
        Parent root3 = FXMLLoader.load(getClass().getResource("Giftshop1.fxml"));
        Parent root4 = FXMLLoader.load(getClass().getResource("watches.fxml"));
        Parent root5 = FXMLLoader.load(getClass().getResource("perfumes.fxml"));
        Parent root6 = FXMLLoader.load(getClass().getResource("accessories.fxml"));
        Parent root7 = FXMLLoader.load(getClass().getResource("clothes.fxml"));
        Parent root8 = FXMLLoader.load(getClass().getResource("electronics.fxml"));
        Parent root9 = FXMLLoader.load(getClass().getResource("Homeappliances.fxml"));
        Parent root10 = FXMLLoader.load(getClass().getResource("fridge.fxml"));
        Parent root11 = FXMLLoader.load(getClass().getResource("washingmachine.fxml"));
        Parent root12 = FXMLLoader.load(getClass().getResource("about.fxml"));
        Parent root13 = FXMLLoader.load(getClass().getResource("buyerinfo.fxml"));
        Parent root14 = FXMLLoader.load(getClass().getResource("thanking.fxml"));
        Parent rootcart = FXMLLoader.load(getClass().getResource("shopping_cart.fxml"));



        primaryStage.setTitle("Welcome to E-Mall");
        Scene scene = new Scene(root, 374, 537);
        primaryStage.setScene(scene);
        primaryStage.show();

        Button startshopping = (Button) scene.lookup("#startshopping");
        Scene scene2 = new Scene(root2, 374, 537);
        startshopping.setOnAction(e -> primaryStage.setScene(scene2));

        Button gotogift = (Button) scene2.lookup("#gotogiftshop");
        Scene scene3 = new Scene(root3, 374, 537);
        gotogift.setOnAction(e -> primaryStage.setScene(scene3));

        Button gotowatches = (Button) scene3.lookup("#gotowatches");
        Scene scene4 = new Scene(root4, 374, 537);
        gotowatches.setOnAction(e -> primaryStage.setScene(scene4));

        Button gotoperfumes = (Button) scene3.lookup("#gotoperfumes");
        Scene scene5 = new Scene(root5, 374, 537);
        gotoperfumes.setOnAction(e -> primaryStage.setScene(scene5));

        Button gotoaccessories = (Button) scene3.lookup("#gotoaccessories");
        Scene scene6 = new Scene(root6, 374, 537);
        gotoaccessories.setOnAction(e -> primaryStage.setScene(scene6));

        Button gotoclothes = (Button) scene2.lookup("#gotoclothes");
        Scene scene7 = new Scene(root7, 374, 537);
        gotoclothes.setOnAction(e -> primaryStage.setScene(scene7));

        Button gotoelectronics = (Button) scene2.lookup("#gotoelectronics");
        Scene scene8 = new Scene(root8, 374, 537);
        gotoelectronics.setOnAction(e -> primaryStage.setScene(scene8));

        Button gotohomeappliances = (Button) scene2.lookup("#gotohomeappliances");
        Scene scene9 = new Scene(root9, 374, 537);
        gotohomeappliances.setOnAction(e -> primaryStage.setScene(scene9));

        Button gotofridges = (Button) scene9.lookup("#gotofridges");
        Scene scene10 = new Scene(root10, 374, 537);
        gotofridges.setOnAction(e -> primaryStage.setScene(scene10));

        Button gotowashingmachines = (Button) scene9.lookup("#gotowashingmachines");
        Scene scene11 = new Scene(root11, 374, 537);
        gotowashingmachines.setOnAction(e -> primaryStage.setScene(scene11));




        //------Buttons of different watches-------
        Button addtocart = (Button) scene4.lookup("#button_addtocart");
        Button addtocart1 = (Button) scene4.lookup("#button_addtocart1");
        Button addtocart2 = (Button) scene4.lookup("#button_addtocart2");
        Button addtocart3 = (Button) scene4.lookup("#button_addtocart3");

        //------Buttons of different perfumes-------
        Button addtocart8=(Button) scene5.lookup("#button_addtocart8");
        Button addtocart9=(Button) scene5.lookup("#button_addtocart9");
        Button addtocart10=(Button) scene5.lookup("#button_addtocart10");
        Button addtocart11=(Button) scene5.lookup("#button_addtocart11");
        Button addtocart4=(Button) scene5.lookup("#button_addtocart4");
        Button addtocart5=(Button) scene5.lookup("#button_addtocart5");
        Button addtocart6=(Button) scene5.lookup("#button_addtocart6");
        Button addtocart7=(Button) scene5.lookup("#button_addtocart7");


        //------Buttons of different accessories-------
        Button addtocart12=(Button) scene6.lookup("#button_addtocart12");
        Button addtocart13=(Button) scene6.lookup("#button_addtocart13");
        Button addtocart14=(Button) scene6.lookup("#button_addtocart14");
        Button addtocart15=(Button) scene6.lookup("#button_addtocart15");
        Button addtocart16=(Button) scene6.lookup("#button_addtocart16");
        Button addtocart17=(Button) scene6.lookup("#button_addtocart17");
        Button addtocart18=(Button) scene6.lookup("#button_addtocart18");
        Button addtocart19=(Button) scene6.lookup("#button_addtocart19");


        //------Buttons of different clothes-------
        Button addtocart20 = (Button) scene7.lookup("#button_addtocart20");
        Button addtocart21 = (Button) scene7.lookup("#button_addtocart21");
        Button addtocart22 = (Button) scene7.lookup("#button_addtocart22");
        Button addtocart23 = (Button) scene7.lookup("#button_addtocart23");



        //------Buttons of different fridges
        Button addtocart24=(Button) scene10.lookup("#button_addtocart24");
        Button addtocart25=(Button) scene10.lookup("#button_addtocart25");
        Button addtocart26=(Button) scene10.lookup("#button_addtocart26");
        Button addtocart27=(Button) scene10.lookup("#button_addtocart27");
        Button addtocart28=(Button) scene10.lookup("#button_addtocart28");
        Button addtocart29=(Button) scene10.lookup("#button_addtocart29");
        Button addtocart30=(Button) scene10.lookup("#button_addtocart30");
        Button addtocart31=(Button) scene10.lookup("#button_addtocart31");


        //------Buttons of different Washing machines
        Button addtocart32=(Button) scene11.lookup("#button_addtocart32");
        Button addtocart33=(Button) scene11.lookup("#button_addtocart33");
        Button addtocart34=(Button) scene11.lookup("#button_addtocart34");
        Button addtocart35=(Button) scene11.lookup("#button_addtocart35");
        Button addtocart36=(Button) scene11.lookup("#button_addtocart36");
        Button addtocart37=(Button) scene11.lookup("#button_addtocart37");
        Button addtocart38=(Button) scene11.lookup("#button_addtocart38");
        Button addtocart39=(Button) scene11.lookup("#button_addtocart39");

        //------Buttons of different Electronics
        Button addtocart40=(Button) scene8.lookup("#button_addtocart40");
        Button addtocart41=(Button) scene8.lookup("#button_addtocart41");
        Button addtocart42=(Button) scene8.lookup("#button_addtocart42");
        Button addtocart43=(Button) scene8.lookup("#button_addtocart43");
        Button addtocart44=(Button) scene8.lookup("#button_addtocart44");
        Button addtocart45=(Button) scene8.lookup("#button_addtocart45");



        Button go_to_cart =(Button) scene4.lookup("#go_to_cart");
        Button gotocart1 = (Button) scene5.lookup("#gotocart1");
        Button gotocart2 = (Button) scene6.lookup("#gotocart2");
        Button gotocart3 = (Button) scene7.lookup("#gotocart3");
        Button gotocart4 = (Button) scene8.lookup("#gotocart4");
        Button gotocart5 = (Button) scene9.lookup("#gotocart5");
        Button gotocart6 = (Button) scene10.lookup("#gotocart6");
        Button gotocart7 = (Button) scene11.lookup("#gotocart7");
        Button gotocart8 = (Button) scene2.lookup("#gotocart8");
        Button gotocart9 = (Button) scene3.lookup("#gotocart9");
        Scene cartscene = new Scene(rootcart,374,537);
        HBox H1 = (HBox)cartscene.lookup("#item1");
        Label label30 = (Label) cartscene.lookup("#label30");
        Label price1 = (Label) cartscene.lookup("#p1");
        Label q1 = (Label) cartscene.lookup("#q1");
        HBox H2 = (HBox)cartscene.lookup("#item2");
        Label label31 = (Label) cartscene.lookup("#label31");
        Label price2 = (Label) cartscene.lookup("#p2");
        Label q2 = (Label) cartscene.lookup("#q2");
        HBox H3 = (HBox)cartscene.lookup("#item3");
        Label label32 = (Label) cartscene.lookup("#label32");
        Label price3 = (Label) cartscene.lookup("#p3");
        Label q3 = (Label) cartscene.lookup("#q3");
        HBox H4 = (HBox)cartscene.lookup("#item4");
        Label label33 = (Label) cartscene.lookup("#label33");
        Label price4 = (Label) cartscene.lookup("#p4");
        Label q4 = (Label) cartscene.lookup("#q4");
        HBox H5 = (HBox)cartscene.lookup("#item5");
        Label label34 = (Label) cartscene.lookup("#label34");
        Label price5 = (Label) cartscene.lookup("#p5");
        Label q5 = (Label) cartscene.lookup("#q5");
        HBox H6 = (HBox)cartscene.lookup("#item6");
        Label label35 = (Label) cartscene.lookup("#label35");
        Label price6 = (Label) cartscene.lookup("#p6");
        Label q6 = (Label) cartscene.lookup("#q6");
        HBox H7 = (HBox)cartscene.lookup("#item7");
        Label label36 = (Label) cartscene.lookup("#label36");
        Label price7 = (Label) cartscene.lookup("#p7");
        Label q7 = (Label) cartscene.lookup("#q7");
        Label ptotal = (Label) cartscene.lookup("#ptotal");

        Scene scene13=new Scene(root13,374,537);
        Button submit = (Button) scene13.lookup("#submit");


        Button refresh = (Button) cartscene.lookup("#refresh") ;




        Button back2 = (Button) scene2.lookup("#back2");
        back2.setOnAction(e->primaryStage.setScene(scene));
        Button back3 = (Button) scene3.lookup("#back3");
        back3.setOnAction(e->primaryStage.setScene(scene2));
        Button back4= (Button) scene4.lookup("#back4");
        back4.setOnAction(e->primaryStage.setScene(scene3));
        Button back5 = (Button) scene5.lookup("#back5");
        back5.setOnAction(e->primaryStage.setScene(scene3));
        Button back6 = (Button) scene6.lookup("#back6");
        back6.setOnAction(e->primaryStage.setScene(scene3));
        Button back7 = (Button) scene7.lookup("#back7");
        back7.setOnAction(e->primaryStage.setScene(scene2));
        Button back8 = (Button) scene8.lookup("#back8");
        back8.setOnAction(e->primaryStage.setScene(scene2));
        Button back9 = (Button) scene9.lookup("#back9");
        back9.setOnAction(e->primaryStage.setScene(scene2));
        Button back10 = (Button) scene10.lookup("#back10");
        back10.setOnAction(e->primaryStage.setScene(scene9));
        Button back11 = (Button) scene11.lookup("#back11");
        back11.setOnAction(e->primaryStage.setScene(scene9));
        Button backcart = (Button) cartscene.lookup("#backcart");
        backcart.setOnAction(e->primaryStage.setScene(scene2));


        Button proceed = (Button) cartscene.lookup("#proceed");

        proceed.setOnAction(e-> primaryStage.setScene(scene13));

        Button gotoabout = (Button) scene.lookup("#gotoabout");
        Scene scene12 = new Scene(root12, 374, 537);
        Button backabout = (Button) scene12.lookup("#backabout");
        backabout.setOnAction(e->primaryStage.setScene(scene));
        gotoabout.setOnAction(e-> primaryStage.setScene(scene12));

        Button backinfo = (Button) scene13.lookup("#backinfo");
        backinfo.setOnAction(e-> primaryStage.setScene(cartscene));


        Scene scene14 = new Scene(root14,359,400);
        TextArea nametext =(TextArea) scene13.lookup("#nametext");
        TextArea addresstext =(TextArea) scene13.lookup("#addresstext");
        TextArea telephonetext =(TextArea) scene13.lookup("#telephonetext");
        TextArea emailtext =(TextArea) scene13.lookup("#emailtext");
        TextArea citytext =(TextArea) scene13.lookup("#citytext");




        Button add1 = (Button) cartscene.lookup("#add1");
        add1.setOnAction(e->{
            int x = Integer.valueOf(q1.getText());
            x++;
            q1.setText(String.valueOf(x));
        });
        Button add2 = (Button) cartscene.lookup("#add2");
        add2.setOnAction(e->{
            int x = Integer.valueOf(q2.getText());
            x++;
            q2.setText(String.valueOf(x));
        });
        Button add3 = (Button) cartscene.lookup("#add3");
        add3.setOnAction(e->{
            int x = Integer.valueOf(q3.getText());
            x++;
            q3.setText(String.valueOf(x));
        });
        Button add4 = (Button) cartscene.lookup("#add4");
        add4.setOnAction(e->{
            int x = Integer.valueOf(q4.getText());
            x++;
            q4.setText(String.valueOf(x));
        });
        Button add5 = (Button) cartscene.lookup("#add5");
        add5.setOnAction(e->{
            int x = Integer.valueOf(q5.getText());
            x++;
            q5.setText(String.valueOf(x));
        });
        Button add6 = (Button) cartscene.lookup("#add6");
        add6.setOnAction(e->{
            int x = Integer.valueOf(q6.getText());
            x++;
            q6.setText(String.valueOf(x));
        });
        Button add7 = (Button) cartscene.lookup("#add7");
        add7.setOnAction(e->{
            int x = Integer.valueOf(q7.getText());
            x++;
            q7.setText(String.valueOf(x));
        });

        Button minus1 = (Button) cartscene.lookup("#minus1");
        minus1.setOnAction(e->{
            int x = Integer.valueOf(q1.getText());
            if(x>1) x--;
            q1.setText(String.valueOf(x));
        });
        Button minus2 = (Button) cartscene.lookup("#minus2");
        minus2.setOnAction(e->{
            int x = Integer.valueOf(q2.getText());
            if(x>1) x--;
            q2.setText(String.valueOf(x));
        });
        Button minus3 = (Button) cartscene.lookup("#minus3");
        minus3.setOnAction(e->{
            int x = Integer.valueOf(q3.getText());
            if(x>1) x--;
            q3.setText(String.valueOf(x));
        });
        Button minus4 = (Button) cartscene.lookup("#minus4");
        minus4.setOnAction(e->{
            int x = Integer.valueOf(q4.getText());
            if(x>1) x--;
            q4.setText(String.valueOf(x));
        });
        Button minus5 = (Button) cartscene.lookup("#minus5");
        minus5.setOnAction(e->{
            int x = Integer.valueOf(q5.getText());
            if(x>1) x--;
            q5.setText(String.valueOf(x));
        });
        Button minus6 = (Button) cartscene.lookup("#minus6");
        minus6.setOnAction(e->{
            int x = Integer.valueOf(q6.getText());
            if(x>1) x--;
            q6.setText(String.valueOf(x));
        });
        Button minus7 = (Button) cartscene.lookup("#minus7");
        minus7.setOnAction(e->{
            int x = Integer.valueOf(q7.getText());
            if(x>1) x--;
            q7.setText(String.valueOf(x));
        });


        ComboBox<String> comboBox = (ComboBox<String>) cartscene.lookup("#comboBox44");
        ComboBox<String> comboBox1 = (ComboBox<String>) cartscene.lookup("#comboBox45");
        ComboBox<String> comboBox2 = (ComboBox<String>) cartscene.lookup("#comboBox46");
        ComboBox<String> comboBox3 = (ComboBox<String>) cartscene.lookup("#comboBox47");
        ComboBox<String> comboBox4 = (ComboBox<String>) cartscene.lookup("#comboBox48");
        ComboBox<String> comboBox5 = (ComboBox<String>) cartscene.lookup("#comboBox49");
        ComboBox<String> comboBox6 = (ComboBox<String>) cartscene.lookup("#comboBox50");
        ComboBox<String> comboboxsize1 = (ComboBox<String>) scene7.lookup("#comboboxsize1");
        ComboBox<String> comboboxsize2 = (ComboBox<String>) scene7.lookup("#comboboxsize2");
        Label l1 = (Label) cartscene.lookup("#l1");

//         ------Watches add to cart buttons------
        addtocart.setOnAction(e-> {
               Product p1 = new Watches("Store1","RolexAnalog","Rolex","0","Default",false,true);
               p1.addToCart();
               p1.addToCart(1);
        });
        addtocart1.setOnAction(e-> {
            Product p1 = new Watches("Store1","CasioAnalog","Casio","1","Default",false,true);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart2.setOnAction(e-> {
            Product p1 = new Watches("Store1","RolexDigital","Rolex","2","Default",true,false);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart3.setOnAction(e-> {
            Product p1 = new Watches("Store1","CasioDigital","Casio","3","Default",true,false);
            p1.addToCart();
            p1.addToCart(1);});

//        ------Perfumes add to cart buttons-------
        addtocart8.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","Gucci100ml","Gucci","8","Default",100);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart9.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","Gucci200ml","Gucci","9","Default",200);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart10.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","Gucci350ml","Gucci","10","Default",350);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart11.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","Gucci500ml","Gucci","11","Default",500);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart4.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","OneMillion100ml","One Million","4","Default",100);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart5.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","OneMillion200ml","One Million","5","Default",200);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart6.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","OneMillion350ml","One Million","6","Default",350);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart7.setOnAction(e-> {
            Product p1 = new Perfumes("Store2","OneMillion500ml","One Million","7","Default",500);
            p1.addToCart();
            p1.addToCart(1);});

        //------Accessories add to cart buttons------
        addtocart12.setOnAction(e-> {
            Product p1 = new Accessories("Store3","NecklaceALDO","Aldo","12","Default",true, false, false, false);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart13.setOnAction(e-> {
            Product p1 = new Accessories("Store3","BraceletALDO","Aldo","13","Default",false, true, false, false);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart14.setOnAction(e-> {
            Product p1 = new Accessories("Store3","EarringsALDO","Aldo","14","Default",false, false, true, false);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart15.setOnAction(e-> {
            Product p1 = new Accessories("Store3","AnkletALDO","Aldo","15","Default",false, false, false, true);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart16.setOnAction(e-> {
            Product p1 = new Accessories("Store3","NecklaceVelvet","Velvet","16","Default",true, false, false, false);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart17.setOnAction(e-> {
            Product p1 = new Accessories("Store3","BraceletVelvet","Velvet","17","Default",false, true, false, false);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart18.setOnAction(e-> {
            Product p1 = new Accessories("Store3","EarringsVelvet","Velvet","18","Default",false, false, true, false);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart19.setOnAction(e-> {
            Product p1 = new Accessories("Store3","AnkletVelvet","Velvet","19","Default",false, false, false, true);
            p1.addToCart();
            p1.addToCart(1);});

//        ------Clothes add to cart button------
        addtocart20.setOnAction(e-> {
            Product p1 = new Clothes("Store4","H&Mblouse","H&M","20","Default","Small","Blouse", "1 piece");
            ((Clothes) p1).setSize(comboboxsize1.getValue());
            p1.addToCart();
            p1.addToCart(1);});
        addtocart21.setOnAction(e-> {
           Product p1 = new Clothes("Store4","H&MPants","H&M","21","Default","Small","Pants", "1 piece");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart22.setOnAction(e-> {
            Product p1 = new Clothes("Store4","Zarablouse","Zara","22","Default","Small","Blouse", "1 piece");
            ((Clothes) p1).setSize(comboboxsize2.getValue());
            p1.addToCart();
            p1.addToCart(1);});
        addtocart23.setOnAction(e-> {
            Product p1 = new Clothes("Store4","ZaraPants","H&M","23","Default","Small","Blouse", "1 piece");
            p1.addToCart();
            p1.addToCart(1);});

//        ------Fridges add to cart buttons------
        addtocart24.setOnAction(e-> {
            Product p1 = new Fridge("Store5","ToshibaFridge1x2m2Doors","Toshiba","24","Default","1x2m",-10,2);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart25.setOnAction(e-> {
            Product p1 = new Fridge("Store5","ToshibaFridge1.5x2.5m2Doors","Toshiba","25","Default","1.5x2.5m",-10,2);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart26.setOnAction(e-> {
            Product p1 = new Fridge("Store5","ToshibaFridge1x2m4Doors","Toshiba","26","Default","1x2m",-20,4);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart27.setOnAction(e-> {
            Product p1 = new Fridge("Store5","ToshibaFridge1.5x2.5m4Doors","Toshiba","27","Default","1x2m",-20,4);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart28.setOnAction(e-> {
            Product p1 = new Fridge("Store5","FreshFridge1x2m2Doors","Fresh","28","Default","1x2m",-10,2);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart29.setOnAction(e-> {
            Product p1 = new Fridge("Store5","FreshFridge1.5x2.5m2Doors","Fresh","29", "Default", "1.5x2.5m",-20,2);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart30.setOnAction(e-> {
            Product p1 = new Fridge("Store5","FreshFridge1x2m4Doors","Fresh","30", "Default", "1x2m",-20,4);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart31.setOnAction(e-> {
            Product p1 = new Fridge("Store5","FreshFridge1.5x2.5m4Doors","Fresh","31", "Default", "1.5x2.5m",-20,4);
            p1.addToCart();
            p1.addToCart(1);});

//        ------Washing Machines add to cart buttons------
        addtocart32.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","ToshibaWM20KG","Toshiba","32","Default",50.0,20,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart33.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","ToshibaWM40KG","Toshiba","33","Default",50.0,40,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart34.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","ToshibaWM20KG","Toshiba","34","Default",70.0,20,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart35.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","ToshibaWM40KG","Toshiba","35","Default",70.0,40,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart36.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","FreshWM20KG","Fresh","36","Default",50.0,20,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart37.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","FreshWM40KG","Fresh","37","Default",50.0,40,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart38.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","FreshWM20KG","Fresh","38","Default",70.0,20,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});
        addtocart39.setOnAction(e-> {
            Product p1 = new Washingmachine("Store6","FreshWM40KG","Fresh","39","Default",70.0,40,"FullAutomatic");
            p1.addToCart();
            p1.addToCart(1);});

//        ------Electronics add to cart buttons------
        addtocart40.setOnAction(e-> {
            Product p1 = new Electronics("Store7","LenovoLaptopi6","Lenovo","40","Default",true,false,"i6",2);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart41.setOnAction(e-> {
            Product p1 = new Electronics("Store7","LenovoLaptopi7","Lenovo","41","Default",true,false,"i7",3);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart42.setOnAction(e-> {
            Product p1 = new Electronics("Store7","SamsungPhone","Samsung","42","Default",false,true,"unspecified",1);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart43.setOnAction(e-> {
            Product p1 = new Electronics("Store7","HpLaptopi6","Hp","43","Default",true,false,"i6",2);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart44.setOnAction(e-> {
            Product p1 = new Electronics("Store7","HpLaptopi6","Hp","44","Default",true,false,"i7",3);
            p1.addToCart();
            p1.addToCart(1);});
        addtocart45.setOnAction(e-> {
            Product p1 = new Electronics("Store7","Iphone","Iphone","45","Default",false,true,"unspecified",1);
            p1.addToCart();
            p1.addToCart(1);});
//
//
//

 //colors in shopping_cart
        comboBox.getItems().addAll("Black", "Grey", "Blue", "White");
        comboBox1.getItems().addAll("Black", "Grey", "Blue", "White");
        comboBox2.getItems().addAll("Black", "Grey", "Blue", "White");
        comboBox3.getItems().addAll("Black", "Grey", "Blue", "White");
        comboBox4.getItems().addAll("Black", "Grey", "Blue", "White");
        comboBox5.getItems().addAll("Black", "Grey", "Blue", "White");
        comboBox6.getItems().addAll("Black", "Grey", "Blue", "White");
        comboboxsize1.getItems().addAll("Small", "Medium", "Large");
        comboboxsize2.getItems().addAll("Small", "Medium", "Large");



        refresh.setOnAction(e-> {primaryStage.setScene(cartscene);
                    ArrayList<String> items = new ArrayList<>();
                    ArrayList<Double> prices = new ArrayList<>();
                    ArrayList<Integer> quantity = new ArrayList<>();
                    try {
                        File cart = new File("myorder.txt");
                        Scanner x = new Scanner(cart);
                        if(x.hasNext())
                        {
                            H1.setVisible(true);
                            String s; s=x.next(); label30.setText(s);
                            double y; y= Double.valueOf(x.next()) ; prices.add(y);
                            price1.setText(String.valueOf(y));
                            int z=Integer.valueOf(q1.getText()); quantity.add(z);

                        }
                        else {H1.setVisible(false);}
                        if(x.hasNext())
                        {
                            H2.setVisible(true);
                            String s; s=x.next(); label31.setText(s);
                            double y; y= Double.valueOf(x.next()) ; prices.add(y);
                            price2.setText(String.valueOf(y));
                            int z=Integer.valueOf(q2.getText()); quantity.add(z);
                        }
                        else {H2.setVisible(false);}
                        if(x.hasNext())
                        {
                            H3.setVisible(true);
                            String s; s=x.next(); label32.setText(s);
                            double y; y= Double.valueOf(x.next()) ; prices.add(y);
                            price3.setText(String.valueOf(y));
                            int z=Integer.valueOf(q3.getText()); quantity.add(z);
                        }
                        else {H3.setVisible(false);}
                        if(x.hasNext())
                        {
                            H4.setVisible(true);
                            String s; s=x.next(); label33.setText(s);
                            double y; y= Double.valueOf(x.next()) ; prices.add(y);
                            price4.setText(String.valueOf(y));
                            int z=Integer.valueOf(q4.getText()); quantity.add(z);
                        }
                        else {H4.setVisible(false);}
                        if(x.hasNext())
                        {
                            H5.setVisible(true);
                            String s; s=x.next(); label34.setText(s);
                            double y; y= Double.valueOf(x.next()) ; prices.add(y);
                            price5.setText(String.valueOf(y));
                            int z=Integer.valueOf(q5.getText()); quantity.add(z);
                        }
                        else {H5.setVisible(false);}
                        if(x.hasNext())
                        {
                            H6.setVisible(true);
                            String s; s=x.next(); label35.setText(s);
                            double y; y= Double.valueOf(x.next()) ; prices.add(y);
                            price6.setText(String.valueOf(y));
                            int z=Integer.valueOf(q6.getText()); quantity.add(z);
                        }
                        else {H6.setVisible(false);}
                        if(x.hasNext())
                        {
                            H7.setVisible(true);
                            String s; s=x.next(); label36.setText(s);
                            double y; y= Double.valueOf(x.next()) ; prices.add(y);
                            price7.setText(String.valueOf(y));
                            int z=Integer.valueOf(q7.getText()); quantity.add(z);
                        }
                        else {H7.setVisible(false);}
                        ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                        ptotal.setText(String.valueOf(s1.CalculatePrice()));

                    }
                    catch (IOException e1) {}
            submit.setOnAction(e1-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
                }
        );

        go_to_cart.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                // DeliveryFee deliveryFee = new DeliveryFee();
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });

        gotocart1.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2 -> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart2.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e3-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart3.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart4.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart5.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart6.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart7.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart8.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()+25.0));

            }
            catch (IOException e1) {}
            submit.setOnAction(e4-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
        gotocart9.setOnAction(e-> {primaryStage.setScene(cartscene);
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            try {
                File cart = new File("myorder.txt");
                Scanner x = new Scanner(cart);
                if(x.hasNext())
                {
                    H1.setVisible(true);
                    String s; s=x.next(); label30.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price1.setText(String.valueOf(y));
                    int z=Integer.valueOf(q1.getText()); quantity.add(z);

                }
                else {H1.setVisible(false);}
                if(x.hasNext())
                {
                    H2.setVisible(true);
                    String s; s=x.next(); label31.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price2.setText(String.valueOf(y));
                    int z=Integer.valueOf(q2.getText()); quantity.add(z);
                }
                else {H2.setVisible(false);}
                if(x.hasNext())
                {
                    H3.setVisible(true);
                    String s; s=x.next(); label32.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price3.setText(String.valueOf(y));
                    int z=Integer.valueOf(q3.getText()); quantity.add(z);
                }
                else {H3.setVisible(false);}
                if(x.hasNext())
                {
                    H4.setVisible(true);
                    String s; s=x.next(); label33.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price4.setText(String.valueOf(y));
                    int z=Integer.valueOf(q4.getText()); quantity.add(z);
                }
                else {H4.setVisible(false);}
                if(x.hasNext())
                {
                    H5.setVisible(true);
                    String s; s=x.next(); label34.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price5.setText(String.valueOf(y));
                    int z=Integer.valueOf(q5.getText()); quantity.add(z);
                }
                else {H5.setVisible(false);}
                if(x.hasNext())
                {
                    H6.setVisible(true);
                    String s; s=x.next(); label35.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price6.setText(String.valueOf(y));
                    int z=Integer.valueOf(q6.getText()); quantity.add(z);
                }
                else {H6.setVisible(false);}
                if(x.hasNext())
                {
                    H7.setVisible(true);
                    String s; s=x.next(); label36.setText(s);
                    double y; y= Double.valueOf(x.next()) ; prices.add(y);
                    price7.setText(String.valueOf(y));
                    int z=Integer.valueOf(q7.getText()); quantity.add(z);
                }
                else {H7.setVisible(false);}
                ShoppingCart s1 = new ShoppingCart(items,prices,quantity);
                ptotal.setText(String.valueOf(s1.CalculatePrice()));

            }
            catch (IOException e1) {}
            submit.setOnAction(e2-> {

                Buyer b1 = new Buyer(items,prices,quantity,nametext.getText(),addresstext.getText(),telephonetext.getText(),emailtext.getText(),citytext.getText());
                if(b1.CheckIfNull()==false)
                {primaryStage.setScene(scene14);
                }
                else ;
            });
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
