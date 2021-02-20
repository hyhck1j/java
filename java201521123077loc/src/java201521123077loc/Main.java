package java201521123077loc;



import java.util.List;
import java.util.Scanner;
public class Main {
	private class Id 
	{
		String str;
		int year;
		int month;
		int day;
		public Id()
		{
			this.str=new String();
//			this.str=new StringBuilder(str);
//			this.extract();
		}
		public void extract()
		{
//			id.substring(6, 10)+"-"+id.substring(10, 12)+"-"+id.substring(12, 14));
			this.year=Integer.parseInt(str.substring(6, 10));
			this.month=Integer.parseInt(str.substring(10, 12));
			this.day=Integer.parseInt(str.substring(12, 14));
		}
		
	}
	int Partition(Id A[], int down, int up)
	{
		Id pivot = A[down];
		int low = down, high = up;
		while (low<high)
		{
			while (low < high&&A[high].year>=pivot.year)
			{
				high--;
			}
			A[low] = A[high];
			while (low < high&&A[low].year<=pivot.year)
			{
				low++;
			}
			A[high] = A[low];
		}
		A[low]= pivot;

		return low;
	}
	void QuickSort(Id A[], int down, int up)
	{
		if (down >= up)return;
		int center = Partition(A, down, up);
		QuickSort(A, down, center - 1);
		QuickSort(A, center + 1, up);
		
	}
	public void sortUp(Id[] id)
	{
		QuickSort(id,0,id.length);
		System.out.println("QS com.");
	}
	public void print(Id[] id)
	{
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i].str);
		}
	}
	public static void main(String[] args) {	
		Main test=new Main();
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		Id id[]=new Id[amount];
		String input=new String();
//		for(int i=0;i<amount;i++)
		int i=0;
		
		while(in.hasNext())
		{
			
			
			
			id[i].str=in.nextLine();
			
			id[i].extract();
			i++;
		}
		test.print(id);
		test.sortUp(id);
		test.print(id);
		in.close();
	}
}


