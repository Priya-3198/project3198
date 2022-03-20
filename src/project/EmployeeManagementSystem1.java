package project;
import java.util.*;
public class EmployeeManagementSystem1 
{
	private static int getEid;
	int eid;
	String name, address, phno, dob, post, mail;
	float sal;
	
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getPhno()
	{
		return phno;
	}
	public void setPhno(String phno) 
	{
		this.phno = phno;
	}
	
	public String getDob() 
	{
		return dob;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	
	public String getPost() 
	{
		return post;
	}
	public void setPost(String post) 
	{
		this.post = post;
	}
	
	public String getMail() 
	{
		return mail;
	}
	public void setMail(String mail) 
	{
		this.mail = mail;
	}
	
	public float getSal()
	{
		return sal;
	}
	public void setSal(float sal) 
	{
		this.sal = sal;
	}
	

	@Override
	public String toString() 
	{
		return "[eid=" + eid + ", name=" + name + ", address=" + address + ", phno=" + phno
				+ ", dob=" + dob + ", post=" + post + ", mail=" + mail + ", sal=" + sal + "]";
	}
	
	public static void main(String[] args)
	{
		char ch1;
		EmployeeManagementSystem1 e;
		ArrayList<EmployeeManagementSystem1>ar = new ArrayList();  
		do
		{	
			
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------Employee Management System----------------");
			System.out.println("1. Add Employee Details");
			System.out.println("2. Show Employee Details");
			System.out.println("3. Search Employee Details");
			System.out.println("4. Update Employee ");
			System.out.println("5. Delete Employee ");
			System.out.println("Enter Choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1 :	e = new EmployeeManagementSystem1();
			
						System.out.println("Add Employee");
						System.out.println("Enter Employee Id");
						int id = sc.nextInt();
						System.out.println("Enter Employee Name");
						String ename = sc.next();
						System.out.println("Enter Employee Address");
						String addr = sc.next();
						System.out.println("Enter Employee Contact Number");
						String ph = sc.next();
						System.out.println("Enter Employee DOB");
						String dob = sc.next();
						System.out.println("Enter Employee Post");
						String post = sc.next();
						System.out.println("Enter Employee Email Id");
						String email = sc.next();
						System.out.println("Enter Employee Salary");
						float sal = sc.nextFloat();
						e.setEid(id);
						e.setName(ename);
						e.setAddress(addr);
						e.setPhno(ph);
						e.setDob(dob);
						e.setPost(post);
						e.setMail(email);
						e.setSal(sal);
						ar.add(e);
						break;
			
			case 2 :	System.out.println("Show EMployee Details");
						System.out.println(ar);
						break;
			
			case 3 :	System.out.println("Search Employee Details");
						System.out.println("Enter employee ID to search employee");
						int idd = sc.nextInt();
						for(int i=0; i<ar.size(); i++)
						{
							if(ar.get(i).getEid()==idd)
							{
								System.out.println(ar.get(i));
								break;
							}
						}
			
			case 4:		e = new EmployeeManagementSystem1();
						
						System.out.println("Update EMployee Details");
						System.out.println("Enter emp ID which you want to update");
						int id1 = sc.nextInt();
						
						for(int i =0 ; i<ar.size(); i++)
						{
							if(ar.get(i).getEid==id1)
							{
								
								System.out.println(ar+"/n");
								System.out.println("Emp Id \n"+ar.get(i).getEid());
								System.out.println("Enter Employee Name");
								String ename1 = sc.next();
								System.out.println("Enter Employee Address");
								String addr1 = sc.next();
								System.out.println("Enter Employee Contact Number");
								String ph1 = sc.next();
								System.out.println("Enter Employee DOB");
								String dob1 = sc.next();
								System.out.println("Enter Employee Post");
								String post1 = sc.next();
								System.out.println("Enter Employee Email Id");
								String email1 = sc.next();
								System.out.println("Enter Employee Salary");
								float sal1 = sc.nextFloat();
								
								e.setEid(ar.get(i).getEid());
								e.setName(ename1);
								e.setAddress(addr1);
								e.setPhno(ph1);
								e.setDob(dob1);
								e.setPost(post1);
								e.setMail(email1);
								e.setSal(sal1);
								ar.set(i, e);
								break;
							}
						}
			
			case 5 : 		System.out.println("Enetr ID to delete Record");
							int id2=sc.nextInt();
							String nm3 = "Not Available";
							for(int i= 0; i< ar.size();i++)
							{
								if(ar.get(i).getEid()==id2)
								{
									ar.remove(i);
									nm3 = "Removed";
								}
								else
								{
									System.out.println(nm3);
								}
							}
							
						
			default:	System.out.println("Invalid Input");
			}
						
						System.out.println("Do you wish to continue ");
						ch1 = sc.next().charAt(0);
					
		}while(ch1=='y' || ch1=='Y');
		
}
}
	
	
	
	