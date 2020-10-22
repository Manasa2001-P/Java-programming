import java.io.*;
import java.util.Scanner;
class Invoice{
        private String number;
        private String description;
        private int quantity;
        private double price; 
        public Invoice(){ }
        //Define parameterized constructor here
        public Invoice(String number,String description,int quantity,double price){
            this.number=number;
            this.description=description;
            this.quantity=quantity;
            this.price=price;
        } 
       // Setters
       public void setnumber(String n){number=n;}
       public void setdescription(String d){description=d;}
       public void setquantity(int q){quantity=q;}
       public void setprice(double p){price=p;}
       

       // Getters
       public String getnumber(){return number;}
       public String getdescription(){return description;}
       public int getquantity(){return quantity;} 
       public double getprice(){return price;}
       
       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if(quantity<0){quantity=0;}
                if(price<0){price=0.0;}
                invoiceAmount=quantity*price; 
                return invoiceAmount;
       }
}
public class InvoiceDemo{
         public static void main(String []args){
                   Invoice myInvoice=new Invoice("1","key board",20,210.00);
                   myInvoice.setnumber("1"); 
                   myInvoice.setdescription("key board");
                   myInvoice.setquantity(20);
                   myInvoice.setprice(210.00);
                   System.out.println(myInvoice.getInvoiceAmount()); 
                   
         }
}