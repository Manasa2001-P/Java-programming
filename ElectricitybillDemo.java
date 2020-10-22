import java.io.*;
import java.util.*;
class Electbill{
    private int consumerno;
    private String consumername;
    private int prevreading;
    private int currreading;
    private String Ebconn;
    public Electbill(int consumerno,String consumername,int prevreading,int currreading,String Ebconn){
        this.consumerno=consumerno;
        this.consumername=consumername;
        this.prevreading=prevreading;
        this.currreading=currreading;
        this.Ebconn=Ebconn;
    }
    public void setconsumerno(int consumerno){this.consumerno=consumerno;}
    public void setconsumername(String consumername){this.consumername=consumername;}
    public void setprevreading(int prevreading){this.prevreading=prevreading;}
    public void setcurrreading(int currreading){this.currreading=currreading;} 
    public void setEbconn(String Ebconn){this.Ebconn=Ebconn;}
    public int getconsumerno(){return consumerno;}
    public String getconsumername(){return consumername;}
    public int getprevreading(){return prevreading;}
    public int getcurrreading(){return currreading;}
    public String  getEbconn(){return Ebconn;}
    public double billamount(){
        double unitsused=currreading-prevreading;
        double amount=0.0;
        if(Ebconn=="domestic"){
            if(unitsused<=100){
                amount=unitsused;
            }
            else if(unitsused>100&&unitsused<=200){
                amount=unitsused*2.50;
            }
            else if(unitsused>200&&unitsused<=500){
                amount=unitsused*4;
            }
            else{
                amount=unitsused*6;
            }
        }
        if(Ebconn=="commercial"){
            if(unitsused<=100){
                amount=unitsused*2;
            }
            else if(unitsused>100&&unitsused<=200){
                amount=unitsused*4.50;
            }
            else if(unitsused>200&&unitsused<=500){
                amount=unitsused*6;
            }
            else{
                amount=unitsused*7;
            }
        }
        return amount;
    }
}
public class ElectricitybillDemo{
    public static void main(String args[]){
        Electbill bill=new Electbill(15643,"Abhi",4321,5432,"commercial");
        bill.setconsumerno(15643);
        bill.setconsumername("Abhi");
        bill.setprevreading(4321);
        bill.setcurrreading(5432);
        bill.setEbconn("commercial");
        System.out.println(bill.billamount());
    }
}