package day3;

import java.util.Scanner;

class emp
{
	String eid;   //class member or class instance 
	String ename;
	int age;
	
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		eid=sc.next();
		System.out.println("Enter Employee name: ");
		ename=sc.next();
		System.out.println("Enter Employee age: ");
		age=sc.nextInt();
		
	}
	public void display()
	{
		System.out.println(eid+" "+ename+ " "+age);
	}
}
class Student
{
	int sid;
	String sName;
	String subject;
	double marks;
	
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id: ");
		sid=sc.nextInt();
		System.out.println("Enter Student name: ");
		sName=sc.next();
		System.out.println("Enter Student subject: ");
		subject=sc.next();
		System.out.println("Enter Student marks: ");
		marks=sc.nextDouble();
		
	}
	public void display() 
	{
		System.out.println(sid+" "+sName+ " "+subject+" "+marks);
	}
	
}

public class expobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1=new emp();
		emp e2=new emp();
		e1.get();
		e1.display();
		e2.get();
		e2.display();
		/**
		 * student object
		 */
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.get();
		s1.display();
		s2.get();
		s2.display();
		s3.get();
		s3.display();

	}

}
