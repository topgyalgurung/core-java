import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Java deserialize vulnerability where we serialize an object from serializable class SerializeDemo
 * easily maniput string value the output when reading file "f.txt" // "file.ser" preferreed 
 * if app accepts serialized object, easy to temper with values. 
 * 
 * Serializable is a marker interface.
 */
public class SerializeDemo implements Serializable {
    private static final long serialVersionUID=1L; // to verify sender and receiver 
    private String value;
    private String sideEffect;

    /**
     * everytime object of class SerializeDemo gets deserialized, Runnable object command is executed
     */
    private Runnable command;

    public SerializeDemo(){
        this("Empty");
    }
    public SerializeDemo(String value){
        this.value=value;
        this.sideEffect=java.time.LocalTime.now().toString();
    }

    public SerializeDemo(Command command){
        this.command=command;
    }
    /**
     * writeObject(Object obj) // for serializing object 
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override   // override default readObject, deserializing object
    private final void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        command.run();
        
    }
    public static void main(String[] args) {
        try{
        /**
         * Serialization
         */
        SerializeDemo valObj1=new SerializeDemo();
        // read ValueObject.ser file contains serialized object with hex-editor
        FileOutputStream fileOut=new FileOutputStream("f.txt"); 
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(valObj1);
        out.flush(); //flushes current output stream 
        out.close();
        fileOut.close();
        }catch(Exception e){System.out.println(e);}

        /**
         * Deserialization
         */
    try{
        ObjectInputStream in =new ObjectInputStream(new FileInputStream("f.txt"));
        SerializeDemo s=(SerializeDemo)in.readObject();
        System.out.println(s.value+""+s.sideEffect);
        in.close();
    }catch(Exception e){System.out.println(e);}
    }
}
