
//Create an ArrayList of Employee( id,name,address,sal) objects and search for particular Employee object based on id number.

package CollectionAssignment;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class Employee 
{
	private int id;
	private String name;
	private String address;
	private Double salary; 
	
	public Employee(int id, String name, String address , Double salary)
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
		return "Employee(id : " +id + " , name = " + name + " , addreess = " + address + " , salary = " + salary +")";
		
	}
	
}
public class Assign5 
{

	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101 , "Rahul" , " Nashik"  , 20000.0));
		list.add(new Employee(102 , "Raml" , " Pune"  , 30000.0));
		list.add(new Employee(103 , "Sham" , " Mumbai"  , 20000.0));
		list.add(new Employee(104 , "Shantanu" , " Thane"  , 20000.0));
		
		Iterator<Employee> it = list.iterator();
		
		Scanner Id = new Scanner(System.in);
		System.out.println("Enter ID");
		int searchId= Id.nextInt();
		
		while(it.hasNext())
		{
			Employee emp = it.next();
			if(emp.getId() == searchId)
			{
				System.out.println(emp);
				
			}
			
		}

	}

}
