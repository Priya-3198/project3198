package Threads;


class D extends Thread
{
	public void run()
	{
		System.out.println("Thread D Started");
		for(int i=0; i<=4 ; i++)
		{
			System.out.println("From Thread D : I "+i);
	}
		System.out.println("EXIT FROM D");
	}
}

class E extends Thread
{
	public void run()
	{
		System.out.println("Thread E Started");
		for(int j=0; j<=4 ; j++)
		{
			System.out.println("From Thread E : J "+j);
	}
		System.out.println("EXIT FROM E");
	}
}

class F extends Thread
{
	public void run()
	{
		System.out.println("Thread F Started");
		for(int k=0; k<=4 ; k++)
		{
			System.out.println("From Thread F : K "+k);
	}
		System.out.println("EXIT FROM F");
	}
}
public class PriorityDemo 
{

	public static void main(String[] args) 
	{
		D threadD = new D(); 
		E threadE = new E(); 
		F threadF = new F(); 
		
		threadD.setPriority(Thread.NORM_PRIORITY);
		threadE.setPriority(Thread.MAX_PRIORITY);
		threadF.setPriority(Thread.MIN_PRIORITY);
		
		threadD.start();
		System.out.println("Start Thread D");
		
		 
		 System.out.println("Start Thread F");
		 threadF.start();
		 
		 System.out.println("Exit form main thread ");
		 
		
	}

}
