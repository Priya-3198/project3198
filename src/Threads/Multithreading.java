
// 1.Using Extends Thread Method

package Threads;

	class A extends Thread
	{
		public void run()
		{
			System.out.println("Thread A is started ");
			for(int i=0; i<5 ; i++)
			{
				System.out.println("Vlue of i in Thread A "+i);
			}
			System.out.println("Thread A is Exit ");
		}
	}
	
	class B extends Thread
	{
		public void run()
		{
			System.out.println("Thread B is started ");
			for(int j=0; j<5 ; j++)
			{
				System.out.println("Value of j Thread B "+j);
			}
			System.out.println("Thread B is Exit ");
		}	
	}

	
	class C extends Thread
	{
		public void run()
		{
			System.out.println("Thread C is started ");
			for(int k=0; k<5 ; k++)
			{
				System.out.println("Value of i in Thread C "+k);
			}
			System.out.println("Thread C is Exit ");
		}
	}
	public class Multithreading
	{
		public static void main(String[] args) 
		{
			A obj1 = new A();
			B obj2 = new B();
			C obj3 = new C();

			obj1.run();
			obj2.run();
			obj3.run();

		}
	}
