import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import java.util.function.Consumer;

public class streamapi {
    public static void main(String[] args) {
        List<Integer> values=Arrays.asList(1,2,3,4,5,6);

        System.out.println("Three external iterations demo");
        System.out.println("using normal loop");
        // normal for loop
        for(int i=0;i<6;i++){
            System.out.println(values.get(i));
        }
        System.out.println("using iterator: ");
        //enhanced loop using iterator 
        Iterator<Integer> it=values.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //enhanced for loop
        System.out.println("Using enhanced for loop");
        for(int i:values)
        {
            System.out.println(i);
        }
        System.out.println("Now lets see internal iterations");
        Consumer<Integer> c=new Consumer<Integer>()
        {
            public void accept(Interger i)
            {
                System.out.println(i);
            }
        };
        values.forEach(c);

        // To make it more efficient
        System.out.println("More efficient ways");
        // Consumer<Integer> cm=(Integer i)->System.out.println(i);
        // Consumer<Integer> cm=i->System.out.println(i);
        // values.forEach(cm);
        values.forEach(i->System.out.println(i)); //lambda expression

        values.forEach(System.out::println); //out.println(i);
        // work with method reference in java8 use ::  // call by method (method reference)

        //next see MapStream.java

    }
    
}
