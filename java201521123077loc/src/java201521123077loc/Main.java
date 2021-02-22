package java201521123077loc;


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {	
		
		
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		Person []man=new Person[amount];
		String name;
		boolean gender;
		int age;
		for(int i=0;i<man.length;i++)
		{
			name=in.next();
			age=in.nextInt();
			gender=in.nextBoolean();
			
			man[i]=new Person(name,age,gender);
			
		}
		for(int i=man.length-1;i>=0;i--)
		{
			System.out.println(man[i]);
		}
		
		Person anNewMan=new Person();
		System.out.println(anNewMan);
	}
}
class Person
{
	private String name;
	private boolean gender;
	private int age;
	private int id;
	public Person()
	{
		System.out.println("This is constructor");
		System.out.println(name+","+age+","+gender+","+id);
	}
	public Person(String name,  int age,boolean gender) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", id=" + id + "]";
	}
	
	
}
