
public class typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//typecasting
		
		// These are implicit type casting 
		char ch='X';
		//convert char into int
		int val=ch;
		int value =4786;
		double dv=value;
		System.out.println("ch: "+ch);
		System.out.println("ch: "+val); //prints 88 ASCII value=X
		
		System.out.println("value: "+value);
		System.out.println("dv: "+ dv); // int can be stored inside double variable easily
	
		// explicit type casting
		double dv1=47.023;
		// int val=dv; //incompatible type, higher data type to lower
		// to solve
		int val1=(int)dv1;
		char ch1=(char)val1;
		//loss of data, fraction part is neglicted
		System.out.println("dv1: "+dv1);
		System.out.println("val1: "+ val1);
		System.out.println("ch1: "+ch1); //47's ASCII is /
		
		
		
	}

}
