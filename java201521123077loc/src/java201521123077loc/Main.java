package java201521123077loc;



//U2 5.6
import java.util.Scanner;
enum Grade {
		A, B, C, D, E
	}
public class Main {
	
	
	public static Grade getGrade(int score)
	{
		if(score>100)
		{
			return Grade.E;
		}
		else if(score>=90)
		{
			return Grade.A;
		}
		else if(score>=80)
		{
			return Grade.B;
		}
		else if(score>=70)
		{
			return Grade.C;
		}
		else if(score>=60)
		{
			return Grade.D;
		}
		else
		{
			return Grade.E;
		}	
	}
	public static void printGradeInfo(Grade grade){
		switch(grade)
		{
			case A:System.out.println("Excellent");break;
			case B:System.out.println("Good");break;
			case C:System.out.println("Average");break;
			case D:System.out.println("Fair");break;
			case E:System.out.println("Poor");break;
		}
	       System.out.println("class name="+Grade.class);
	       System.out.println("grade value="+grade);
	}
	public static void main(String[] args) {	
		
		Scanner in=new Scanner(System.in);
		int grade;
		while(in.hasNextInt())
		{
			grade=in.nextInt();
			printGradeInfo(getGrade(grade));		
		}
		in.close();
	}
}
