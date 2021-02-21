package java201521123077loc;

//U2 5.4
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {	
		Scanner in=new Scanner(System.in);	
		int num;
		int temp;
		while(in.hasNext())
		{
			num=in.nextInt();
			String [][]arr=new String[num][];
			for(int i=0;i<num;i++)
			{
				arr[i]=new String[i+1];
				for(int j=0;j<=i;j++)
				{
					StringBuilder   str=new StringBuilder();
					str.append(i+1);
					str.append('*');
					str.append(j+1);
					str.append('=');
					temp=(i+1)*(j+1);
					str.append(temp);
					arr[i][j]=str.toString();
					
					if(j==i)
						System.out.println(arr[i][j]);
					else
					{
						if(temp>=10)
						{
							System.out.print(arr[i][j]+" ");
						}
						else
						{
							System.out.print(arr[i][j]+"  ");
						}
					}
						
				}
			}
			System.out.println(Arrays.deepToString(arr));
		}
		in.close();
	}
}

