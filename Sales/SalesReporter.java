package Sales;
import java.util.Scanner;

import Sales.SalesAssociate;
import java.util.Scanner;
/**
 * program to generate sales report
 */

public class SalesReporter 
{
    private double highestSales;
    private double averageSales;
    private SalesAssociate[] team;

    private int numOfAssociates;
    /**
     * read number of sales associates and data for each one 
     */
    public void getData()
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter number of sales associates: ");
        numOfAssociates=keyboard.nextInt();
        team=new SalesAssociate[numOfAssociates+1];

        for(int i=1;i<=numOfAssociates;i++)
        {
            team[i]=new SalesAssociate();
            System.out.println("Enter data for associate "+i);
            team[i].readInput();
            System.out.println();
        }

    }
    /**
     * computes average and highest sales figures
     */
    public void computeStats()
    {
        double nextSales=team[1].getSales();
        highestSales=nextSales;
        double sum=nextSales;
        for(int i=2;i<=numOfAssociates;i++){
            nextSales=team[i].getSales();
            sum=sum+nextSales;
            if(nextSales>highestSales)
                highestSales=nextSales;
        }
        averageSales=sum/numOfAssociates;
    }
    /**
     * display sales report on the screen
     */
    public void displayResults()
    {
        System.out.println("Average sales report is $ "+averageSales);
        System.out.println("The highest sales figure is $"+highestSales);
        
    }
}
