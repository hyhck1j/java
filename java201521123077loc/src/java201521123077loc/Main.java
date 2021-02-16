package java201521123077loc;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int a,b;
		
		while(in.hasNextInt())
		{
			a=in.nextInt();
			b=in.nextInt();
			if(Math.abs(a)>1000)
				System.out.println("a<=1000");
			else
				System.out.println(a+b);
		}	
		in.close();
	}

}