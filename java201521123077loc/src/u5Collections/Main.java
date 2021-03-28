package u5Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		TreeSet<String> set=new TreeSet<String>();
		while(in.hasNext())
		{
			String str=in.next();
			if(str.equals("!!!!!"))
				break;
			set.add(str);
		}
		System.out.println(set.size());
		Iterator<String> it=set.iterator();
		String str=new String();
		for(int i=0;i<10;i++)
		{
			str=set.pollFirst();
			if(str!=null)
				System.out.println(str);
		}
		in.close();
	}

}

