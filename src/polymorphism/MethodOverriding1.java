package polymorphism;

class Animal1
{
	 public void move() 
	 {
		 	System.out.println("Animals can move");
	 
	 }
}

class Dog1 extends Animal1 
{
	 public void move() 
	 {
		 	super.move(); // invokes the super class method
		 	System.out.println("Dogs can walk and run");
	 
	 }
}


public class MethodOverriding1 {

	public static void main(String[] args) 
	{

		 Animal1 b = new Dog1(); 
		 b.move(); 

	}

}
