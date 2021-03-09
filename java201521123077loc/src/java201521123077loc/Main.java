package java201521123077loc;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayIntegerStack stack1=new ArrayIntegerStack(n);
		int amount=in.nextInt();
		Integer temp=new Integer(0);
		/*	5
			5
			1 2 3 4 5
			3
		 * */
		String str=new String();
		for(int i=0;i<amount;i++)
		{
			str=in.next();
			if(str.equals("null")||str.equals("NULL"))
			{
				
				System.out.println(stack1.push(null));
			}
			else
			{
				temp=Integer.parseInt(str);
				
				System.out.println(stack1.push(temp));
			}
			
		}
		System.out.println(stack1.top()+","+stack1.empty()+","+stack1.size());
		System.out.println(Arrays.toString(stack1.getValue()));
		int popAmount=in.nextInt();
		for(int i=0;i<popAmount;i++)
		{
			System.out.println(stack1.pop());
			
		}
		System.out.println(stack1.top()+","+stack1.empty()+","+stack1.size());
		System.out.println(Arrays.toString(stack1.getValue()));
		in.close();
	}

}
interface IntegerStack
{
	public Integer push(Integer item);
	public Integer pop();
	public Integer top();
	public boolean empty();
	public int size();
}
class ArrayIntegerStack implements IntegerStack
{
	private Integer []value;
	private int loc=0;
	private int maxSize;

	public ArrayIntegerStack(int length) {
		if(length>=0)
		{
			Integer []value2=new Integer[length];
			this.value = value2;
			maxSize=length;
		}		
		else
		{
			Integer []value2=new Integer[0];
			this.value = value2;
			maxSize=0;
		}
	}
	
	public Integer[] getValue() {
		return value;
	}

	public void setValue(Integer[] value) {
		this.value = value;
	}

	public int getMaxSize() {
		return maxSize;
	}
	
	
	@Override
	public Integer push(Integer item) {//如果item为null，则不入栈直接返回null。如果栈满，也返回null.
		if(item==null)
			return null;
		if(loc>=0&&loc<this.maxSize)
		{		
			this.value[loc++]=item;
			return item;
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public Integer pop() {	//出栈，如果为空，则返回null.
		if(loc>0&&loc<this.maxSize+1)
		{
			int temp=this.value[--loc];
			return temp;
		}
		else
		{
			return null;
		}
	}

	@Override
	public Integer top() {//获得栈顶元素，如果为空，则返回null.
		if(loc>0&&loc<this.maxSize+1)
			return value[loc-1];
		else
			return null;
	}

	@Override
	public boolean empty() {//如果为空返回true
		
		return loc==0;
		
	}

	@Override
	public int size() {//返回栈中元素多少
		return loc;
	}

}




