package polymorphism;
class Adder
{
		static int add(int a, int b)
		{
				return a+b;
		}
		static int add(int a, int b, int c)
		{
				return a+b+c;
		}
}
public class OverLoading1 
{
	
	
	public static void main(String[] args)
	{
			System.out.println(Adder.add(11,11));	
			System.out.println(Adder.add(11,11,11));
	}

}