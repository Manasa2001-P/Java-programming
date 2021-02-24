import java.io.*;
import java.util.*;
 public class MyExceptions
{
	public static void main(String args[])
	{
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
	try
	{
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x/y;
		System.out.println(z);
	}
	catch(InputMismatchException ime)
	{
		System.out.println(ime);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}

	finally
	{
		System.out.println("Program ended");

	}
	}
}
	