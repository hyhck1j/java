package java201521123077loc;

import java.util.Scanner;

public  class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String str=new String();
		int num1,num2;
		Shape shape[]=new Shape[n];
		double sumArea=0.0,sumPerimeter=0.0;
		int cnt=0;
		while(n-->0)
		{
			str=in.next();
			if(str.equals("rect"))
			{
				num1=in.nextInt();
				num2=in.nextInt();
				shape[cnt]=new Rectangle(num1,num2);
				sumArea+=shape[cnt].getArea();
				sumPerimeter+=shape[cnt].getPerimeter();
			}
			else if(str.equals("cir"))
			{
				num1=in.nextInt();
				shape[cnt]=new Circle(num1);
				sumArea+=shape[cnt].getArea();
				sumPerimeter+=shape[cnt].getPerimeter();
			}
			cnt++;
			
		}

		System.out.printf("%.2f\n%.2f\n",sumArea,sumPerimeter);
		for(int i=0;i<shape.length;i++)
		{
			System.out.println(shape[i].getClass().getSuperclass());
		}
		
	}
}

abstract class Shape {
	

	protected static double PI=3.14;
	
	public double getPerimeter()
	{
		return 0.0;
	}
	public double getArea()
	{
		return 0.0;
	}
	

}
class Rectangle extends Shape
{
	int width;
	int length;
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	public double getPerimeter()
	{
		return 2*(width+length);
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	public double getArea()
	{
		return width*length;
	}
}
class Circle extends Shape
{
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double getPerimeter()
	{
		return (2*radius*Math.PI);
	}
	public double getArea()
	{
		return (Math.PI*Math.pow(radius,2));
	}
}