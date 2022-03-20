package assesment;

class Source extends Exception
{
	Source(String msg)
	{
		super(msg);
	}
}
 class MyException 
 {
	 	public String checkName(String firstName , String lastName)throws Source1
	 	{
	 		if(firstName.equals("") && lastName.equals(""))
	 		{
	 			Source1 obj = new Source1("first name and last name blank");
	 			throw obj;
	 			
	 		}
	 		else
	 		{
	 			return(firstName+lastName);
	 		}
	 	}

	public static void main(String[] args)
	{
		MyException obj = new MyException();
		try
		{
			obj.checkName("Alian", "Hasley");
		}
		catch(Exception e)
		{
			System.out.println("Exception is Occured");
		}

	}

}
