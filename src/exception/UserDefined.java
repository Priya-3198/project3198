package exception;

class Children extends Exception
{
	public Children(String msg)
	{
			super(msg);
	}
}

public class UserDefined 
{
	public void watchMobileVedio(int hour) throws Children
	{
		if(hour>3)
		{
			Children obj = new Children("you are not allowed to watch more than 3 hour") ;
			throw obj;
		}
		else
		{
			System.out.println("You can watch mobile "+hour+"hours");
		}
	}
	public static void main(String[] args) 
	{
		UserDefined d= new UserDefined();
		try
		{
			d.watchMobileVedio(0);
		}
		catch(Exception e )
		{
			System.out.println("Exception is Occured"+e);
		}

	}

}
