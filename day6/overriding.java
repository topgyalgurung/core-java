package day6;
class shape{
	String area()
	{
		return("The area is: ");
	}
}

class square extends shape{
	int x;
	public square(int x)
	{
		this.x=x;
	}
	@Override
	String area()
	{
		return(super.area()+" "+x*x);
	}
}
class circle extends shape{
	double r;
	public circle(double r)
	{
		this.r=r;
	}
	@Override
	String area()
	{
		return(super.area()+" "+3.14*r*r);
	}
}
public class overriding {
//	square s=new square(6);
//	
//	
	public static void main(String [] args) {
	shape s=new circle(3.5);
	System.out.println(s.area());
	s=new square(6);
	System.out.println(s.area());
	}

}
