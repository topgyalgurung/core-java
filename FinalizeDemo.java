
public class FinalizeDemo {
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object Finalized...");
    }

    public static void main(String[] args) {
        FinalizeDemo fdRef=new FinalizeDemo();
        fdRef=null;
        System.gc();
        
    }
}
