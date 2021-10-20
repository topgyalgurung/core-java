import jdk.internal.jshell.tool.resources.l10n;

/*class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
*/
abstract class Shape{
    Shape(){
        System.out.println("Shape is constructed ");
    }
    abstract void draw(); // no definition, must redefine in child class otherwise error 
}
//best way to achieve runtime polymorphism 
interface Shape{
    void draw(); 
}
class Circle extends Shape{ //object to object inheritance
    void draw(){ // overriding 
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Draw a Rectangle");
    }
}
class Polygon extends Shape{
    void draw(){
        System.out.println("Drawing a polygon");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.draw();

        s=new Rectangle();
        s.draw();

        s=new Polygon();
        s.draw();
    }
    
}


