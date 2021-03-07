
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String input=new String();
		
		ArrayList<Person> personList=new ArrayList<Person>();
		
		while(in.hasNext())
		{
			input=in.next();
			if(input.equals("s"))
			{
				String name=in.next();
				int age=in.nextInt();
				boolean gender=in.nextBoolean();
				String stuNo=in.next();
				String clazz=in.next();
				Student student=new Student(name, age, gender, stuNo, clazz);
				personList.add(student);
			}
			else if(input.equals("e"))
			{
				String name=in.next();
				int age=in.nextInt();
				boolean gender=in.nextBoolean();
				double salary = in.nextDouble();
				String companyName=in.next();
				Company company=null;
				if(companyName!=null)
				{
					 company=new Company(companyName);
					
				}
				Employee employee=new Employee(name, age, gender, company, salary);		
				personList.add(employee);
			}
			else 
			{
				break;
			}
		}
		Collections.sort( personList);
//		System.out.println(personList);
		for(Person itor:personList)
		{
			System.out.println(itor);
		}
		input=in.next();
		if(input.equals("exit"))
		{
			in.close();
			return ;
		}
		
		ArrayList<Student> List1=new ArrayList<Student>();
		ArrayList<Employee> List2=new ArrayList<Employee>();
		for(Person man:personList)
		{
			if(man instanceof Student&&!List1.contains((Student)man))
				List1.add((Student)man);		
		}
		for(Person man:personList)
		{
			if(man instanceof Employee&&!List2.contains(man))
				List2.add((Employee)man);		
		}
		
		System.out.println("stuList");
		for(Person man:List1)
		{
			System.out.println(man);
		}
		System.out.println("empList");
		for(Person man:List2)
		{	
			System.out.println(man);
		}
//		if(List1.get(0).equals(List1.get(1)))
//			System.out.println("What ? same");
//		else
//			System.out.println("What ! different");
		in.close();
	}

}

class Person implements Comparable<Person>
{
	public String name;
	public int age;
	public boolean gender;
	public Person(String name, int age, boolean gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return (name+"-"+age+"-"+gender);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)		
		{
			Person man=(Person)obj;
			if(this.age!=man.age )
				return false;
			if(this.gender!=man.gender)
				return false;
			if(this.name!=null)
			{
				if(man.name==null)
					return false;
				else if(!this.name.equals(man.name))
					return false;
			}
			else 
			{
				if(man.name!=null)
					return false;
			}	
			return true;
		}
			
		return false;
	}
	@Override
	public int compareTo(Person man) {
		if(this.name==null&&man!=null)
			return 1;
		if(man.name==null&&this!=null)
			return 1;
		if(this.name==null&&man.name==null)
			return 0;
		if(this.name.equals(man.name))
			return this.age-man.age;
		else
		{
			return this.name.compareTo(man.name);
		}
	}
	
}
class Student extends Person
{
	private String stuNo;
	private String clazz;
	public Student(String name, int age, boolean gender, String stuNo,
			String clazz) {
		super(name, age, gender);
		this.stuNo = stuNo;
		this.clazz = clazz;
	}
	
	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		
		return "Student:"+super.toString()+"-"+this.stuNo+"-"+this.clazz;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student)
		{
			Student temp=(Student)obj;
			if(!super.equals(obj))
			{
				return false;
			}
//			System.out.println(">1");
			if(this.stuNo!=null)
			{
				if(temp.stuNo==null)
					return false;
				if(!this.stuNo.equals(temp.stuNo))
					return false;
			}
			else
			{
				if(temp.stuNo!=null)
					return false;
			}
//			System.out.println(">2");
			if(this.clazz!=null)
			{
				if(temp.clazz==null)
					return false;
				if(!this.clazz.equals(temp.clazz))
					return false;
			}
			else
			{
				if(temp.clazz!=null)
					return false;
			}
//			System.out.println(">3");
			return true;
		}
			
		return false;
	}
		
}
class Company 
{
	private String name;

	
	
	public Company(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Company)
		{
			Company temp=(Company)obj;
			
			if(this.name!=null)
			{
				if(temp.name==null)
					return false;
				if(this.name!=temp.name)
					return false;
			}
			else
			{
				if(temp.name!=null)
					return false;
			}	
			
			return true;
		}		
		return false;
	}

	
	
}
class Employee extends Person
{
	private Company company;
	private double salary;
	public Employee(String name, int age, boolean gender, Company company,
			double salary) {
		super(name, age, gender);
		this.company = company;
		this.salary = salary;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee:"+super.toString()+"-"+company+"-"+salary;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee)
		{
			Employee temp=(Employee)obj;
			if(!super.equals(obj))
			{
				return false;
			}
			
			if(this.company!=null)
			{
				if(temp.company==null)
					return false;
				if(this.company.equals(temp.company))
					return false;
			}
			else
			{
				if(temp.company!=null)
					return false;
			}
			DecimalFormat df = new DecimalFormat("#.#");
			String str1=df.format(this.salary);
			String str2=df.format(temp.salary);
			if(!str1.equals(str2))
				return false;
			
			return true;
		}		
		return false;
			
	}
	
}


