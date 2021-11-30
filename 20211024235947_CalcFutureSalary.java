
package calcfuturesalary;
import java.util.Scanner;
/**
 * Eden Kendo-Pindi
 */
public class CalcFutureSalary {

   
    public static void main (String[] args) {
    Scanner info = new Scanner(System.in);
    System.out.print("Please enter your current salary : ");
   double currentSalary = info.nextDouble();
   double futureSalary1 = currentSalary;
    double futureSalary2 = 0;
     double futureSalary3 = 0;
    double salaryIncrease1 = 0;
    double salaryIncrease2 = 0;
    double salaryIncrease3 = 0;
    
    System.out.print("Please enter number of years : ");
   double years = info.nextDouble();
   
   if (years < 3)  {
       salaryIncrease1 = 0.03;
   double a = currentSalary * salaryIncrease1;
   
   while (years < 3) {
   futureSalary1 = currentSalary + a;
   years++;
   }
     if (years < 3)
       System.out.print("Future salary : " + futureSalary1); 
   }
   if (years >= 3 & years < 10) {
       salaryIncrease2 = 0.05;
   double b = futureSalary1 * salaryIncrease2;
   
   while (years >= 3 & years < 10)  {
       futureSalary2 = futureSalary1 + b;
   years++;
   }
   
        
    }
   }
    }



    
    
            
       
        

    
            
    
    
    
    

