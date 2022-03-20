
	package CollectionAssignment;

	import static org.junit.Assert.*;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;
import java.util.Vector;


	class Employee1
	{
		private int id;
		private String name;
		private String address;
		private Double salary; 
		
		public Employee1(int id, String name, String address , Double salary)
		{
			super();
			this.id=id ;
			this.name= name;
			this.address=address;
			this.salary=salary;
			
		}
		
		public int getId() 
		{
			return id;
		}
		
		@Override
		public String toString()
		{
			return "Employee1(id : " +id + " , name = " + name + " , addreess = " + address + " , salary = " + salary +")";
			
		}
		
	}
	public class Assignment8
	{

		public static void main(String[] args) 
		{
			Vector<Employee1> list = new Vector<>();
			
			list.add(new Employee1(101 , "Rahul" , " Nashik"  , 20000.0));
			list.add(new Employee1(102 , "Raml" , " Pune"  , 30000.0));
			list.add(new Employee1(103 , "Sham" , " Mumbai"  , 20000.0));
			list.add(new Employee1(104 , "Shantanu" , " Thane"  , 20000.0));
			
			Iterator<Employee1> it = list.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}

		}

	}



