package Threads;

public class Threading {

	public static void main(String[] args) 
	{
		Thread t =new Thread();
		Thread t1 =new Thread();
		Thread t2 =new Thread();
		System.out.println("My Current Thread is " +t.currentThread());
		System.out.println("MY Current Thread is " +t.getName());
		System.out.println("MY Current Thread is " +t1.getName());
		System.out.println("MY Current Thread is " +t2.getName());
		t.setName(" MY Thread 1 " );
		System.out.println("MY Current Thread is " +t.getName());
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Value of i " +i);
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
		
		System.out.println();

	}

}
