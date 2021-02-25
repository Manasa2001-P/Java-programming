
abstract class shape
{
	int length,breadth;
	shape(int a)
	{
		length=a;
		breadth=a;
	}
	shape(int x,int y)
	{
		length=x;
		breadth=y;
	}
	abstract void printArea();
}
class rectangle extends shape
{
	rectangle(int x,int y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("rectangle area is :"+(length*breadth));
	}
}
class triangle extends shape
{
	triangle(int x,int y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("rectangle area is :"+(0.5*length*breadth));
	}
}
class Circle extends shape
{
	Circle(int x)
	{
		super(x);
	}
	void printArea()
	{
		System.out.println("Area of circle :"+(3.14*length*length));
	}
}
public class Abstract {
	public static void main(String args[])
	{
		shape s;
		rectangle r=new rectangle(5,10);
		s=r;
		s.printArea();
		System.out.println("***************");
		triangle t=new triangle(5,7);
		s=t;
		s.printArea();
		System.out.println("***************");
		Circle c=new Circle(7);
		s=c;
		s.printArea();
	}
}
