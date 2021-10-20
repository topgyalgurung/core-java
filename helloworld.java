import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import jdk.internal.org.jline.utils.InputStreamReader;

public class helloworld{
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number ");
        String line=br.readLine();
        int N=Integer.parseInt(line);

        for(int i=0;i<N;i++){
            System.out.println("hello world");
        }
    }
}