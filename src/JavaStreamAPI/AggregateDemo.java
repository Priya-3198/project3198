package JavaStreamAPI;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int id;
	int salary;
	String name;


	Employee(int id, int salary, String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
}
public class AggregateDemo 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, 50000, "Riya");
		Employee e2 = new Employee(1, 40000, "Priya");
		Employee e3 = new Employee(1, 60000, "Riyansh");
		
		List<Employee> emp = new ArrayList();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		int totalSal=emp.stream().collect(Collectors.summingInt(a->a.salary));
		System.out.println("Sum" +totalSal);
		
		Employee max=emp.stream().max((a,b)->a.salary>b.salary?1:-1).get();
		System.out.println("Max" +max.salary);
		
		Employee min=emp.stream().max((a,b)->a.salary>b.salary?1:-1).get();
		System.out.println("Min" +min.salary);
		
		long countSalary=emp.stream().filter(a->a.salary>40000).count();
		System.out.println(countSalary);
		

	}

}
