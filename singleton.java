public final class singleton {
    //field must be declared volatile so that double check lock would work
    private static volatile singleton instance; //can be accessed only by getInstance()
    public String value;

    private singleton(String value){
        // try{
        //     Thread.sleep(1000);
        // }catch(InterruptedException ex){
        //     ex.printStackTrace();
        // }
        this.value=value; //slow initialization 
    }
    public static singleton getInstance(String value){
        /**
         * double-checked locking (DCL) to prevent race condition between multiple threads
         */
        singleton result=instance;
        if(result!=null){
            return result;
        }
        //thread safe singleton, so multiple threads cant access it simultaneously
        synchronized(singleton.class){
            //synchronized (singleton.class){  // snchronized block to remove overhead 
            if(instance==null){
                instance=new singleton(value);
            }
            return instance;
        }
    }

    static class ThreadFoo implements Runnable{
        @Override
        public void run(){
            singleton s=singleton.getInstance("foo");
            System.out.println(s.value);
        }
    }
    static class ThreadBar implements Runnable{

        @Override
        public void run() {
            singleton single=singleton.getInstance("BAR");
            System.out.println(single.value);     
        }     
    }
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        singleton single=singleton.getInstance("FOO");
        singleton anothersingle=singleton.getInstance("BAR");
        System.out.println(single.value); //null
        System.out.println(anothersingle.value); //null

        Thread threadfoo=new Thread(new ThreadFoo());
        Thread threadBar=new Thread(new ThreadBar());
        threadfoo.start();
        threadBar.start();
    }
    
}
