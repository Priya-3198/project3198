package inheritance;
import java.util.*;

 class A 
 {
	 	int studID;
	 	String name;
	 	Scanner sc=new Scanner(System.in);
	 	
	 	public void input1()
	 	{
	 		System.out.println("Enter StudentID : ");
	 		studID=sc.nextInt();
	 		System.out.println("Enter Student Name :");
	 		name=sc.next();
	 	}
	 	public void show1()
	 	{
	 		System.out.println("Enter StudentID : "+studID);
	 		System.out.println("Enter Student Name : "+name);
	 	}
	 }
 class B extends A
 {
	 	String address, qual;
	 	Scanner sc=new Scanner(System.in);
	 	public void input2()
	 	{
	 		System.out.println("Enter Address : ");
	 		address=sc.next();
	 		System.out.println("Enter Qualification :");
	 		qual=sc.next();
	 	}
	 	public void show2()
	 	{
	 		System.out.println("Enter Address : "+address);
	 		System.out.println("Enter the Qualification : "+qual);
	 	}
	 	
 }

public class SingleInheritance {

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.input1();
		b1.show1();
		b1.input2();
		b1.show2();
		

	}

}