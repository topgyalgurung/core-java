import java.util.Scanner;

public class forexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* factorial
		 * int 4;
		 * output 24
		 * explanation 1*2*3*4
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to find its factorial: ");
		
		int num=sc.nextInt();
		int res=1;
		for(int i=1;i<=num;i++) {
			res*=i;
		}
		/*
		 * int i=1;
		 * for(;i<=n;){
		 * res*=i;
		 * i++;
		 * }
		 */
		System.out.println("Factorial of "+num+" is: "+res);
		
	}

}
