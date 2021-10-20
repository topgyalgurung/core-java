
public class Tester {
    public static void main(String[] args) {
        // xcreate a hash table of size 100
        MAC286HashTable myH = new MAC286HashTable(100);
        myH.insert("12345", -345);
        myH.insert("A2345", -34);
        myH.insert("3fg45", -2);
        myH.insert("3f345", -768);
        myH.print();
    }
}