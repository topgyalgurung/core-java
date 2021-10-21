
public class methodoverlding {
	
	int add(int x) {return x+x;}
	Double add(Double x) {return x+x;}
	Double add(Double x,Double y) {return x+y;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverlding m=new methodoverlding();
		System.out.println("1st method add: "+m.add(5));
		System.out.println("2nd method add: "+m.add(6.5));
		System.out.println("3rd method add: "+m.add(6.5,5.5));
		

	}

}
