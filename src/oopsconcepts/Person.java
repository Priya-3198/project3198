package oopsconcepts;
 class Person2
 {
	 	static int age1;
	 	

public static void speed()
{	
		System.out.println("The spees of the car was too fast");
	
}

public static void input()
{
		System.out.println("Person age is :"+age1);
}

public double show(int x, int y)
{
		System.out.println("Value of x is :"+x);
		System.out.println("Value of y is :"+y);
	
	return x+y;
}

public int mul(int x, int y)
{
		return x*y;
}
 }
public class Person
{

	public static void main(String[] args) 
	{
			Person2.speed();
			Person2 obj = new Person2();
			obj.age1=40;
			obj.input();
			double sum=obj.show(10, 3);
			System.out.println("sum is :"+sum);
			System.out.println("obj.mul(50,50)");
						
			
		// TODO Auto-generated method stub

	}

}
