package u5Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
				
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		while(in.hasNext())
		{
			String str=in.next();
			if(str.equals("!!!!!"))
				break;
			Integer count=map.get(str);
			if(count!=null)
			{
				map.put(str,count+1 );
			}
			else
				map.put(str, 1);
		}
		System.out.println(map.size());
		List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(map.entrySet()) ;
		
         Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				if(o1.getValue().equals(o2.getValue()))
				{
					return o1.getKey().compareTo(o2.getKey());
				}
				return o2.getValue().compareTo(o1.getValue());
			}
		});
         int count=0;
         for(Entry<String, Integer> mapping:list){ 
        	 if(count==10)
        		 break;
             System.out.println(mapping.getKey()+"="+mapping.getValue()); 
             count++;
        } 
		in.close();
	}

}

