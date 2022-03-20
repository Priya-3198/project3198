package Java8;

interface Engine
{
	public static void display()
	{
		System.out.println("This is a Java 8 Static Method");
		}
}

public class StaticMethod 
{

	public static void main(String[] args) 
	{
		Engine.display();
	}

}
