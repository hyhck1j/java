package u5Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		ArrayListIntegerStack stack=new ArrayListIntegerStack(amount);
		Integer input=new Integer(0);
		for(int i=0;i<amount;i++)
		{
			input=in.nextInt();
			System.out.println(stack.push(input));
		}
		System.out.print(stack.peek()+",");
		System.out.print(stack.empty()+",");
		System.out.println(stack.size());
		System.out.println(stack);
		input=in.nextInt();
		for(int i=0;i<input;i++)
		{		
			System.out.println(stack.pop());
		}
		System.out.print(stack.peek()+",");
		System.out.print(stack.empty()+",");
		System.out.println(stack.size());
		System.out.println(stack);
		in.close();
	}

}
interface IntegerStack
{
	public Integer push(Integer item);//��itemΪnull������ջֱ�ӷ���null����ջ����Ҳ����null.
	public Integer pop();//��ջ����Ϊ�գ��򷵻�null.
	public Integer peek();//���ջ��Ԫ�أ���Ϊ�գ��򷵻�null.
	public boolean empty();//��Ϊ�շ���true
	public int size();//����ջ��Ԫ������
}
class ArrayListIntegerStack implements IntegerStack
{
	
	public ArrayListIntegerStack(int maxLength) {
		this.list = new ArrayList<Integer>();
		this.maxLength=maxLength;
	}

	@Override
	public Integer push(Integer item) {
		if(this.list.size()>=maxLength)
		{
			return null;
		}
		if(item!=null)
		{
			this.list.add(item);
			return item;
		}		
		return null;
	}

	@Override
	public Integer pop() {
		if(list.size()==0)
		{
			return null;
		}
		Integer result=this.peek();
		this.list.remove(list.size()-1);
		return result;
	}

	@Override
	public Integer peek() {
		if(list.size()==0)
		{
			return null;
		}
		 return this.list.get(list.size()-1);	
	}

	@Override
	public boolean empty() {
		return this.list.size()==0;
	}

	@Override
	public int size() {
		return list.size();
	}

	
	@Override
	public String toString() {
		return list.toString() ;
	}


	private int maxLength;
	private ArrayList<Integer> list;
}
