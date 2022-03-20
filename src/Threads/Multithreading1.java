


//2.Using Runnable Thread Method

package Threads;

	class AA implements Runnable
	{
		public void run()
		{
			System.out.println("Thread A is started ");
			for(int i=0; i<5 ; i++)
			{
				try {
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) 
				{
					
					e.printStackTrace();
				}
				System.out.println("Vlue of i in Thread A "+i);
			}
			System.out.println("Thread A is Exit ");
		}
	}
	
	class BB implements Runnable
	{
		public void run()
		{
			System.out.println("Thread B is started ");
			for(int j=0; j<5 ; j++)
			{
				/*try 
				{
					Thread.sleep(3000);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				System.out.println("Value of j Thread B "+j);
			}
			System.out.println("Thread B is Exit ");
		}	
	}

	
	class CC implements Runnable
	{
		public void run()
		{
			System.out.println("Thread C is started ");
			for(int k=0; k<5 ; k++)
			{
				/*try {
					Thread.sleep(3000);
				}
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				System.out.println("Value of i in Thread C "+k);
			}
			System.out.println("Thread C is Exit ");
		}
	}
	public class Multithreading1
	{
		public static void main(String[] args) 
		{
			AA obj1 = new AA();
			BB obj2 = new BB();
			CC obj3 = new CC();
			
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			Thread t3 = new Thread(obj3);

			t1.start();
			t2.start();
			t3.start();

		}
	}

