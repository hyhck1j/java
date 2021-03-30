package u5Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.management.Query;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		
		
			
			
		in.close();
	}

}
class blockQueue<T> implements Runnable
{
	private Queue<T> queue;
	private int ini;
	public blockQueue(int ini) {
		this.queue=new LinkedList<T>();
		this.ini=ini;
	}
	public void push(T item)
	{
		this.queue.add(item);
	}
	public T pop()
	{
		T result=null;
		if(this.queue.size()>0)
		{
			result=this.queue.poll();
		}
		return result;
	}
	public void clear()
	{
		if(!empty())
		{
			pop();
		}
	}
	public int size()
	{
		return this.queue.size();
	}
	public boolean empty()
	{
		return size()==0;
	}
	@Override
	public void run() {
		int count=ini;
		for(int i=0;i<count;i++)
		{
			T res=this.pop();
			if(res!=null)
			{
				System.out.println(res);
			}
		}
	}
	
}
