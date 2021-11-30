
package score;
import java.util.Scanner;
/**
 *
 * Eden Kendo-Pindi
 */
public class Score {

   
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
            System.out.println("Please enter your score : ");
        int score = info.nextInt();
        String print = "";
       if (score >= 90.0)
           print = "A";
       else if (score >= 80.0)
           print = "B";
        else if (score >= 70.0)
             print = "C";
        else if (score >= 60.0)
           print = "D";
        else if (score < 60.0 & score >= 0.0)
           print = "F";
       printMessage2(print);
    }
    public static void printMessage1(String print) {
        if (print == "A")
            System.out.println("Excellent!");
        if (print == "B" || print == "C")
            System.out.println("Well done!");
        if (print == "D")
            System.out.println("Passed!");
        if (print == "F")
            System.out.println("Better try again!");
    }
    public static void printMessage2(String print) {
        String gradeText = "";
        switch (print) {
            case "A": gradeText = "Excellent"; break;
            case "B": gradeText = "Well done!"; break;
            case "C" : gradeText = "Well done!"; break;
            case "D": gradeText = "Passed!"; break;
            case "F": gradeText = "Better try again!"; 
            
         
        }
        System.out.println(gradeText);
    }
    
}
