package day3;

class stat
{
	int x;
	static int count; //static variable
	
	void getdata(int value) 
	{
		x=value;
		count++;
		
	}
	
	//static method
	static void get()
	{
		count++;
		System.out.println("This is static method"+count);
		//x=count; // x is non static, Cannot make a static reference to the non-static field x 
	}
	static //first thing that execute first when the class is accessed 
	{
		System.out.println("This static block");
		//static block execute only once. 
	}
	
	
}
public class staticexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat s1=new stat();
		stat s2=new stat();
		s1.getdata(6);
		s2.getdata(8);
		stat.get(); //call class.staticmethod
		

	}

}
