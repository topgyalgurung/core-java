/*
 * primitive types: Byte, short, int, long, float, double, char, boolean
 * State (field variables (declared private, provide accessors and mutators))
 * Methods allow to modify the state of an object
 * private (within the class), protected (within and subclasses) 
 * or public (anyone)
 * Data Structure: a way of organizing data in the memory. 
 * One of the most important data structures is arrays. 
 * in Java this is not allowed: 
 * Car car1 = new Car(); 
 * Car car2 = new Car();
 * if (Car1 == Car2) {Cannot do this
 * 	
 * }
 * In Java you have to use .equals
 * if(Car1.equals(Car2)) {
 * 
 * }
 * in Java no pointers, everything is a reference (the new operator returns a reference)
 * Parameters: basic (primitive) types are passed by value
 * Objects (complex types) are passed by reference
 */
public class ArrayApp {
	public static void main(String[] args) {
		//Arrays
		//declare an array type [] ArrayName;
        int [] ArrayName=new int [10];
		//create an array: ArrayName = new type[size];
		//elements are indexed from 0 to size-1
		//declare an array of 12 doubles
		double[] jando = new double[12];
		//set the 4th element to 3.2
		jando[3] = 3.2;
		//add -1.4 to the 4th element
		jando[3] = jando[3] -1.4;// jando[3] += -1.4;
		//to get the length of an array , we use .length
		System.out.println("The length is: " + jando.length);	
		//fill an array with the same value
		for (int i = 0; i <12; i++) {
			jando[i] = -2;
		}
		//display the content of an array
		for (int i =0; i<12; i++){
			System.out.println("Jando["+ i + "]=" + jando[i]);
		}
		
	}

}