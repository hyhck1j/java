package unit8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true)
        {
        	String str=in.next();
        	if(str.equals("quit"))       	
        		break;
        	int inNum=in.nextInt();
        	int outNum=in.nextInt();
        	if(str.equals("Integer"))
        	{
        		ArrayListGeneralStack<Integer> stack=new ArrayListGeneralStack<Integer>();
        		System.out.println("Integer Test");
        		for(int i=0;i<inNum;i++)
        		{
        			System.out.println("push:"+stack.push(in.nextInt()));
        		}
        		for(int i=0;i<outNum;i++)
        		{
        			System.out.println("pop:"+stack.pop());
        		}
        		System.out.println(stack);
        		int sum=0;
        		while(!stack.empty())
        		{
        			sum+=stack.pop();
        		}
        		System.out.println("sum="+sum);
        		System.out.println(stack.getClass().getInterfaces()[0]);
        	}
        	else if(str.equals("Double"))
        	{
        		ArrayListGeneralStack<Double> stack=new ArrayListGeneralStack<Double>();
        		System.out.println("Double Test");
        		for(int i=0;i<inNum;i++)
        		{
        			System.out.println("push:"+stack.push(in.nextDouble()));
        		}
        		for(int i=0;i<outNum;i++)
        		{
        			System.out.println("pop:"+stack.pop());
        		}
        		System.out.println(stack);
        		double sum=0;
        		while(!stack.empty())
        		{
        			sum+=stack.pop();
        		}
        		System.out.println("sum="+sum);
        		System.out.println(stack.getClass().getInterfaces()[0]);
        	}	
        	else if(str.equals("Car"))
        	{
        		ArrayListGeneralStack<Car> stack=new ArrayListGeneralStack<Car>();
        		
        		System.out.println("Car Test");
        		for(int i=0;i<inNum;i++)
        		{
        			int id=in.nextInt();
        			String name=in.next();
        			System.out.println("push:"+stack.push(new Car(id, name)));
        		}
        		for(int i=0;i<outNum;i++)
        		{
        			System.out.println("pop:"+stack.pop());
        		}
        		System.out.println(stack);
        		while(!stack.empty())
        		{
        			System.out.println(stack.pop().getName());
        		}
        		System.out.println(stack.getClass().getInterfaces()[0]);
        	}
        }
        
        in.close();
    }
	

}
class Car
{
	private int id;
	private String name;
	
	public Car(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
	
}
class ArrayListGeneralStack<T> implements GeneralStack<T>
{
	
	public ArrayListGeneralStack() {
		this.list = new ArrayList<T>();
	}
	
	@Override
	public T push(T item) {//如item为null，则不入栈直接返回null。
		if(item==null)
		{
			return null;
		}
		this.list.add(item);
		return item;
	}

	@Override
	public T pop() {//出栈，如为空，则返回null.
		if(empty())
			return null;	
		T temp=peek();
		this.list.remove(this.list.size()-1);
		return temp;
	}

	@Override
	public T peek() {//获得栈顶元素，如为空，则返回null.
		if(empty())
			return null;
		return this.list.get(list.size()-1);
	}

	@Override
	public boolean empty() {//如为空返回true
		return this.list.size()==0;
	}

	@Override
	public int size() {//返回栈中元素数量
		return this.list.size();
	}
	
	@Override
	public String toString() {
		return list.toString() ;
	}

	private ArrayList<T>list;
}
interface GeneralStack<T>
{
	public T push(T item);        	
	public T pop();                 
	public T peek();                
	public boolean empty();
	public int size();     
}