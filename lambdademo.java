//functional interface from java8, lambda expression possible
interface Abd{
    void show();
}
public class lambdademo {
    public static void main(String[] args) {
        /**
         * Abc obj=new Abc()
         * {
         *      public void show(){ System.out.println(" i am lambda expression");}
         * };
         */
        Abc obj=()->System.out.println("i am lambda expression");
        obj.show();
    }
    
}
