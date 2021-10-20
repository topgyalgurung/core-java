public class Car {
    // field variables
    // instance variable their values (attributes)may be from one object to other
    // static variables :there is only one copy
    // instance variables for class car
    // instance variables are mostly declared as private

    private String model = "Unspecified";
    private int year = 1900;
    private int noOfDoors = 4;
    private float speed = 60.0f; // float speed=60
    private String color = "Gray";
    private String owner = "Unknown";

    // private: it can only be accessed by the class itself(within the class)
    // protected: within the class or subclass; can not be accessed by outside
    // public: any1

    // constructors are methods that have the same name as the class and no type.
    // they allow you to construct an object with an initial state
    // you can design as many constructors as possible
    // default

    Car() {
        model = "Unspecified";
        year = 1900;
        noOfDoors = 4;
        speed = 60; // float speed=60
        color = "Gray";
        owner = "Unknown";
    }

    // Constructor that accepts all attributes
    Car(String m, int y, int n, float s, String c, String o) {
        model = m;
        year = y;
        noOfDoors = n;
        speed = s; // float speed=60
        color = c;
        owner = o;
    }
    // methods for the class
    // display the object
    // design toString method that returns the state of the object as a String

    public String toString() {
        String st = "Model: " + model + "\n" + "Year: " + year + "\n" + "NoOfDoors: " + noOfDoors + "\n" + "Speed: "
                + speed + "\n" + "Color: " + color + "\n" + "Owner: " + this.owner;
        return st;
    }

    public void print() {
        System.out.println("Model: " + model + "\n" + "Year: " + year + "\n" + "NoOfDoors: " + noOfDoors + "\n"
                + "Speed: " + speed + "\n" + "Color: " + color + "\n" + "Owner: " + this.owner);
    }

    // accessors and mutators: to be able to access the private members from
    // outside,
    // you have to provide accessors(in order to access them)
    // and mutators (in order to change them)
    // accessors

    public String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    int getNoOfDoors() {
        return noOfDoors;
    }

    float getSpeed() {
        return speed;
    }

    String getColor() {
        return color;
    }

    String getOwner() {
        return this.owner;
    }

    public void setModel(String m1) {
        model = m1;
    }

    public void setYear(int y1) {
        year = y1;
    }

    void setNoOfDoors(int n1) {
        noOfDoors = n1;
    }

    void setSpeed(float s1) {
        speed = s1;
    }

    void setColor(String c1) {
        this.color = c1;
    }

    public static void main(String[] args) {
        // create a default object called defaultCar
        Car defaultCar = new Car();// <-safer;
        defaultCar.print();
        defaultCar.setColor("yellow");
        System.out.println("\n");
        // create a John's VW car, year 2003,speed 54,color red,3 doors;
        Car JohnsCar = new Car("VW", 2003, 3, 54.0f, "RED", "John");
        JohnsCar.print();

    }

}
