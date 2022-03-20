package collectionimpprog;

import java.util.ArrayList;
import java.util.Iterator;

class Student implements Comparable<Student>
{
	int rollno,age;
	String name;

	Student(int rollno, String name, int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}

	@Override
	public String toString() 
	{
		return " [rollno = " + rollno + ", age = " + age + ", name = " + name + "]";
	}

	@Override
	public int compareTo(Student o) 
	{
		if(this.rollno == o.rollno)
		{
			return 0;
		}
		else if(this.rollno > o.rollno)
		{
			return 1;
		}
		return 0;
		
	}
	
	
}

public class UseComparable
{

	public static void main(String[] args) 
	{
		ArrayList<Student> list=new ArrayList();
		
		list.add(new Student( 1, " Priya ", 20 ));
		list.add(new Student( 2, " Kajal ", 19 ));
		list.add(new Student( 5, " Samu ", 16 ));
		list.add(new Student( 3, " Sanju ", 21 ));
		list.add(new Student( 4, " arati ", 22 ));
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		

		}
	}
}