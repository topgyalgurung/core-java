package day5;

class two{
	int id; String name;
	
	public two(){
		System.out.println("default constructor");
	}
	public two(int id,String name) {
		this();
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("id: "+id+"name: "+name);
	}
}

public class thisexmp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two t=new two(5,"topgyal");
		t.display();

	}

}
