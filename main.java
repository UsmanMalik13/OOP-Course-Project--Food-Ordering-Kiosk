/*
    Object Oriented Programming 
    <Food Ordering Kiosk>
    Group Members:
        1.Usman Malik      F20605053
        2.Hassan Asif      F20605033
        3.Ali Raza Jaffery F20605019
*/
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.io.*;
import java.awt.Font;
public class Main
{
    public static void main(String[] args) {
        new Label();
    }
    
}

class Label extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private JTextArea ratelist;
    private JLabel lblSize,lblBev,lblGlass,lblReport, lblname,lblBevnm, lbltitle;
    private JComboBox<String> size;
    private JRadioButton rdJuice,rdWater;
    private ButtonGroup btnGroup;
    private JTextField txtGlass, txtname;
    private JButton btnbevAdd,btnOrder;
    int amount_of_bev;
    ArrayList<Beverage> list_of_bvr = new ArrayList<Beverage>();

    //For Fast Food.

    private JLabel lblffSize,lblff,lblPiece,lblffReport,lblffnm;
    private JComboBox<String> ffsize;
    private JRadioButton rdBurger, rdpizza;
    private ButtonGroup btnffGroup;
    private JTextField txtpiece;
    int amount_of_ff;
    ArrayList<Fast_Food> list_of_ff = new ArrayList<Fast_Food>();
    private JButton btnffAdd;
    
    
    //For Hot Drinks.
    private JLabel lblhdSize,lblhd,lblCups,lblhdReport,lblhdnm;
    private JComboBox<String> hdsize;
    private JRadioButton rdTea,rdCoffee;
    private ButtonGroup btnhdGroup;
    private JTextField txtcup;
    int amount_of_hd;
    ArrayList<Hot_Drink> list_of_hd = new ArrayList<Hot_Drink>();
    private JButton btnhdAdd;
    public Label() {
        setLayout(null);
        setSize(780,800);
        setLocationRelativeTo(null);
        setTitle("Ordering Kiosk");
        init();
        btnbevAdd.addActionListener(this); 
        btnOrder.addActionListener(this);
        btnffAdd.addActionListener(this);
        btnhdAdd.addActionListener(this);
        setVisible(true);
    }
    
    public void init() {
        Font font = new Font("Courier", Font.BOLD,18);
        Font title = new Font("Courier", Font.BOLD,28);
        Font irate = new Font("Century", Font.BOLD,12);

        lbltitle = new JLabel("WELCOME TO NUTECH FOODS");//a JLabel that labels the Text Field
        lbltitle. setFont(title);
        lbltitle.setSize(500, 50);
        lbltitle.setLocation(180, 10);
        add(lbltitle);

        //Taking name of customer.
        lblname = new JLabel("Enter your name:");//a JLabel that labels the Text Field
        lblname.setSize(500, 50);
        lblname.setLocation(100, 50);
        add(lblname);

        txtname = new JTextField();//a JTextField to get how many glasses of beverage is the user want
        txtname.setSize(300, 25);
        txtname.setLocation(100, 90);
        add(txtname);

        //For Beverage.
        lblBevnm = new JLabel("BEVERAGE ORDER:");//a JLabel that labels the Text Field
        lblBevnm. setFont(font);
        lblBevnm.setSize(500, 50);
        lblBevnm.setLocation(100, 110);
        add(lblBevnm);
        
        lblSize = new JLabel("Select size:");// a JLabel that labels the comboBox
        lblSize.setSize(250, 50);
        lblSize.setLocation(100, 140);
        add(lblSize);
        
        String[] sizes = {"Small","Medium","Large"};
        size = new JComboBox<String>(sizes);//
        size.setSelectedIndex(0);//default selection is small
        size.setSize(100, 25);
        size.setLocation(100, 175);
        add(size);
        
        lblBev = new JLabel("Select which type of Beverage you want to order:");//a JLabel that labels the radioButtons
        lblBev.setSize(500, 50);
        lblBev.setLocation(100, 210);
        add(lblBev);
        
        btnGroup = new ButtonGroup();
        
        rdJuice = new JRadioButton("Juice");
        rdJuice.setSize(75, 50);
        rdJuice.setLocation(100, 245);
        add(rdJuice);
        
        rdWater = new JRadioButton("Water");
        rdWater.setSize(75, 50);
        rdWater.setLocation(175, 245);
        add(rdWater);
        
        
        btnGroup.add(rdJuice);
        btnGroup.add(rdWater);
        
        lblGlass = new JLabel("Type how many glasses you want to order:");//a JLabel that labels the Text Field
        lblGlass.setSize(500, 50);
        lblGlass.setLocation(100, 285);
        add(lblGlass);
        
        txtGlass = new JTextField();//a JTextField to get how many glasses of beverage is the user want
        txtGlass.setSize(150, 25);
        txtGlass.setLocation(100, 325);
        add(txtGlass);
        
        btnbevAdd = new JButton("Add");
        btnbevAdd.setSize(80, 40);
        btnbevAdd.setLocation(250, 325);
        add(btnbevAdd);
        
        lblReport = new JLabel();//will be showing report of the beverages that added.
        lblReport.setSize(500, 50);
        lblReport.setLocation(70, 365);
        add(lblReport);

        //For Fast Food.
        lblffnm = new JLabel("FAST FOOD ORDER:");//a JLabel that labels the Text Field
        lblffnm. setFont(font);
        lblffnm.setSize(500, 50);
        lblffnm.setLocation(100, 395);
        add(lblffnm);
        
        lblffSize = new JLabel("Select size:");// a JLabel that labels the comboBox
        lblffSize.setSize(250, 50);
        lblffSize.setLocation(100, 425);
        add(lblffSize);

        String[] ffsizes = {"Small","Medium","Large"};
        ffsize = new JComboBox<String>(sizes);//
        ffsize.setSelectedIndex(0);//default selection is small
        ffsize.setSize(100, 25);
        ffsize.setLocation(100, 460);
        add(ffsize);

        lblff = new JLabel("Select which type of Fast Food you want to order:");//a JLabel that labels the radioButtons
        lblff.setSize(500, 50);
        lblff.setLocation(100, 495);
        add(lblff);

        btnffGroup = new ButtonGroup();

        rdBurger = new JRadioButton("Burger");
        rdBurger.setSize(75, 50);
        rdBurger.setLocation(100, 530);
        add(rdBurger);

        rdpizza = new JRadioButton("Pizza");
        rdpizza.setSize(75, 50);
        rdpizza.setLocation(175, 530);
        add(rdpizza);

        btnffGroup.add(rdBurger);
        btnffGroup.add(rdpizza);


        lblPiece = new JLabel("Type how many pieces you want to order:");//a JLabel that labels the Text Field
        lblPiece.setSize(500, 50);
        lblPiece.setLocation(100, 570);
        add(lblPiece);

        txtpiece = new JTextField();//a JTextField to get how many glasses of beverage is the user want
        txtpiece.setSize(150, 25);
        txtpiece.setLocation(100, 610);
        add(txtpiece);
        
        btnffAdd = new JButton("Add");
        btnffAdd.setSize(80, 40);
        btnffAdd.setLocation(250, 610);
        add(btnffAdd);

        lblffReport = new JLabel();//will be showing report of the beverages that added.
        lblffReport.setSize(500, 50);
        lblffReport.setLocation(100, 650);
        add(lblffReport);
        
        //For Hot Drinks
        lblhdnm = new JLabel("HOT DRINKS ORDER:");//a JLabel that labels the Text Field
        lblhdnm. setFont(font);
        lblhdnm.setSize(500, 50);
        lblhdnm.setLocation(400, 110);
        add(lblhdnm);
        
        lblhdSize = new JLabel("Select size:");// a JLabel that labels the comboBox
        lblhdSize.setSize(250, 50);
        lblhdSize.setLocation(400, 140);
        add(lblhdSize);

        String[] hdsizes = {"Small","Medium","Large"};
        hdsize = new JComboBox<String>(sizes);//
        hdsize.setSelectedIndex(0);//default selection is small
        hdsize.setSize(100, 25);
        hdsize.setLocation(400, 175);
        add(hdsize);

        lblhd = new JLabel("Select which type of Hot Drink you want to order:");//a JLabel that labels the radioButtons
        lblhd.setSize(500, 50);
        lblhd.setLocation(400, 210);
        add(lblhd);

        btnhdGroup = new ButtonGroup();

        rdTea = new JRadioButton("Tea");
        rdTea.setSize(75, 50);
        rdTea.setLocation(400, 245);
        add(rdTea);
        
        rdCoffee = new JRadioButton("Coffee");
        rdCoffee.setSize(75, 50);
        rdCoffee.setLocation(475, 245);
        add(rdCoffee);

        btnhdGroup.add(rdTea);
        btnhdGroup.add(rdCoffee);


        lblCups = new JLabel("Type how many cups you want to order:");//a JLabel that labels the Text Field
        lblCups.setSize(500, 50);
        lblCups.setLocation(400, 285);
        add(lblCups);

        txtcup = new JTextField();//a JTextField to get how many glasses of beverage is the user want
        txtcup.setSize(150, 25);
        txtcup.setLocation(400, 325);
        add(txtcup);
        
        btnhdAdd = new JButton("Add");
        btnhdAdd.setSize(80, 40);
        btnhdAdd.setLocation(550, 325);
        add(btnhdAdd);
        
        lblhdReport = new JLabel();//will be showing report of the beverages that added.
        lblhdReport.setSize(500, 50);
        lblhdReport.setLocation(400, 365);
        add(lblhdReport);
        
        btnOrder = new JButton("Order");
        btnOrder.setSize(120, 40);
        btnOrder.setLocation(350, 690);
        btnOrder.setEnabled(false);
        add(btnOrder);  
        
        ratelist = new JTextArea();
        ratelist. setFont(irate);
        ratelist.setSize(320, 240);
        ratelist.setLocation(400, 400);
        add(ratelist);
        ratelist.setText("Rate List:\n\nJuice: Small=Rs.150, Medium=Rs.200, Large=Rs.250\n\nWater: Small=Rs.10, Medium=Rs.30, Large=Rs.50\n\nTea: Small=Rs.50, Medium=Rs.70, Large=Rs.100\n\nCoffee: Small=Rs.100, Medium=Rs.150, Large=Rs.180\n\nBurger: Small=Rs.350, Medium=Rs.400, Large=Rs.500\n\nPizza: Small=Rs.800, Medium=Rs.1200, Large=Rs.1500");
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String size_of_bev = (String)size.getSelectedItem();
        String size_of_ff = (String)ffsize.getSelectedItem();
        String size_of_hd = (String)hdsize.getSelectedItem();
        if(!txtname.getText().isEmpty()){
            if(e.getSource().equals(btnbevAdd)) {
                if( rdJuice.isSelected()|| rdWater.isSelected() && !(txtGlass.getText().isEmpty())) {
                    try {
                        amount_of_bev  = Integer.parseInt(txtGlass.getText().trim());
                        Beverage bvg=null;
                        if(rdJuice.isSelected())  { bvg = new Juice(size_of_bev,amount_of_bev,this); }
                        else if(rdWater.isSelected())  { bvg = new Water(size_of_bev,amount_of_bev,this); }
                        txtGlass.setText(null);
                        list_of_bvr.add(bvg);
                        lblReport.setText(bvg.toString()+" added");
                        lblReport.setText(bvg.toString()+" added");
                        btnGroup.clearSelection();
    
                        btnOrder.setEnabled(true);
                    }
                    catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
                        JOptionPane.showMessageDialog(this, "Enter an integer as amount");}
                }
                else { JOptionPane.showMessageDialog(this, "Choose a Beverage type and enter an amount");
                //if none of the radio buttons are selected or the textField is empty
                }
            }
            
                
                //for Fast Food Add Button Functionality.
            
            if(e.getSource().equals(btnffAdd)) {
                if(rdBurger.isSelected() ||rdpizza.isSelected() &&!(txtpiece.getText().isEmpty())) {
                    try {
                        amount_of_ff  = Integer.parseInt(txtpiece.getText().trim());
                        Fast_Food ff=null;
                        if(rdBurger.isSelected())  { ff = new Burger(size_of_ff,amount_of_ff,this); }
                        else if(rdpizza.isSelected())  { ff = new Pizza(size_of_ff,amount_of_ff,this); }
                        txtpiece.setText(null);
                        list_of_ff.add(ff);
                        lblffReport.setText(ff.toString()+" added");
                        lblffReport.setText(ff.toString()+" added");
                        btnffGroup.clearSelection();
        
                        btnOrder.setEnabled(true);
                    }
                    catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
                        JOptionPane.showMessageDialog(this, "Enter an integer as amount");}
                    }
                    else { JOptionPane.showMessageDialog(this, "Choose a Fast Food type and enter an amount");
                    //if none of the radio buttons are selected or the textField is empty
                    }
                }
            
                
            //For Hot Drinks Add Button Functionality.
            if(e.getSource().equals(btnhdAdd)) {
                if( rdTea.isSelected() || rdCoffee.isSelected() && !(txtcup.getText().isEmpty())) {
                    try {
                        amount_of_hd  = Integer.parseInt(txtcup.getText().trim());
                        Hot_Drink hd;
                        if(rdTea.isSelected())    { hd = new Tea(size_of_hd,amount_of_hd,this); }
                        else { hd = new Coffee(size_of_hd,amount_of_hd,this); }
                        txtcup.setText(null);
                        list_of_hd.add(hd);
                        lblhdReport.setText(hd.toString()+" added");
                        lblhdReport.setText(hd.toString()+" added");
                        btnhdGroup.clearSelection();
        
                        btnOrder.setEnabled(true);
                }
                        catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
                            JOptionPane.showMessageDialog(this, "Enter an integer as amount");}
                    }
                    else { JOptionPane.showMessageDialog(this, "Choose a Hot Drink type and enter an amount");
                    //if none of the radio buttons are selected or the textField is empty
                    }
                }
        }else{JOptionPane.showMessageDialog(this, "Enter your name to order","Title",JOptionPane.WARNING_MESSAGE);}
        //Order Button Functionality.
        if(e.getSource().equals(btnOrder)) {

            String bev_report = "";
            String ff_report = "";
            String hd_report = "";
            double bev_pay=0.0, ff_pay=0.0, hd_pay=0.0, pay = 0;
            for(int i=0;i<(list_of_bvr.size());i++) {
                Beverage bvgi = list_of_bvr.get(i);
                bev_report += bvgi.toString();
                double totalprice_of_bvg = bvgi.getAmount() * bvgi.getPrice();
                bev_pay += totalprice_of_bvg; // add the total amount to be paid
                bev_report = bev_report + " - Rs."+totalprice_of_bvg+".\n";
            }
            
            for(int i=0;i<(list_of_ff.size());i++){
                Fast_Food ff = list_of_ff.get(i);
                ff_report += ff.toString();
                double totalprice_of_ff = ff.getffAmount() * ff.getffPrice();
                ff_pay += totalprice_of_ff; // add the total amount to be paid
                ff_report = ff_report + " - Rs."+totalprice_of_ff+".\n";
            }
             
            for(int i=0;i<(list_of_hd.size());i++){
                Hot_Drink hd = list_of_hd.get(i);
                hd_report += hd.toString();
                double totalprice_of_hd = hd.gethdAmount() * hd.gethdPrice();
                hd_pay += totalprice_of_hd; // add the total amount to be paid
                hd_report = hd_report + " - Rs."+totalprice_of_hd+".\n";
                
            }
            pay=bev_pay+ff_pay+hd_pay;
            if(!txtname.getText().isEmpty()){
            try {
                    FileOutputStream s =new FileOutputStream("Orders.txt", true); //file handling
                    PrintWriter outFile = new PrintWriter(s);
                    String getValue = txtname.getText();
                    outFile.println("Order of "+getValue);
                    String getValue1 = bev_report;
                    outFile.println(getValue1);
                    String getValue2 = ff_report;
                    outFile.println(getValue2);
                    String getValue3 = hd_report;
                    outFile.println(getValue3);
                    outFile.println(getValue+" has to pay Rs."+pay);
                    outFile.print("**********************************************************************************\n");
                    outFile.close();
                }
                catch (FileNotFoundException ef) {
                    System.out.println(ef.getMessage());
                }
            
            }else{JOptionPane.showMessageDialog(this, "Enter your name to order");}
            
            JOptionPane.showMessageDialog(this, bev_report+ff_report+hd_report);
            JOptionPane.showMessageDialog(this, "Your order is placed. \nYou should pay Rs."+pay);

            txtname.setText(null);
            lblReport.setText(null);
            lblffReport.setText(null);
            lblhdReport.setText(null);
            btnOrder.setEnabled(false);
            list_of_bvr.clear();
            list_of_ff.clear();
            list_of_hd.clear();
        }    
    }

    
}

class Fast_Food {

    private String size;
    private int amount;
    private double price;



    public Fast_Food(String size, int amount){
        super();
        this.size = size;
        this.amount = amount;
        price = 0.0;
    }


    public String getffSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public double getffPrice(){
        return price;
    }
    public void setffPrice(Double price){
        this.price = price;
    }

    public int getffAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        
        return String.format("%d %s Piece(s) of ", this.getffAmount(), this.getffSize());
    }
}



class Pizza extends Fast_Food {


    private String type;
    String[] types = {"BBQ(price *= 1.25)", "Cheese", "Hot n Spicy(price *= 1.2)"};

    public Pizza(String size, int amount, Label lbl) {
        super(size, amount);
        try {
            type = (String) JOptionPane.showInputDialog(lbl, "Select Type.", "Select Type",
                    JOptionPane.QUESTION_MESSAGE, null, types, types[0]);
            double price;
            if (size.equals("Small"))
                price = 800.0;
            else if (size.equals("Medium"))
                price = 1200.0;
            else
                price = 1500.0;
            if (type.equals("BBQ"))
                price *= 1.25;
            if (type.equals("Hot n Spicy"))
                price *= 1.2;
            setffPrice(price);
        } catch (NullPointerException e) {
        }
    }
    @Override
    public String toString() {
        return super.toString()+type+" Pizza";
    }
}

 

class Burger extends Fast_Food {



    private String type;
    String[] types = { "Zinger(price *= 1.2)", "Double Steak(price *= 1.5)", "Cheese" };

        public Burger(String size, int amount, Label lbl) {
        super(size, amount);
        try {
            type = (String) JOptionPane.showInputDialog(lbl, "Select Type.", "Select Type",
                    JOptionPane.QUESTION_MESSAGE, null, types, types[0]);
            double price;
            if (size.equals("Small"))
                price = 350.0;
            else if (size.equals("Medium"))
                price = 400.0;
            else
                price = 500.0;
            if (type.equals("Zinger"))
                price *= 1.2;
            if (type.equals("Double Steak"))
                price *= 1.5;
            setffPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
    public String toString() {
        return super.toString()+type+" burger";
    }
}

class Beverage {
    private String size;
    private int amount;
    private double price;



    public Beverage(String size, int amount){
        super();
        this.size = size;
        this.amount = amount;
        price = 0.0;
    }


    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return String.format("%d %s glass(es) of ", this.getAmount(), this.getSize());
    }
}

class Juice extends Beverage {
    private String fruit;
    String[] fruits = { "Apple", "Orange", "Pineapple(price *= 1.2)" ,"Banana","Strawberry(price *= 1.5)","Mango"};

    public Juice(String size, int amount, Label lbl) {
        super(size, amount);
        try {
            fruit = (String) JOptionPane.showInputDialog(lbl, "Select a fruit.", "Select a fruit",
                    JOptionPane.QUESTION_MESSAGE, null, fruits, fruits[0]);
            double price;
            if (size.equals("Small"))
                price = 150.0;
            else if (size.equals("Medium"))
                price = 200.0;
            else
                price = 250.0;
            if (fruit.equals("Orange"))
                price *= 1.0;
            if (fruit.equals("Pineapple"))
                price *= 1.2;
                if (fruit.equals("Banana"))
                price *= 1.0;
                if (fruit.equals("Mango"))
                price *= 1.0;
                if (fruit.equals("Strawberry"))
                price *= 1.5;
            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
    public String toString() {
        return super.toString()+fruit+" juice";
    }
}


class Water extends Beverage {
    private boolean iced;

    public Water(String size,int amount,Label lbl) {
        super(size,amount);
        if(JOptionPane.showConfirmDialog(lbl, "Would you like ice?((price *= 1.1)","Ice",JOptionPane.YES_NO_OPTION)==0) iced=true;
        else iced=false;
        double price;
        if(size.equals("Small")) price = 10.0;
        else if(size.equals("Medium")) price = 30.0;
        else price = 50.0;
        if(iced) price *= 1.1; 
        setPrice(price);
    }

    @Override
    public String toString() {
        if(iced) return super.toString()+"Water with ice";
        else return super.toString() + "Water";
    }
}




class Hot_Drink
{
    private String size;
        private int amount;
        private double price;
    
    
    
        public Hot_Drink(String size, int amount){
            super();
            this.size = size;
            this.amount = amount;
            price = 0.0;
        }
    
    
        public String gethdSize(){
            return size;
        }
        public void sethdSize(String size){
            this.size = size;
        }
    
        public double gethdPrice(){
            return price;
        }
        public void sethdPrice(Double price){
            this.price = price;
        }
    
        public int gethdAmount(){
            return amount;
        }
        public void sethdAmount(int amount){
            this.amount = amount;
        }
    
        @Override
        public String toString(){
            return String.format("%d %s cup(s) of ", this.gethdAmount(), this.gethdSize());
        }
}

class Coffee extends Hot_Drink {
    private boolean milk; 

    public Coffee(String size,int amount,Label lbl) {
        super(size, amount);
        if(JOptionPane.showConfirmDialog(lbl, "Would you like milk?(price *= 1.25)","Milk",JOptionPane.YES_NO_OPTION)==0) milk=true;
        else milk=false;

        double price;
        if(size.equals("Small")) price= 100.50;
        else if(size.equals("Medium")) price = 150.0;
        else price = 180.0;
        if(milk) price *= 1.25;
        sethdPrice(price);
    }

    @Override
    public String toString() {
        if(milk) return super.toString()+" Coffee with milk";
        else return super.toString()+" Coffee";
    }
}


 class Tea extends Hot_Drink {
    private boolean sugar;

    public Tea(String size,int amount,Label lbl) {
        super(size,amount);
        if(JOptionPane.showConfirmDialog(lbl, "Would you like sugar?(price *= 1.1)","Sugar",JOptionPane.YES_NO_OPTION)==0) sugar=true;
        else sugar=false;
        double price;
        if(size.equals("Small")) price= 50.0;
        else if(size.equals("Medium")) price= 70.0;
        else price= 100.0;
        if(sugar) price*=1.1;
        sethdPrice(price);
    }
    
    @Override
    public String toString() {
        if(sugar) return super.toString()+"Tea with sugar";
        else return super.toString() + "Tea";
    }
}




