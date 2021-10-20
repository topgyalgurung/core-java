//this class implementss a list of double using a linked list
//the method exposed to outside are:
//a constructor of a list
//insertFront(double)
//insertTail(double)
//insert(index,double //insert at a specific location
//removeFront
//removeTail
//remove(index)
//isEmpty()
//size()
//print()

public class MAC286List {
    // public static void main(String[] args) {
    // need node that link one to another
    // the class does not need to be public ,we will make it private
    private class Node {
        private double data;
        public Node next;

        // constructor
        public Node() {
            data = 0.0;
            next = null;
        }

        Node(double val) {
            data = val;
            next = null;
        }

        Node(double val, Node n) {
            data = val;
            next = n;
        }

        // acessors
        public double getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        // mutators
        public void setData(double val) {
            data = val;
        }

        public void setNext(Node n) {
            next = n;
        }
    }

    // reference to the first and last
    private Node first, last;
    private int nElements;

    // mutators and accessors
    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // constructor
    public MAC286List() {
        first = last = null;
        nElements = 0;
    }

    // the interface of the class
    public void insertFront(double val) {
        // create node to store value
        Node temp = new Node(val);
        // take care of the case the list is empty
        if (nElements == 0) {
            first = last = temp;
        } else {
            // make temp point to the first
            temp.next = first;
            first = temp;
        }
        nElement++;
    }

    public void insertTail(double val) {
        // create node to store value
        Node temp = new Node(val);
        // take care of the case the list is empty
        if (nElements == 0) {
            first = last = temp;
        } else {
            // link temp to the list
            last.next = temp;
            // update last because temp is last
            last = temp;
        }
        // increase the count of elements
        nElements++;
    }

    public void insert(int index, double val) {

        if (index < 0 || index > nElements) {
            System.out.println("invalid");
            return;
        }
        if (index == 0) {
            insertFront(val);
            return;
        }
        /*
         * if(index==nElements){ //no need for insertTail(val); return; }
         */
        // go to the node right before index
        // create a references so that we wnt lose first
        Node T = first;
        for (int i = 0; i < index - 1; i++) {
            T = T.next;
        }
        Node temp = new Node(val);
        // insert the node
        // first update the links of the new node then update list
        temp.next = T.next;
        T.next = temp;
    }

    // remove the front and returns
    public double removeFront() {
        if (nElements == 0) {
            System.out.println("no elements to remove,empty");
            return -1;
        }
        if (nElements == 1) {
            Node temp = first;
            first = last = null;
            nElements = 0;
            return temp.data;
        }
        // remember first node before taking our of list
        Node temp = first;
        // make first point to second
        first = first.next;
        // one element less
        nElements--;
        // return the data in the previous furst
        return temp.data;
    }

    public double removeTail(int index) {
        if (nElements == 0) {
            System.out.println("no elements to remove,empty");
            return -1;
        }
        if (nElements == 1) {
            Node temp = last;
            first = last = null;
            nElements = 0;
            return temp.data;
        }
        // go to node before last
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // rememeber the last
        Node T = last;
        temp.next = null;
        last = temp;
        nElements--;
        return T.data;
    }

}

    // remove index
    public double remove(int index){
		if(index<0||||index>=nElements){
			System.out.println("invalid index");
			return -1;
		}
		if(index==0){
			return removeFront();
		}else if(index==nElements-1){
			return removeTail();
		}
		//go to the node before index
		Node T=first;
		for(int i=0;i<index-1;i++){
			T=T.next;
		}
		//remember the node to delete
		Note temp=T.next;
		//change next of T to the next of the next
		T.next=T.next.next;
		nElements--;
		return temp.getData;
	}

    // isEmpty()
    public boolean isEmpty(){
		return (nElements==0) ? true:false);
		//return true if =0;else false
	}

    public int size() {
        return nElements;
    }

    public void print(){
		Node temp=first;
		int ind=0;
		while(temp!=null){
			System.out.println("("+ind+")"+temp.getData());
			temp=temp.next;
			ind++;
		}

    public static void main(String[] args) {
        MAC286List myList = new MAC286List();
        myList.insertTail(23.6);
        myList.insertTail(3.1);
        myList.insertFront(56.2);
        myList.print();

        double temp = myList.removeFront();
        System.out.println("removed" + temp);
        temp = myList.removeTail();
        System.out.println("removed" + temp);
        temp = myList.remove(1);
        System.out.println("removed" + temp);

    }

}