package java201521123077loc;



import java.util.Scanner;

public class Main {

/*	
 * 	��ֵ�������6λС����ʹ��System.out.printf("%.6f\n")
	�ο�Math.pow����
*/
	public static double sqrt(double num)
	{
		final double leap=0.0001;
		final double epsilon=0.0001;
		double cur=0.0;
		double ans=0.0;
		while(ans<num&&num-ans>=epsilon)
		{
			cur+=leap;
			ans=Math.pow(cur,2);
		}
		return cur;
	}
	public static void main(String[] args) {	
		Scanner in=new Scanner(System.in);	
		double num;
		while(in.hasNextDouble())
		{
			num=in.nextDouble();
			if(num<0)
				System.out.println(Double.NaN);
			else
			{
				System.out.printf("%.6f\n",sqrt(num));
			}
		}
		in.close();
	}
}
