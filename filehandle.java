import java.io.BufferedWriter;
import java.io.FileInputStream;

public class filehandle {
    public static void main(String[] args) {
        File filename=new File("myfile.txt");
        if(!filename.exists()){
            System.out.println("this file does not exist");
            try{
                fileName.createNewFile();
                FileWriter fileWrite=new FileWriter(filename);
                BufferedWriter bw=new BufferedWriter(fileWrite);
                bw.write("this is my first file");
                bufferedWriter.close()
            }catch(IOException e){
                System.out.println("error");
            }
        }
        else{
            System.out.println("this file already exists");
        }
        try{
            byte []buffer=new byte[100];
            FileInputStream inputStream=new FileInputStream(filename);
            int readlines=-1;
            while((readlines=inputStream.read(buffer))!=-1){
                System.out.println(new String(buffer,0,readlines));
            }
            inputStream.close();
        }catch(IOException e){
            System.out.println("error");
        }

    }
    
}
