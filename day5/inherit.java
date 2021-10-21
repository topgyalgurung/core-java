package day5;

//private members of a class not inheritable
class Superc{
	int x;
	public Superc(int x)
	{
		this.x=x;
	}
	public void display()
	{
		System.out.println("x: "+x);
	}
	
}

class Subc extends Superc{
	int y;
	public Subc(int a,int b) {
		super(b); // super keyword to inherit or call constructor of superclass 
		y=a;
		
	}
	public void show()
	{
		System.out.println("x: "+x+"y: "+y);
	}
}	

class mul extends Subc{
	int z;
	public mul(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	void put() {
		System.out.println("x: "+x+" y: "+"z: "+z);
	}
}
/**
 * 
 * @author topgyal
 * student ->id,name, disp
 * marks(student) -> marks, show(id, name,mark)
 *
 */
class Student{
	int id;String name;
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("id: "+id+" name: "+name);
	}
}
class Marks extends Student{
	int marks;
	public Marks(int marks, int id, String name)
	{
		super(id,name);
		this.marks=marks;
	}
	public void show()
	{
		System.out.println("id: "+id+" name: "+name+" marks: "+marks);
	}
}
public class inherit {
	public static void main(String[] args) {
//		Superc obj=new Superc(6);
//		Subc sobj=new Subc(12,10);
//		obj.display();
//		sobj.display();
//		sobj.show();
		
		Student s1=new Student(1,"Sam");
		s1.display();
		
		Marks m1=new Marks(80,2,"Harry");
		m1.display();
		m1.show();		
		
		mul obj=new mul(5,6,7);
		obj.display();
		obj.show();
		obj.put();

	}

}
