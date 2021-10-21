package day5;

class one{
	int id; String name; //class variable 
	public one(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	void display() 
	{
		System.out.println("id: "+id+"name: "+name);
	}
	
}

public class thisexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one obj=new one(4,"Daniel");
		obj.display();

	}

}
