import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// https://youtu.be/4zvGCilsWL4
public class filterreduce {
    public static void main(String[] args) {
    
    List<Integer>values=Arrays.asList(12,20,35,46,55,68,75);
    int res=0;
    for(int i:values){
        if(i%5==0){
            res+=i;
        }
    }
    System.out.println(values.stream()
                             .filter(i->i%5==0)
                             .reduce(0,(c,e)->c+e));
    // NOW lets understand how filter() works
    // filter takes predicate functional interface which has one method with one arg test which returns bool
    Predicate<Integer>p=new Predicate<Integer>()
    {
        public boolean test(Integer i){
            return i%5==0;
        }

    };
    //LAZY EVALUATION
    System.out.println(values.stream()
                             .filter(p)
                             .reduce(0,(c,e)->c+e));
    System.out.println(values.stream()
                             .filter(i->i%5==0)
                             .map(i->i*2)
                             .reduce(0,(c,e)->c+e));
    System.out.println(values.stream()
                             .filter(i->i%5==0)
                             .map(i->i*2)
                             .findFirst() //not lazy method, terminal function
                             .orElse(0));

    System.out.println(values.stream()
                             .filter(filterreduce::isDivisible)
                             .map(filterreduce::mapDouble)
                             .findFirst() //not lazy method, terminal function
                             .orElse(0));
    }
    public static boolean isDivisible(int i)
    {
        System.out.println("in isDva "+i);
        return i%5==0;
    }
    public static int mapDouble(int i)
    {
        System.out.println("in mapdouble " +i);
        return i*2;
    }

}
    
