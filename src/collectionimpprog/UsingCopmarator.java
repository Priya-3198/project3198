package collectionimpprog;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1 
{
	int rollno,age;
	String name;

	Student1(int rollno, String name, int age)
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
	class StudentSortByRollNo implements Comparator<Student1>
	{
		@Override
		public int compare(Student1 o1, Student1 o2) 
		{
			if(o1.rollno == o2.rollno)
			{
				return 0;
			}
			else if(o1.rollno > o2.rollno)
			{
				return 1;
			}
			return -1;
		}
	}
	
	class StudentSoryByName implements Comparator<Student1>
	{
	@Override
		public int compare(Student1 o1, Student1 o2)
		{
			return o1.name.compareTo(o2.name);
		}
	}
	
	
	
	
}

public class UsingCopmarator 
{

	public static void main(String[] args) 
	{
		ArrayList<Student1> list=new ArrayList();
		
		list.add(new Student1( 1, " Priya ", 20 ));
		list.add(new Student1( 2, " Kajal ", 19 ));
		list.add(new Student1( 5, " Samu ", 16 ));
		list.add(new Student1( 3, " Sanju ", 21 ));
		list.add(new Student1( 4, " arati ", 22 ));
		
		System.out.println("Sort By Roll No");
		Collections.sort(list, new StudentSortByRollNo());
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		

		}
		System.out.println(" Sort by name");
		Collections.sort(list, StudentSortByName());
		{
			
		}
		}
}



	