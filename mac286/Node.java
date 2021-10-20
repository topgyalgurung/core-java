public class Node {
    private int iData;
    private double dData;
    public Node next;

    public Node() {
        iData = 0;
        dData = 0.0;
        next = null;
    }

    public Node(int n, double d) {
        iData = n;
        dData = d;
        next = null;
    }

    public Node(int n, double d, Node link) {
        iData = n;
        dData = d;
        next = link;
    }

    // accesors mutators
    public void setIData(int n) {
        iData = n;
    }

    public int getIData() {
        return iData;
    }

    public void setDData(double d) {
        dData = d;
    }

    public double getDData() {
        return dData;
    }

    public String toString() {
        String st = "iData = " + iData + ", dData = " + dData;
        return st;
    }

    public void display() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        // write a main in which you create the following structure
        // (5, 1.2) (should be remembered as first) linked to (-4, -2.3)
        // which is linked to (-10, 34.2)
        Node first = new Node(5, 1.2);
        Node second = new Node(-4, -2.3);

        // make the first point to the second
        first.next = second;
        Node third = new Node(-10, 34.2);
        // make the second point to the third
        second.next = third; // or first.next.next = third

        // create and insert node (-30, 45.1) between the second and the third using only first.
        Node temp = new Node(-30, 45.1);
        // change first the last link before you break it!
        temp.next = first.next.next;
        first.next.next = temp; // 

        // create and insert node (-36, -1.2) at the last using a loop.
        // create the node
        Node last = new Node(-36, -1.2);
        // go through the list to the last node then insert the new node
        temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        // link the last node to the new node
        temp.next = last;
        last.next = null;

        // print the list: use a temporary reference and move until you reach
        // the end null
        for (temp = first; temp != null; temp = temp.next) {
            temp.display();
        }
        // create node (-100, 34.5) insert it at the beginning,
        // first should be updated to always refer to the first node in the list
    }
}