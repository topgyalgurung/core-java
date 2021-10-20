public class stringbuilderDemo {
    public static void main(String[] args) {
        
        String str=new String("Hello");
        StringBuilder builder=new StringBuilder("Hello");
        StringBuffer buffer=new StringBuffer("Hello");

        str.concat("Hi...");
        builder.append("Hi...");
        buffer.append("Hi...");

        System.out.println(str); //IMMUTABLE
        System.out.println(builder); //MUTABLE
        System.out.println(buffer); //MUTABLE
    }
}
