package java201521123077loc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/*remove��������*/
	private static void remove(List<String> list, String word) {
		while(list.contains(word))
			list.remove(word);		
	}
	 /*covnertStringToList��������*/
	private static List<String> convertStringToList(String nextLine) {
		List<String> list=new ArrayList<String>();
		
		Scanner in=new Scanner(nextLine);
		while(in.hasNext())
		{
			list.add(in.next());
		}
		in.close();
		return list;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            List<String> list = convertStringToList(sc.nextLine());
            System.out.println(list);
            String word = sc.nextLine();
            remove(list,word);
            System.out.println(list);
        }
        sc.close();
    }

	

}
