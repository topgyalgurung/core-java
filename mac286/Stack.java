import java.util.*;

//design a Stack as wrapper to Vector
public class Stack286 {
    private Vector<Integer> myVec;

    // default constructor
    public Stack286() {
        myVec = new Vector<Integer>(100);
    }

    // constructor that accepts a size
    public Stack286(int size) {
        myVec = new Vector<Integer>(size);
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

    // size retuen the number of elements
    public int size() {
        return myVec.size();
    }

    // push add an element to the end
    public void Push(int a) {
        myVec.add(a);// add adds an elements to the tail (top)
    }

    // Pop removes an element from the tail
    public int Pop() {
        int temp = myVec.remove(myVec.size() - 1);
        return temp;
    }

    // seek or At returns the elements at an index without removing it
    public int Peek(int ind) {
        return myVec.elementAt(ind);
    }

}

    public void print() {
        for (int i = myVec.size() - 1; i >= 0; i--) {
            System.out.println("stack(" + i + ")=" + Peek(i));
            ;
        }

    }

    public static void main(String[] args) {
        Stack286 mainStack = new Stack286();
        mainStack.Push(10);
        mainStack.Push(-10);
        mainStack.Push(-100);
        mainStack.Push(5);
        mainStack.Push(101);
        mainStack.Push(-101);
        mainStack.Push(3);
        mainStack.Push(100);
        mainStack.print();

        Stack286 stack1 = new Stack286();
        Stack286 stack2 = new Stack286();
        Stack286 stack3 = new Stack286();

        while (!mainStack.isEmpty()) {
            int temp = mainStack.Pop();

            if (temp < -100) {
                stack1.Push(temp);
            } else if (temp < 100) {
                stack2.Push(temp);
            } else {
                stack3.Push(temp);
            }
        }

        while (!stack1.isEmpty()) {
            int temp = stack1.Pop();// thirdStack.Push(secondStack.Pop());
            mainStack.Push(temp);
        }
        while (!stack2.isEmpty()) {
            int temp = stack2.Pop();
            mainStack.Push(temp);
        }
        while (!stack3.isEmpty()) {
            mainStack.Push(stack3.Pop());
        }
        System.out.println("\nfinal stack is");
        mainStack.print();
    }
}