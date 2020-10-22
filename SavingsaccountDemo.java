import java.io.*;
import java.util.*;
class SavingsAccount{
    static double anualinterestrate=0;
    private double savingsbalance;
    public SavingsAccount(double savingsbal){
        savingsbalance=savingsbal;
    }
    public double calculatemonthlyinterest(){
        double monthlyinterest=(savingsbalance*anualinterestrate)/2;
        savingsbalance+=monthlyinterest;
        return savingsbalance;
    }
    public static void modifyinterestrate(double interestrate){
        anualinterestrate=interestrate;
    }
}
public class SavingsaccountDemo{
    public static void main(String args[]){
        SavingsAccount saver1=new SavingsAccount(2000.00);
        SavingsAccount saver2=new SavingsAccount(3000.00);
        saver1.modifyinterestrate(0.04);
        System.out.println("Balance of saver1"+saver1.calculatemonthlyinterest());
        System.out.println("Balance of saver2"+saver2.calculatemonthlyinterest());
        saver1.modifyinterestrate(0.05); 
        System.out.println("Balance of saver1"+saver1.calculatemonthlyinterest());
        System.out.println("Balance of saver2"+saver2.calculatemonthlyinterest());
    }
}



