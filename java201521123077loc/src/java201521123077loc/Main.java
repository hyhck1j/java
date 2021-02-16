package java201521123077loc;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int num ;
		double power=0;
		double max=1;
		
		while(in.hasNextInt())
		{	
			num=in.nextInt();
			if(num<0)
			{
				System.out.println("0");
				continue;
			}
			//num=Math.abs(num);
			while(max<=num)
			{
				power++;
				max=Math.pow(2.0, power);
			}
			//System.out.println("power="+power);
			System.out.println((int)(32-power));
			power=0;
			max=1;
		}	
		in.close();
	}

}

