package u5Collections;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		
		int arr1[]=new int[amount];
		int loc1=0;	
		int arr2[]=new int[amount];
		int loc2=0;
		int num=0;
		for(int i=0;i<amount;i++)
		{
			num=in.nextInt();
			//为偶数的顾客则去B窗口
			if(num%2==0)
			{
				arr2[loc2++]=num;
			}
			else
			{
				arr1[loc1++]=num;
			}
		}
		for(int i=0,j=0,count=0;count<amount;)
		{
			if(i<loc1)
			{
				if(count==amount-1)
					System.out.print(arr1[i++]);
				else
					System.out.print(arr1[i++]+" ");
				count++;
			}			
			if(i<loc1)
			{
				if(count==amount-1)
					System.out.print(arr1[i++]);
				else
					System.out.print(arr1[i++]+" ");
				count++;
			}
			if(j<loc2)
			{
				if(count==amount-1)
					System.out.print(arr2[j++]);
				else
					System.out.print(arr2[j++]+" ");
				count++;
			}
			
		}	
		in.close();
	}

}

