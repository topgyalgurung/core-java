public class arrayEqual {
    /**
     * Array equality
     */
    public static boolean equals(int []a,int []b)
    {
        boolean elementMatch=true;

        if(a.length!=b.length)
            elementMatch=false;
        else
        {
            int i=0;
            while(elementMatch &&(i<a.length))
            {
                if(a[i]!=b[i])
                    elementMatch=false;
                i++;
            }
        }
        return elementMatch;
    }
    /**
     * method that returns array
     */
    
    
}
