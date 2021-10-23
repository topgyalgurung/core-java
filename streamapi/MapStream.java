import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.*;
import java.util.Optional;

/**
 * Streams are sequences of elements from a Collection
 * 
 */

class MapStream{
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        for(int i=1;i<=100;i++){
            values.add(i);
        }
        for(int i:values){
            System.out.println(i);
        }
        values.forEach(System.out::println);
        // now lets convert this into stream
        values.stream().forEach(System.out::println);
        values.parallelStream().forEach(System.out::println); //create multiple thread 

        // Stream API has two methods intermediate like filter(), map() & terminate like findFirst() and forEach()
        //intermediate method or lazy evaluation
        System.out.println(values.stream().filter(i->{
            System.out.println("hi");
            return true;
        }).findFirst());  //findFirst will give optional 
        // .findFirst().orElse(0); //to print smth else 

        /**
         * Once stream is used, we can not reuse it
         * Stream<Integer>s=values.stream();
         * s.forEach(System.out::println); //work
         * s.forEach(System.out::println); // excep
         */

         // check mapreduce for stream api details


        // ------------------------------------------------------//
        
        /*
        Map <String,Integer> books=new HashMap<String,Integer>();
        Set<Map.Entry<Furniture,Integer>> entries=books.entrySet(); //obtain set of key-value pairs
        
        Set<String>keySet=books.keySet(); //get key set associated with map
        Collection<Integer>values=books.values(); // get set of values

        books.put("978-89043","Head First Java");
        
        //get key for a book matching title
        Optional <String> optIsbn= books.entrySet.stream()
                                        .filter(e->"Head First Java".equals(e.getValue()))
                                        .map(Map.Entry::getKey)
                                        .findFirst();
        */

        
    }

}
