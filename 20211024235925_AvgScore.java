
package avgscore;
import java.util.Random;
import java.util.Scanner;
/*
@ Eden Kendo-Pindi
 */
public class AvgScore {

   
public static void main(String[] args) {
Scanner info = new Scanner(System.in);
Random rand = new Random();

        // Asks to enter a number
 System.out.print("Enter a number : ");
    int amount = info.nextInt();
System.out.println("---------------");
double sum = 0;
int max = 100;
int dnum = amount;
//Creates the amount numbers between 1-100 
System.out.println("Numbers :");
for (int a = 0; a < amount; a++){
int random = rand.nextInt(max) + 1;
// 
System.out.println(random);
//Removes number under 40       
if (random < 40)
 random = 0;
if (random < 40)
dnum--;
sum += random;
}
System.out.println("---------------");
System.out.println("Your average is: " + (sum/dnum));
     
    
        }
         }
    

    
    

    
