
/*
 * Null exception problem
 * tip:  confirm each null-possible point
 * 		even the confirm process itself
 * */
import java.util.Arrays;


public  class Main {
	
	//Just test data
	public static void main(String[] args) {
		
		
		int[] scores={1,2,3};
		Car car1=new Car();
		CarDriver driver=new CarDriver();
		
		driver.setName("li");
		car1.setName("BMW");
		car1.setDriver(null);
		car1.setScores(scores);
		Car clone2 = car1.clone();
		System.out.println(car1);
		System.out.println(clone2);
		car1.getScores()[0] = 8;
		System.out.println(car1);
		System.out.println(clone2);
		
//		Car fakeCar = null;
//		Car t=fakeCar.clone();
//		System.out.println(t);
//		

//		System.out.println("123");
//		int[] scores1={1,2,3};
//		
//		CarDriver d1=new CarDriver();
//		d1.setName("dri1");
//		CarDriver d2=new CarDriver();
//		d2.setName("dri2");
//		Car t1=new Car("car1",d1,scores1);
//		Car t2=t1.clone();
//		try
//		{
//			t2=t1.clone();
//		}catch(Exception e)
//		{
//			
//		}
//		finally
//		{
//				
//		}
//		String str=new String(t1.getName());
//		System.out.println(str.hashCode());
//		System.out.println(t1);
//		System.out.println(t1);
//		System.out.println(t1.driver);
//		System.out.println(t2);	//toStringT
//		System.out.println(t2);
//		System.out.println(t2.driver);
//		System.out.println("car.name");
//		if(t1.name==t2.name)
//			System.out.println("Same");
//		else
//			System.out.println("Not");
//		System.out.println("dri.name");
//		if(t1.driver.name==t2.driver.name)
//			System.out.println("Same");
//		else
//			System.out.println("Not");
	}
}
class CarDriver {
    public String name;
    
    
    public CarDriver() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CarDriver [name=" + name + "]";
	}
 			
}

//answer
class Car implements Cloneable
{
	private String name;
	private CarDriver driver;
	private int[] scores;
	
	
	public Car()
	{
		
	}
	
	public Car(String name, CarDriver driver, int[] scores) {
		
		this.name = name;
		this.driver = driver;
		this.scores = scores;
		
	}
	//Judge if this is NULL itself
	public boolean isDead()
	{
		if(this.name!=null)
			return false;
		if(this.scores!=null)
			return false;
		if(this.driver!=null)
			return false;
		if(this.driver.getName()!=null)
			return false;
		return true;
	}
	@Override
	protected Car clone()//throws CloneNotSupportedException 
	{	
		//if this  is null,then return null
		if(this.isDead())
		{
			Car nullCar = null;
			return nullCar;
		}
		//add car's name
		Car tempCar=new Car();
		if(this.getName()!=null)
		{
			String newName=new String(this.getName());
			tempCar.setName(newName);
		}
		else
		{
			tempCar.setName(null);
		}
		//add car's scores
		if(this.scores!=null)
		{
			int tempArr[]=new int [this.scores.length];
			for(int i=0;i<this.scores.length;i++)
			{
				tempArr[i]=this.scores[i];
			}
			tempCar.setScores(tempArr);
		}
		else
		{
			tempCar.setScores(null);
		}
		
		
		//add car's driver
		if(this.driver!=null)
		{
			//add car's driver's name	
			CarDriver newDriver=new CarDriver();
			if(this.getDriver().getName()!=null)
			{
				String newString=new String(this.driver.getName());
				newDriver.setName(newString);
			}
			else
			{
				newDriver.setName(null);
			}
			
			tempCar.setDriver(newDriver);
		}
		else
		{
			tempCar.setDriver(null);
		}
			
		return tempCar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CarDriver getDriver() {
		return driver;
	}
	public void setDriver(CarDriver driver) {
		this.driver = driver;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", driver=" + driver + ", scores="
				+ Arrays.toString(scores) + "]";
	}

	

	
}






