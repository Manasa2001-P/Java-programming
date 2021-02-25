package converters;
import java.util.*;
public class distance
{
	double km,m,miles;
	Scanner sc=new Scanner(System.in);
	public void kmtom()
	{
		System.out.println("enter in km");
		km=sc.nextDouble();
		m=(km*1000);
		System.out.println(km+"km"+"equal to"+m+"metres");
	}
	public void mtokm()
	{
		System.out.println("enter in meter");
		m=sc.nextDouble();
		km=(m/1000);
		System.out.println(m+"m"+"equal to"+km+"kilometres");
	}
	public void milestokm()
	{
		System.out.println("enter in miles");
		miles=sc.nextDouble();
		km=(miles*1.60934);
		System.out.println(miles+"miles"+"equal to"+km+"kilometres");
	}
	public void kmtomiles(){
		System.out.println("enter in km");
		km=sc.nextDouble();
		miles=(km*0.621371);
		System.out.println(km+"km"+"equal to"+miles+"miles");
	}
}
