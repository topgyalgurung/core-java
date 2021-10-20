
//best way to achieve runtime polymorphism 
interface Shape{ // public Class Shape{ //abstract class Shape{
    /*
    Shape(){  //error
    }
     */
    void draw();  
}
class Circle implements Shape{ // extends Shape // no object to object inheritance
    void draw(){ // overriding 
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Draw a Rectangle");
    }
}
class Polygon extends Shape{
    public void draw(){
        System.out.println("Drawing a polygon");
    }
}

public class interfacedemo {
    public static void main(String[] args) {
        
    }
    
}
