import java.util.*;
import java.util.List;

public class mapreduce {
    public static void main(String[] args) {
        List <Integer>values=Arrays.asList(1,2,3,4,5,6);
        
        int result=0
        for(int i:values){
            result=result+i*2;
        }
        // same can be done using stream in one line 
        // stream() is default method of collection interface
        // covert collection into stream
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
    }
    
}
