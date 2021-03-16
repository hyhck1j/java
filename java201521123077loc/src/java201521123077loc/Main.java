import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	    
		 final Scanner sc=new Scanner(System.in);
		ActionListener ads=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int n=sc.nextInt();
				String str=sc.next();
				for(int i=0;i<n;i++)
				{
					System.out.println(str);
				}				
				System.out.println(this.getClass().getName());
				System.out.println(Arrays.toString(this.getClass().getInterfaces()));
			}
		};
		 starter = new  MySatrter(ads);
		
	    
	     
	    starter.start();
	    sc.close();
	}

}
