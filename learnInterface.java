
public class learnInterface implements Comparable{

        public interface Nameable
    {
        public void setName(String newName);
        public String getName();
        
    }
    public interface Callable extends Nameable
    {
        public void getAge();
    }
    /** 
    @Override
        public int compareTo(Object o)
        {
            if((o!=null)&&(o instanceof Fruit ))
            {
                Fruit otherFruit=(Fruit) o;
                if(fruitName.lenght()>otherFruit.fruitName.length())
                return 1;
            }
            else if (fruitName.length()<otherFruit.fruitName.length())
                return -1;
            else
                return 0;
        }
            return -1;
            
        }
        */
    public static void main(String[] args) {


        
    }

    
}
