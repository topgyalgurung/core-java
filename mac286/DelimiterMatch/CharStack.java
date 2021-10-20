import java.util.Vector;

public class CharStack {
    private Vector<Character> myVec;

    // default constructor
    public CharStack() {
        myVec = new Vector<Character>(100);
    }

    // constructor that accepts a size
    public CharStack(int size) {
        myVec = new Vector<Character>(size);
    }

    // isEmpty() returns true if empty otherwise false
    public boolean isEmpty() {
        return myVec.isEmpty();
    }

    // isFull() returns true if full otherwise false
    public boolean isFull() {
        if (myVec.size() == myVec.capacity())
            return true;
        return false;
    }

    // size return the number of elements
    public int size() {
        return myVec.size();
    }

    // push add an element to the end
    public void Push(char a) {
        myVec.add(a);// add adds an elements to the tail (top)
    }

    // Pop removes an element from the tail
    public char Pop() {
        char temp = myVec.remove(myVec.size() - 1);
        return temp;
    }

    // seek or At returns the elements at an index without removing it
    public int Peek() {
        return myVec.elementAt(myVec.size() - 1);
    }

    // print to display the content of the stack from the top to bottom
    public void print() {
        for (int i = myVec.size() - 1; i >= 0; i--) {
            System.out.println("Stack(" + i + ") = " + this.myVec.elementAt(i));
        }
    }

    public static void main(String[] args) {

    }
}