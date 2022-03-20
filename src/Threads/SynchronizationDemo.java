package Threads;

class BookMyShow
{
	private int total_tickets=10;
	synchronized public void bookTicket(int ticket)
	{
		if(total_tickets>=ticket)
		{
			total_tickets=total_tickets-ticket;
			System.out.println(Thread.currentThread().getName()+" "+ticket+ " Ticket have been booked and Remaining "+total_tickets);
			
		}
		else
		{
			if(total_tickets<=0)
			{
			System.out.println("Sorry all tickets are booked");
			
			}
			else
			{
				System.out.println("Sorry " +total_tickets+ " are remaining");
			}
		}
	}
}
public class SynchronizationDemo extends Thread
{
	 static BookMyShow bookMyShow;
	  int tickets;
	 public SynchronizationDemo(BookMyShow bookMyShow)
	 {
		 this.bookMyShow=bookMyShow;
	 }
	 public void run()
	 {
		 bookMyShow.bookTicket(tickets);
	 }
	public static void main(String[] args) 
	{
		bookMyShow = new BookMyShow();
		SynchronizationDemo priya = new SynchronizationDemo(bookMyShow);
		priya.setName("Priya");
		priya.tickets=6;
		priya.start();
		
		SynchronizationDemo arati = new SynchronizationDemo(bookMyShow);
		arati.setName("Arati");
		arati.tickets=4;
		arati.start();
		
		SynchronizationDemo pratiksha = new SynchronizationDemo(bookMyShow);
		pratiksha.setName("Pratiksha");
		pratiksha.tickets=3;
		pratiksha.start();



	}

}
