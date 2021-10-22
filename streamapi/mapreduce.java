//import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class mapreduce {
    public static void main(String[] args) {
        List <Integer>values=Arrays.asList(1,2,3,4,5,6);
        
        int result=0;
        for(int i:values){
            result=result+i*2;
        }
        // same can be done using stream in one line 
        // stream() is default method of collection interface
        // covert collection into stream
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));

        // to explain how stream map reduce api is implemented
        // use Function interface which takes two generic value <T,R> data type T & return type R
        Function<Integer,Integer> f=new Function<Integer,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }
        };
        BinaryOperator<Integer>b=new BinaryOperator<Integer>()
        {
            public Integer apply(Integer i, Integer j)
            {
                return i+j;
            }
        };
        Stream s=new stream();
        Stream s1=s.map(f);  //map need obj of function // value after mapping 2,4,6,8,10,12
        Integer res=(Integer)s.reduce(0,b);  //second parameter obj of binary operator //result = 42
        s.forEach(System.out::println);

        // TO MAKE IT MORE EFFICIENT using inner class concept
        Stream ss=new stream();
        Stream ss1=ss.map(new Function<Integer,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }
        });
        Integer ress=(Integer)ss.reduce(0,new BinaryOperator<Integer>()
        {
            public Integer apply(Integer i, Integer j)
            {
                return i+j;
            }
        });

        //now since we have Function interface we can use lambda expression, so we remove all boileplate code for ss and ress
        Stream<Integer> sss=values.stream();
        Stream<Integer> sss1=sss.map(i->i*2);
        Integer resss=(Integer)sss1.reduce(0,(c,e)->c+e); // c- carry , e - value // more logical instead of i,j
        System.out.println(resss);

        // now to make these three lines into one line
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
       }
    
}
