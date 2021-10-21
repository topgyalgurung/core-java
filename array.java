
public class array {
	/*
	 * program that will do addition of all int stored in the array
	 * 
	 */
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
//		int arr[];
//		arr=new int [10];
//		//String[] name=new String[5];
//		
//		for(int i=0;i<10;i++) {
//			arr[i]=i*i;
//		}
////		for(int i=0;i<5;i++) {
////			System.out.println("value at index"+i);
////		}
//		
//		//foreach used for collections
//		for(int i:arr) {
//			System.out.println(" "+i);
//		}
		int SIZE=5;
		int [] arr=new int[SIZE];
		
		for(int i=0;i<SIZE;i++) {
			arr[i]=i;
		}
		for(int i:arr) {
			System.out.print(i+ " ");	
		}
		//do addition of int in array
		int res=0;
		for(int i=0;i<SIZE;i++) {
			res+=arr[i];
		}
		System.out.println("Result is : "+res);
		
	}

}
