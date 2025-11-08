package projects;
import javax.swing.*; 
import java.util.*;
public class RollerCoaster 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Welcome to The Stupid Crazy RollerCoaster Ride!!!");
        
        int height= Integer.parseInt(JOptionPane.showInputDialog("Enter your Height"));
        if(height >=120)
        {
        System.out.println("You are eligible to go on the Ride");
            
                int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
                int prices = 0;
                
                
                if (age<12)
                {
                    prices= 5;
                    System.out.println("You have to pay $5");
                }else  if ( age>=12 && age<18)
                {
                    prices= 7;
                    System.out.println("You have to pay $7");
                }
                else if (age >=18 && age<45 )
                {
                    prices= 12;
                    System.out.println("You have to pay $12");
                }else if (age>=45 && age<=55)
                {
                    prices= 0;
                    System.out.println("Your Ride is free");
                }
                
                
                int photoprice=0;
                var yesOrNo = JOptionPane.showConfirmDialog(null, "Would you like Photos?");
                        if (yesOrNo == 0) 
                            {
                            photoprice=3;
                            JOptionPane.showMessageDialog(null, "You can pick your photos after the ride, It's $3");
                            }
                        if (yesOrNo == 1) 
                            {
                            photoprice=0;
                            JOptionPane.showMessageDialog(null, "Aww no Photos, ok Then...");
                            }
                
            int bill= prices + photoprice;
            JOptionPane.showMessageDialog(null, "Your Bill is $" + bill);
                
                
        }else
        {
            System.out.println("Sorry, You aren't eligible to go on the Ride");
        }
        
        
    }
    
}
