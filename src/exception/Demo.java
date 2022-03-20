package exception;


public class Demo 
{
		int a= 10;
		public void demo()
		{
			try 
			{
				System.out.println("Hello");
				int c=a/0;
				System.out.println("c");
			}
				catch(Exception e)
				{
					System.out.println("Exception is occured "+e);
				}
				System.out.println("Hello agian");
		}
			void show()
			{
				System.out.println("Show method");
			}

	public static void main(String[] args) 
	{
		Demo e1 = new Demo();
		e1.demo();
		e1.show();
	}

}
