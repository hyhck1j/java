package java201521123077loc;



import java.util.Arrays;
import java.util.Scanner;
public class Main {
	private int [] arr=new int[8];
	public void getBirthDate(Scanner in){	
		int amount=in.nextInt(); 
		for(int i=0;i<amount;i++)
		{
			String id=in.next();
			System.out.println(id.substring(6, 10)+"-"+id.substring(10, 12)+"-"+id.substring(12, 14));
		}
	
	}
	public int search(Scanner in){
		int pos=-1;	
		int num=in.nextInt();
		for(int i=0;i<arr.length;i++)
		{		
			if(arr[i]==num)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}
	public void fib(Scanner in){
//		in.useDelimiter("\n");
		int num=0;
//		if(in.hasNextInt())
			num=in.nextInt();
		int first=1,second=1,next=first+second;
		if(num<=0)
		{
			System.out.println("Num>0   num:"+num);
			return;
		}
		else if(num==1)
		{
			System.out.println("1");
		}
		else if(num==2)
		{
			System.out.println("1 1");
		}
		else
		{
			System.out.print("1 1");
			for(int i=3;i<=num;i++)
			{
				System.out.print(" "+next);
				first=second;
				second=next;
				next=first+second;		
			}
			System.out.println();
		}	

	}
	public  void sort(Scanner in){
		String num=in.nextLine();
		String numSpilit[]=num.split(" ");
		arr=Arrays.copyOf(arr,numSpilit.length );//update the arrays
		for(int i=0;i<numSpilit.length;i++)
		{		
			arr[i]=Integer.parseInt(numSpilit[i]);		
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {	
		Main menu=new Main();
		Scanner in=new Scanner(System.in);	
		String command;
		while(in.hasNext())
		{
			
			command=in.nextLine();
			if(command.equals("fib"))
			{
				menu.fib(in);
			}
			else if(command.equals("sort"))
			{
				menu.sort(in);
			}
			else if(command.equals("search"))
			{
				System.out.println(menu.search(in));
			}
			else if(command.equals("getBirthDate"))
			{
				menu.getBirthDate(in);
			}
			else if(command.equals(""))
			{
//				System.out.println("EMPTY");
			}
			else
			{
				System.out.println("exit");
			}			
		}
		in.close();		
	}
}


