package java201521123077loc;


import java.util.Arrays;
import java.util.Scanner;

public  class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		PersonOverride persons[]=new PersonOverride[n1];
		for(int i=0;i<persons.length;i++)
		{
			persons[i]=new PersonOverride();
		}
		int n2=in.nextInt();
		PersonOverride persons2[]=new PersonOverride[n2];
		String tempName;
		boolean tempGender;
		int tempAge;
		int cnt=0;
		boolean flag=false;
		for(int i=0;i<n2;i++)
		{
			
			tempName=in.next();
			tempAge=in.nextInt();
			tempGender=in.nextBoolean();
			
			for(int j=0;j<cnt;j++)
			{
				if(persons2[j].equals(tempName, tempAge, tempGender))
				{
					flag=true;
//					System.out.println(cnt+">");
					
					break;
				}
				if(tempName.equals("default")&&tempAge==1&&tempGender==true)
				{
					flag=true;
					break;
				}
			}
			
			if(!flag)
			{
				persons2[cnt++]=new PersonOverride(tempName, tempAge, tempGender);
				
			}
			flag=false;
		}
		for(PersonOverride man:persons)
		{
			System.out.println(man);
		}
		
		for(PersonOverride man:persons2)
		{
			if(man!=null)
				System.out.println(man);
		}
		System.out.println(cnt);
		System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
		
		in.close();
	}
}

class PersonOverride
{
	private String name;
	private boolean gender;
	private int age;
	
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
	public PersonOverride(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public PersonOverride()
	{
		this("default",1,true);
	}
	@Override
	public String toString() {
		return name+"-"+age+"-"+gender;
	}
	public boolean equals(String name, int age, boolean gender)
	{
		if(this.gender!=gender)
			return false;
		if(this.age!=age)
			return false;
		if(!this.name.equals(name))
			return false;
		
		
		return true;
	}
	
	
}