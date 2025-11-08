package projects;
import javax.swing.*;
/**
 *
 * @author tilly
 */
public class LeapYear {
    public static void main(String[] args) 
    {
        int year= Integer.parseInt(JOptionPane.showInputDialog("Enter any year"));
        
       if (year % 4==0) 
       {
           if(year%100==0)
           {
               if(year%400==0)
           {
               System.out.println("It is NOT a leap year");  
           }
           else
           {
               System.out.println("It is a leap year");
           }
           }
           else
           {
               System.out.println("It is a leap year");
           }
       }
       else 
       {
           System.out.println("It is NOT a leap year");
       }
               
        
        
        
        
    }
}
