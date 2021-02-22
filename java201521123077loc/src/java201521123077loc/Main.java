package java201521123077loc;


import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {		
		Scanner in=new Scanner(System.in);
//		int amount=in.nextInt();
		int length1=in.nextInt();
		int width1=in.nextInt();
		int length2=in.nextInt();
		int width2=in.nextInt();
		Rectangle[]arrRec=new Rectangle[2];
		arrRec[0]=new Rectangle(length1,width1);
		arrRec[1]=new Rectangle(length2,width2);
		int radius1=in.nextInt();
		int radius2=in.nextInt();
		Circle[]arrCir=new Circle[2];
		arrCir[0]=new Circle(radius1);
		arrCir[1]=new Circle(radius2);
		int perimeterSum=0;
		int areaSum=0;
		for(int i=0;i<arrRec.length;i++)
		{
			perimeterSum+=arrRec[i].getPerimeter();
			areaSum+=arrRec[i].getArea();
		}
		for(int i=0;i<arrCir.length;i++)
		{
			perimeterSum+=arrCir[i].getPerimeter();
			areaSum+=arrCir[i].getArea();
		}
		System.out.println(perimeterSum);
		System.out.println(areaSum);
		System.out.println(Arrays.deepToString(arrRec));
		System.out.println(Arrays.deepToString(arrCir));
	}
}
class Rectangle
{
	int width;
	int length;
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	public int getPerimeter()
	{
		return 2*(width+length);
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	public int getArea()
	{
		return width*length;
	}
}
class Circle
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

	public int getPerimeter()
	{
		return (int)(2*radius*Math.PI);
	}
	public int getArea()
	{
		return (int)(Math.PI*Math.pow(radius,2));
	}
}