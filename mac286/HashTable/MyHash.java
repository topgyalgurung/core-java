//design a hashtable that accepts keys consisting (keys are diff) of 5 letter 0-9+A-Z
//the size of the table is 1000. show the index
public class MyHash {
	private class Data{
		boolean used;
		String key;
		int iData;
	
	public Data(String k,int d){
		key=k;
		iData=d;
		used=false;
	}
}
	private Data[]myArray;
	public MyHash(int size){
		myArray=new Data[size];
	}
	public void insert(String k,int d){
		

	}
}