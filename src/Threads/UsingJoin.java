package Threads;
class P extends Thread
{
	public void run()
	{
		System.out.println("Thread P is started ");
		for(int i=0; i<5 ; i++)
		{
			System.out.println("Vlue of i in Thread P "+i);
		}
		System.out.println("Thread P is Exit ");
	}
}

class Q extends Thread
{
	public void run()
	{
		System.out.println("Thread Q is started ");
		for(int j=0; j<5 ; j++)
		{
			System.out.println("Value of Q Thread B "+j);
		}
		System.out.println("Thread Q is Exit ");
	}	
}


class R extends Thread
{
	public void run()
	{
		System.out.println("Thread R is started ");
		for(int k=0; k<5 ; k++)
		{
			System.out.println("Value of i in Thread R "+k);
		}
		System.out.println("Thread R is Exit ");
	}
}
public class UsingJoin
{

	public static void main(String[] args) 
	{
		P p = new P();
		Q q = new Q();
		R r = new R();

		
		q.start();
		
		try 
		{
			q.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
			
		p.start();
		r.start();
		}
	}





