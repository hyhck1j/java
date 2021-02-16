package java201521123077loc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner in=new Scanner(System.in);	
		String str;
		boolean negative;
		while(in.hasNext())
		{
			negative=false;
			str=in.nextLine();
			int num=Integer.decode(str);
			if(num<0)
			{
				num*=-1;
				negative=true;
			}
			if(num>=10000&&num<=20000)
			{
				System.out.print(Integer.toBinaryString(num)+",");
				System.out.print(Integer.toOctalString(num)+",");
				System.out.println(Integer.toHexString(num));
			}
			else
			{
		        String[] ss = str.split(""); 
		        int first=1;
		        int sum=0;
		        if(negative)first=2;
		        for(int i = first; i < ss.length; i++)
		        { 
		            System.out.print(ss[i]+" ");
		            sum+= Integer.decode(ss[i]);
		        }		    
		        System.out.println(sum);
			}			
		}
		in.close();
	}

}
