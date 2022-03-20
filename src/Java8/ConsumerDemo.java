package Java8;

import java.util.function.Consumer;

public class ConsumerDemo 
{

	public static void main(String[] args) 
	{
		Consumer<String> cons =s->System.out.println(s);
		cons.accept("Hello Welcome To the World Of JAVA.......");

	}

}
