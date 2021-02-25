package converters;
import java.util.*;
import java.io.*;

import converters.distance;

class ConvertersDemo
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int choice,ch;
		distance d=new distance();
		do{

			System.out.println("7.meter to kilometer");
			System.out.println("8.kilometer to meter");
			System.out.println("9.miles to kilometer");
			System.out.println("10.kilometer to miles");
			System.out.println("enter your choice");
			choice=s.nextInt();
			switch(choice)
			{
			
				case 7:
				{
					d.mtokm();
					break;
				}
				case 8:
				{
					d.kmtom();
					break;
				}
				case 9:
				{
					d.milestokm();
					break;
				}
				case 10:
				{
					d.kmtomiles();
					break;
				}
			}
			System.out.println("enter 0 to exit  1 to continue");
			ch=s.nextInt();
		}while(ch==1);
	}
}