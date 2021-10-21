package day5;

class sup{
	int x=0,y=0;
//	public sup(int x,int y)
//	{
//		this.x=x;
//		this.y=y;
//	}
	void show()
	{
		System.out.println("super x:"+x+" super y:"+y);
	}
}
class sub extends sup{
	int x;
	public sub(int a,int b, int c)
	{
		x=a;
		y=b;
		super.x=c; //x of superclass
	}
	void show()
	{
		super.show();
		System.out.println("sub x: "+x);
		
	}
}
public class superexp {
	public static void main(String[] args) {
		sup sob=new sup();
		sob.show(); //super x, super y
		//sup sob;
		sob=new sub(11,12,13);
		sob.show(); //super x,super y, sub x
		
		sub obj=new sub(10,20,30);
		obj.show();
		
	}

}
