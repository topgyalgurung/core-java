import java.util.Scanner;

public class whileexmp {
	
	//print first n natural nums
	
	//reverse of a number
	/*
	 * input:8095
	 * output: 5908
	 */
	
	/*
	 * sum of digits of a number
	 * input=8095
	 * output=22
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int rev=0;
//		
//		while(n>0) {
//			
//			int rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//			
//			
//		}
//		System.out.println("");
		
		/*
		 * sum of digits of a number
		 * input=8095
		 * output=22
		 */
		System.out.println("enter a number: ");
		int input=sc.nextInt();
		int res=0;
		while(input>0) {
			int rem=input%10;
			res+=rem;
			input=input/10;
		}
		System.out.println("Sum of digits of a number is: "+ res);
		
		
	}

}
