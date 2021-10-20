
public class MAC286Main {
	public static void main(String[] args) {
		//create a MAC286Array of size 5
		MAC286Array M = new MAC286Array(10);
		//insert -2.0 at the tail.
		if (M.insertTail(-2.0) == false) {
			System.out.println("The array is full");
		}
		if (M.insertTail(34.0) == false) {
			System.out.println("The array is full");
		}
		if (M.insertTail(-12.0) == false) {
			System.out.println("The array is full");
		}
		if (M.insertTail(-56.0) == false) {
			System.out.println("The array is full");
		}
		if (M.insertTail(108.0) == false) {
			System.out.println("The array is full");
		}
		if (M.insertTail(-209.0) == false) {
			System.out.println("The array is full");
			//print the array
		}
		M.insertElement(2, 4.5);
		M.display();
		//remove the tail
		double val = M.removeTail();
		System.out.println("The value is: " + val);
		M.display();
		
		val = M.removeHead();
		System.out.println("The value is: " + val);
		M.display();
		val = M.removeElement(3);
		System.out.println("The value is: " + val);
		M.display();
		System.out.println("max size before: " + M.capacity());
		M.resize(20);
		M.display();
		System.out.println("max size: " + M.capacity());
		M.InsertionSort();
		M.display();
	}

}