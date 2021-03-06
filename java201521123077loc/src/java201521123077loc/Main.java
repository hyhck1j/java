import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		  
//		 
//		in.close();	
		
		Company c1 = new Company("MicroSoft");
		Company c2 = new Company("IBM");
		Person e1 = new Employee("Li", 35, true, 60000.124, c1);
		Person e2 = new Employee("Li", 35, true, 60000.124, c1);
		Person e3 = new Employee("Li", 35, true, 60000.124, c2);
		Person e4 = new Employee("Li", 35, true, 60000.123, c2);
		Person e5 = new Employee("Li", 35, true, 60000.126, c2);
		Person e6 = new Employee("Li", 35, true, 60000.126, null);
//		System.out.println(e1.equals(e2)+" 1");
		System.out.println(e2.equals(e3)+" 0");
//		System.out.println(e1.equals(e3)+" 0");
//		System.out.println(e3.equals(e4)+" 1");
//		System.out.println(e3.equals(e5)+" 0");
//		System.out.println(e5.equals(e6)+" 0");
		
		
		
		
		
		
	}

}

class Person
{
	String name;
	int age;
	boolean sex;
	public Person(String name, int age, boolean sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
//	public boolean equals(Object obj)
//	{
//		Person temp=(Person)obj;
//		if (obj instanceof Person) 
//		{
//			if()
//				return false;
//		}	
//		return true;
//	}
}
class Company
{
	String name;
	public Company(String name) {
		
		this.name = name;
	}	
}
class Employee extends Person
{
	
	private Company company;
	private double salary;
	

	
	public Employee(String name, int age, boolean sex,
			double salary, Company company) {
		super(name, age, sex);
		this.company = company;
		this.salary = salary;
	}

	public boolean equals(Object obj)
	{
		Object tempObj= obj;
		if (obj instanceof Employee) 
		{
			
			Employee temp=(Employee) tempObj;
			DecimalFormat df = new DecimalFormat("#.##");
		
			String str1=df.format(this.salary);
			String str2=df.format(temp.salary);
//			System.out.println(this.salary+"<>");
			if(!str1.equals(str2))
				return false;
//			System.out.println(">1");
			if(!super.equals(obj) )
				return false;
//			System.out.println(">2");
			if((this.company==null&&temp.company!=null)||(this.company!=null&&temp.company==null))
				return false;
//			System.out.println(">3");
			if(this.company!=null&&temp.company!=null)
			{
				if(!this.company.equals(temp.company))
				{
					return false;
				}
			}
//			System.out.println(">4");
			return true;
		}
//		System.out.println("Not an Employee");
		return false;
	}
}














