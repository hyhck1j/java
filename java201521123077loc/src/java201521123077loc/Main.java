package java201521123077loc;

//U2 5.2
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {	
		StringBuilder   str=new StringBuilder();
		Scanner in=new Scanner(System.in);
		int num=0;
		int begin=0;
		int end=0;
		while(in.hasNextInt())
		{
			
			num=in.nextInt();
			begin=in.nextInt();
			end=in.nextInt();
			if(str.length()<num)
			{
				str=new StringBuilder();
			}
			for(int i=0;i<num;i++)
			{
				str.append(i);
			}
			System.out.println(str.substring(begin,end));		
		}
		in.close();
	}
}