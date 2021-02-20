package java201521123077loc;


import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		BigInteger sum=new BigInteger("0");
		String str;
		while(in.hasNext())
		{
			str=in.next();
			if(str.equals("e")||str.equals("E"))
			{
				break;
			}
			BigInteger num=new BigInteger(str);	
			sum=sum.add(num);
		}
		System.out.println(sum);
		in.close();

	}

}
