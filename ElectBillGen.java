import java.util.Scanner;
class ElectBill
{
int consumerNumber;
String consumerName;
int prevReading;
int currReading;
int billedUnits;
int ebConn;
double bill;
void inputdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("\n Enter Consumer Number: ");
consumerNumber = sc.nextInt();
System.out.println("\n Enter Consumer Name: ");
consumerName = sc.next();
System.out.println("\n Enter Previous Units: ");
prevReading = sc.nextInt();
System.out.println("Enter Current Units consumed:");
currReading = sc.nextInt();
System.out.println("Enter the types of EB Connection(1.domestic or 2.commercial)");
ebConn = sc.nextInt();
billedUnits=currReading-prevReading;
}
double calculatebill()
{
switch(ebConn)
{
case 1:
if(billedUnits>=0 && billedUnits<=100)
bill=billedUnits*1;
else if(billedUnits>100 && billedUnits <= 200)
bill=(100*1)+((billedUnits-100)*2.50);
else if(billedUnits>200 && billedUnits <= 500)
bill=(100*1)+(100*2.50)+((billedUnits-200)*4);
else if(billedUnits>500)
bill=(100*1)+(100*2.50)+(300*4)+((billedUnits-500)*6);
break;
case 2:
if(billedUnits>=0 && billedUnits<=100)
bill=billedUnits*2;
else if(billedUnits>100 && billedUnits <= 200)
bill=(100*2)+((billedUnits-100)*4.50);
else if(billedUnits>200 && billedUnits <= 500)
bill=(100*2)+(100*4.50)+((billedUnits-200)*6);
else if(billedUnits>500)
bill=(100*2)+(100*4.50)+(300*6)+((billedUnits-500)*7);
break;
}
return bill;
}
void display()
{
System.out.println("----------------------------------");
System.out.println("ELCTRICITY BILL");
System.out.println("----------------------------------");
System.out.println("Consumer Number: "+consumerNumber);
System.out.println("Consumer Name: "+consumerName);
System.out.println("Consumer Previous Units: "+prevReading);
System.out.println("Consumer Current Units: "+currReading);
System.out.println("Billed units: "+billedUnits);
System.out.println("Type of EBConnection: "+ebConn);
System.out.println("----------------------------------");
System.out.println("Total Amount(Rs.): "+bill);
}}
class ElectBillGen {
public static void main (String[] args) {
ElectBill b=new ElectBill();
b.inputdata();
b.calculatebill();
b.display(); }}