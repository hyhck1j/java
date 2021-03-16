package java201521123077loc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		double arr[]=new double [n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextDouble();
		}
		System.out.println(ArrayUtils.findMinMax(arr));
		System.out.println(ArrayUtils.PairResult.class);
	}

}
class ArrayUtils
{
	static PairResult findMinMax(double[] values)
	{
		if(values.length==0)
		{
			return null;
		}
		if(values.length==1)
		{
			return new PairResult(values[0],values[0]);
		}
		double min=values[0];
		double max=min;
		for(int i=1;i<values.length;i++)
		{
			if(values[i]>max)
			{
				max=values[i];
			}
			if(values[i]<min)
			{
				min=values[i];
			}
		}
		return new PairResult(min, max);
	}
	static class PairResult
	{
		private double min;
		private double max;
		@Override
		public String toString() {
			return "PairResult [min="+min+", max="+max+"]";
		}
		public PairResult(double min, double max) {
			super();
			this.min = min;
			this.max = max;
		}
		
	}

	
	
}