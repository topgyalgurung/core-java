
public class Test {
	public static void main(String[]  args){
		MAC286List myList = new MAC286List();
		myList.insertTail(23.6);
		myList.insertTail(3.1);
		myList.insertTail(2.6);
		myList.insertTail(56.2);
		myList.insertTail(33.1);
		myList.print();
		double temp = myList.removeFront();
		System.out.println("Removed " + temp);
		temp = myList.removeTail();
		System.out.println("Removed " + temp);
		temp = myList.remove(1);
		System.out.println("Removed " + temp);	
		myList.print();
	}
	
}