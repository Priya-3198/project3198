package Java8;
@FunctionalInterface

interface I
{
	public int add(int x, int y);
	public default void show()
	{
		System.out.println("This is Default method");
	}
	
	public static void show1()
	{
		System.out.println("This is Static method");
	}
}

public class Demo 
{

	public static void main(String[] args) 
	{
		I obj =(x,y) -> x+y;
		System.out.println(obj.add(5, 10));

		obj.show();
		I.show1();
		
	}

}
