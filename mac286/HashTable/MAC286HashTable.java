
public class MAC286HashTable {
    private class Data {
        boolean used;
        String key;
        int iData;

        public Data(String k, int d) {
            key = k;
            iData = d;
            used = false;
        }
    }

    private Data[] myArr;
    private int SIZE;

    public MAC286HashTable() {
    }

    public MAC286HashTable(int s){
		myArr=new Data[s];
		SIZE=s;
		for(int i=0;i<SIZE;i++){
			myArr[i]=newData("+")
		}
	}

    // private int toInt(char c){
    // }
    public void insert(String k,int d){
		//create a data object
		Data myD=new Data(k,d);
		//generate the index
		long index=0;
		for(int i=k.length()-1;i>=0;i--){
			int power=k.length()-i-1;
			index=index+(long)((int)k.charAt(i)*Math.pow(36.0,(double)power));
		}
		System.out.print("index="+index);
		int genIndex=(int)index%SIZE;
		System.out.println("index="+index+" generated index="+genIndex);
		if(myArr[genIndex].used==false){
			myArr[genIndex]=myD;
			myArr[genIndex].used=true;
		}else{
			System.out.println("duplicate index! deal with it");
			Data temp=myArr[genIndex];
			while(temp.m)
		}
	}

    public void print() {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i].used) {
                System.out.println("index=" + i + "key+" + myArr[i].key + "iData=" + myArr[i].iData);
            }
        }
    }

    public static void main(String args[]){
		//create a hashtable of size 100
		MAC286HashTable myH=new MAC286HashTable(100);
		myH.insert("12345", -345);
		
	
}