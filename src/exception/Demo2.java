package exception;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}

public class Demo2 
{
	int age;
	public void checkAge(int age) throws MyException
	{
		if(age<0)
		{
			MyException m= new MyException("Age must be greater than Zero ");
			throw m;
		}
		else 
		{
			System.out.println("Age is greater than zero");
		
		}
	}
	public static void main(String[] args) 
	{
		Demo2 d2=new Demo2();
		try 
		{
			d2.checkAge(8);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured"+e);
			}
	}

}
