
package calendar;
/*
@ Eden Kendo-Pindi
 */
import java.util.Scanner;

public class Calendar {

   
    public static void main(String[] args) {
      Scanner info = new Scanner(System.in);
      // Asks for a year
    System.out.print("Enter a year : ");
    int year = info.nextInt();
    // Asks for a month between 1-12
    System.out.print("Enter a month (between 1-12) : ");
    int month = info.nextInt();
    printCalendar(year,month);
    }
     public static void printCalendar(int year, int month) {
   
    printMonth(year, month);
     }
    public static void printMonth(int year, int month) {
        // Prints the month and year
           System.out.println("         " + calcDays2(month) // Can switch between calcDays1 and calcDays2
      + " " + year);
           System.out.println("---------------------------------");
            int daysInMonth = chooseMonth(year, month);
            // [rints number of days in a month
            System.out.println("Number of days in month :" + daysInMonth);
    }
     public static String calcDays1(int month) {
         // Chooses month depending on month value
     String monthName = "";
    switch (month) {
      case 1:
          monthName = "January"; break;
      case 2:
          monthName = "February"; break;
      case 3:
          monthName = "March"; break;
      case 4:
          monthName = "April"; break;
      case 5:
          monthName = "May"; break;
      case 6: 
          monthName = "June"; break;
      case 7: 
          monthName = "July"; break;
      case 8: 
          monthName = "August"; break;
      case 9:
          monthName = "September"; break;
      case 10:
          monthName = "October"; break;
      case 11:
          monthName = "November"; break;
      case 12:
          monthName = "December";
          
}
    return monthName;
}
        public static String calcDays2(int month) {
            // Same as in calcDays1 but with if else
            String monthName2 = "";
            if (month == 1)
                monthName2 = "January";
            else if (month == 2)
                monthName2 = "February";
             else if (month == 3)
                monthName2 = "March";
             else  if (month == 4)
                monthName2 = "April";
               else if (month == 5)
                monthName2 = "May";
              else if (month == 6)
                monthName2 = "June";
                 else if (month == 7)
                monthName2 = "July";
                 else if (month == 8)
                monthName2 = "August";
                   else if (month == 9)
                monthName2 = "September";
                    else if (month == 10)
                monthName2 = "October";
                     else if (month == 11)
                monthName2 = "November";
                     else if (month == 12)
                monthName2 = "December";
                       
  return monthName2;      
}


                

      public static int chooseMonth(int year, int month) {
          // if month is equal to either of these numbers,it'll return 31
    if (month == 1 || month == 3 || month == 5 || month == 7 ||
      month == 8 || month == 10 || month == 12)
      return 31;    
          // if month is equal to either of these numbers, it'll return 30
    if (month == 4 || month == 6 || month == 9 || month == 11)
       return 30;
    // if the month is 2 and isLeapYear is true/false it will return 29 or 28
      if (month == 2) return isLeapYear(year) ? 29 : 28;
       
           
      return 0;
      }
     
       public static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}
      
      


      
      


          
       
      