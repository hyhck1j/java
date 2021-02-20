package java201521123077loc;


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		BigDecimal  first,second;
		while(in.hasNextDouble())
		{
			first=in.nextBigDecimal();
			second=in.nextBigDecimal();
			System.out.println(first.add(second));
			System.out.println(first.multiply(second));
		}
		in.close();

	}

}
