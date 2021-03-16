import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		PersonSortable persons[]=new PersonSortable[n];
		for(int i=0;i<n;i++)
		{
			String name=in.next();
			int age=in.nextInt();
			persons[i]=new PersonSortable(name, age);
		}
		System.out.println("NameComparator:sort");
		Arrays.sort(persons,new NameComparator());
		for(int i=0;i<persons.length;i++)
		{
			System.out.println(persons[i]);
		}
		System.out.println("AgeComparator:sort");
		Arrays.sort(persons,new AgeComparator());
		for(int i=0;i<persons.length;i++)
		{
			System.out.println(persons[i]);
		}
		System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
		System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));
//		System.out.println(Arrays.toString(persons));
//		System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));
		in.close();
	}

}
class PersonSortable 
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonSortable(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return this.name+"-"+this.age;
	}	
}


class AgeComparator implements Comparator<PersonSortable> 
{
	@Override
	public int compare(PersonSortable p1, PersonSortable p2) 
	{		
			return p1.getAge()-p2.getAge();	
	}
}

class NameComparator implements Comparator<PersonSortable> {
	@Override
	public int compare(PersonSortable p1, PersonSortable p2) {
		return p1.getName().compareTo(p2.getName());
	}
}








