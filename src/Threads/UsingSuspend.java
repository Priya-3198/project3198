package Threads;
class AAA extends Thread
{
	public void run()
	{
		System.out.println("Thread AAA is started ");
		for(int i=0; i<5 ; i++)
		{
			System.out.println("Vlue of i in Thread AAA "+i);
		}
		System.out.println("Thread AAA is Exit ");
	}
}

class BBB extends Thread
{
	public void run()
	{
		System.out.println("Thread BBB is started ");
		for(int j=0; j<5 ; j++)
		{
			System.out.println("Value of j Thread BBB "+j);
		}
		System.out.println("Thread BBB is Exit ");
	}	
}


class CCC extends Thread
{
	public void run()
	{
		System.out.println("Thread CCC is started ");
		for(int k=0; k<5 ; k++)
		{
			System.out.println("Value of k in Thread CCC "+k);
		}
		System.out.println("Thread CCC is Exit ");
	}
}
public class UsingSuspend 
{

	public static void main(String[] args) 
	{
		AAA obj1 = new AAA();
		BBB obj2 = new BBB();
		CCC obj3 = new CCC();

		obj1.start();
		obj2.start();
		obj3.start();
		
		for(int j=0;j<=5;j++)
		{
			if(j==3)
			{
				obj1.suspend();
				
			}
			System.out.println("value of j is " +j);
		}
	}
}


	
