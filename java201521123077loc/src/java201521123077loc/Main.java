import java.util.Arrays;
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
//		System.out.println(persons);
		Arrays.sort(persons);
		for(int i=0;i<persons.length;i++)
		{
			System.out.println(persons[i]);
		}
//		System.out.println(Arrays.toString(persons));
		System.out.println(Arrays.toString(PersonSortable.class.getInterfaces()));
		in.close();
	}

}
class PersonSortable implements Comparable<PersonSortable>
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
	@Override
	public int compareTo(PersonSortable man) {
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