
//Design a class MAC286Array that has the following characteristics:
//it stores doubles in an array
//it keeps track of the size of the array (how many elements are in the array
//provide a constructor that takes a maximum size
//provide accessor to size (returns how many elements inserted
//provide a method to insert an element at the tail (the end)
//provide a method to insert an element at specific location
//provide a method to remove the tail (the end)
//provide a method to remove an element at specific location.

//PLEASE DO THESE
//provide a method to return an element at specific location.
//provide a method to set an element at specific location to a new value
//provide a method to sort the array
//provide a method to resize the array (change the maximum capacity)
//provide a method capacity() to return the length (the maximum capacity)

public class MAC286Sort {
	private int nElements = 0;
	private double[] myArray;
		
	//default constructor creates an array of 100 elements 
	public MAC286Array() {
		nElements = 0;
		myArray = new double[100];
	}
	//constructor that accepts a size
	public MAC286Array(int s) {
		nElements = 0;
		myArray = new double[s];
	}
	//provide a method to insert an element at the tail (the end)
	public boolean insertTail(double val){
		if (nElements>= myArray.length) 
			return false;
		myArray[nElements] = val;
		nElements++;
		return true;
	}
	//A method to display the content of the array
	public void display() {
		for (int i =0; i<nElements; i++) {
			System.out.println("myArray[" + i+"] = " + myArray[i]);
		}
	}
	//method to return true if array is full
	public boolean isFull(){
		if (nElements >= myArray.length)
			return true;
		return false;
	}
	//method to return true if it is empty and false if not
	public boolean isEmpty(){
		if(nElements == 0)
			return true;
		return false;
	}
	//provide a method to insert an element at specific location
	public boolean insertElement(int index, double val) {
		if(this.isFull() || index <0 || index > nElements)
			return false;
		//move all the values from end to the index up by one
		for (int i = nElements-1; i>=index; i--) {
			//mov myArray[i] to myArray[i+1]
			myArray[i+1] = myArray[i];
		}
		//insert the value 
		myArray[index] = val;
		//increase number Elements
		nElements++;
		return true;
	}
	//provide a method to remove the tail (the end)
	public double removeTail() {
		nElements--;
		return (myArray[nElements]);
	}
	//provide a method to remove the tail (the end)
	public double removeHead() {
		double retVal = myArray[0];
		nElements--;
		for (int i = 0; i < nElements; i++) {
			myArray[i] = myArray[i+1];
		}
		return retVal;
	}
	//provide a method to remove a specific element
	public double removeElement(int index){
		if(index <0 || index >= nElements) {
			System.out.println("index does not exist!");
			return -1;
		}
		double retVal = myArray[index];
		nElements--;
		for (int i = index; i<nElements; i++) {
			myArray[i] = myArray[i+1];
		}
		return retVal;
	}
	//provide a method to return an element at specific location.
	public double elementAt(int i){
		return myArray[i];
	}
	//provide a method to set an element to specific value
	public void setElement(int index, double val) {
		if (index <0 || index >= nElements) 
			return;
		myArray[index] = val;
	}
	//provide a method to resize the array (change the maximum capacity)
	public void resize(int s){
		if (s < nElements) 
			return;
		//create a new array of a bigger size
		double [] temp = new double[s];
		//copy elements from myArray to the new one.
		for (int i = 0; i<nElements; i++) {
			temp[i] = myArray[i];
		}
		//set myArray to the new array
		myArray = temp;
	}
	//methode that returns the maximum capacity of the array
	public int capacity() {
		return myArray.length;
	}
	//method to sort
	public int indexSmallest(int start){
		int index = start;
		for (int i=start+1; i<nElements; i++) {
			if(myArray[i] < myArray[index]){
				index = i;
			}
		}
		return index;
	}
	//sort
	public void sort() {
		for (int i =0; i < nElements -1; i++) {
			int indexS = indexSmallest(i);
			if (indexS != i) {
				//swap element at indexS with element at i
				double temp = myArray[indexS];
				myArray[indexS] = myArray[i];
				myArray[i] = temp;
			}
		}
	}
	public void BubbleSort() {
		boolean isSwapped = true;
		for (int j = 0; j<nElements-1 && isSwapped; j++) {
			isSwapped = false;
			for (int i = 0; i<nElements-j-1; i++){
				if(myArray[i] > myArray[i+1]) {//swap
					double save = myArray[i];
					myArray[i] = myArray[i+1];
					myArray[i+1] = save;
					isSwapped = true;
				}
			}
		}
	}
	public void InsertionSort() {
		for (int i =0; i<nElements-1; i++) {
			if (myArray[i] > myArray[i+1]) {
				double save = myArray[i+1];
				int j = i;
				while(j>=0 && save < myArray[j]){
					myArray[j+1] = myArray[j];
					j--;
				}
				myArray[j+1] = save;
			}
		}
	}
}