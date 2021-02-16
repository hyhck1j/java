package java201521123077loc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner in=new Scanner(System.in);	
		String str;
		while(in.hasNext())
		{
			str=in.nextLine();
			str=str.replace("-","");
			str=str.replace(".","");
			int sum=0;
	        String[] ss = str.split(""); 
	        for(int i = 1; i < ss.length; i++)
	        { 
	            sum+= Integer.decode(ss[i]);
	        }		    
	        System.out.println(sum);					
		}
		in.close();
	}
}

