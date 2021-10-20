// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
import java.util.Arrays;
public class javaArray {
    public static void main(String [] args){
        String [] copyFrom={
            "Topgyal", "Sonam","Tinzin", "Lamu"
        };
        String [] copyTo=Arrays.copyOfRange(copyFrom, 1, 4);
        for(String name:copyTo){
            System.out.println(name+" ");
        }
        //System.out.println(copyTo[1]);
        Arrays.stream(copyTo).map(name->name+" ").forEach(System.out::println);
        System.out.println(Arrays.toString(copyTo));
    }
    
}
