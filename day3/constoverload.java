package day3;

class cons
{
	int x;
	double y;
	
	public cons()
	{
		x=1;
		y=5.6;
	}
	public cons(int a,double b)
	{
		x=a;
		y=b;
	}
	public cons(cons obj)  //copy obj 
	{
		x=obj.x;
		y=obj.y;
	}
	void display()
	{
		System.out.println("x: "+x+" y: "+y);
	}
}
public class constoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons c1=new cons();
		c1.display();
		
		cons c2=new cons(17,8.9);
		c2.display();
		
		cons c3=new cons(c1); 
		c3.display();

	}

}
