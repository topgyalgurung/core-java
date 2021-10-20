import java.text.ChoiceFormat;

class Parent {
}

class Child extends Parent implements MyInterface {
}

interface MyInterface {
}

public class instanceComparator {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Parent();

        System.out.println("obj1 instance of parent:" + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));

    }

}
