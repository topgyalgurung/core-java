/**
 * Define an annotation type for an enhancement request with elements id, synopsis, engineer, and date. 
 * Specify the default value as unassigned for engineer and unknown for date.
 *
 */

public class annotation {
    public interface RequestForEnhancement{
        int id();
        String synopsis();
        String engineer() default "[unassigned]";
        String date() default "[unknown]";
    }
    
}
