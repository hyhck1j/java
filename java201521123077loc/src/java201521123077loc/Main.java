package java201521123077loc;
//U2 5.6


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public int reverIndexOf(List<String> strList,String str)
	{	
		int i=-1;
		for( i=strList.size()-1;i>=0;i--)
		{
			if(str.equals(strList.get(i)))
			{
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {	
		Main test=new Main();
		Scanner in=new Scanner(System.in);
		List<String> strList= new ArrayList<String>(); 
		
		strList.add("begin");	
		while(!in.hasNext("!!end!!"))
		{
			strList.add(in.next());		
		}
//		in.skip("!!end!!");
		String temp=new String();
		temp=in.nextLine();
		strList.add("end");
		System.out.println(strList);
		String str=new String();
//		System.out.println("Show");
		
//		if(in.hasNext())
//		{
			str=in.next();
//			System.out.println(str);	
//		}	
		System.out.println(strList.contains(str));
		System.out.println(strList.indexOf(str));
		System.out.println(test.reverIndexOf(strList,str));
		System.out.println("begin");
		strList.remove(0);
		System.out.println(strList);
		
		
		str=in.next();
		strList.set(1, str);
		System.out.println(strList);
		
		str=in.next();
		List<String> strList1= new ArrayList<String>(); 
		for(int i=0; i<strList.size()-1;i++)
		{
			if(strList.get(i).contains(str))
			{
				strList1.add(strList.get(i));
			}
		}
		System.out.println(strList1);
		int location;
		if((location=strList.indexOf(str))!=-1)
			strList.remove(location);
		System.out.println(strList);
		strList.clear();
		System.out.println(strList+" "+strList.size()+","+strList.isEmpty());
		
		in.close();
	}
}