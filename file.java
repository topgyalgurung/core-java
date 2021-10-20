import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class file {
    public static void main(String[] args) {
        /**
         * to open a text file
         */
        String fileName="open.txt";
        PrintWriter outputStream=null; 
        try{
            outputStream=new PrintWriter(fileName);
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file "+fileName);
            System.exit(0);
        }
        /**
         * writing output to a text file
         */

        System.out.println("Enter three lines of text: ");
        Scanner keyboard=new Scanner(System.in);
        for(int count=1;count<=3;count++){
            String line=keyboard.nextLine();
            outputStream.println(count+" "+line);
        }
        outputStream.close();
        System.out.println("Those lines written to "+fileName);

        // /**
        //  * appending to a text file
        //  */
        try{
            outputStream=new PrintWriter(new FileOutputStream(fileName,true));
            outputStream.println("abc");
        }catch(FileNotFoundException e){
            System.out.println("error");
            System.exit(0);
        }
        outputStream.close();

        /**
         * reading data from a text file
         */
        Scanner inputStream=null;
        try
        {
            inputStream=new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error");
            System.exit(0);
        }
        while(inputStream.hasNextLine())
        {
            String line=inputStream.nextLine();
            System.out.println(line);
        }
        inputStream.close();

    } 
}
