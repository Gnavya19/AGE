import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age {
    public static void main (String[]args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter your birth year (YYYY):");
        int year = Scanner.nextInt();
        System.out.print("Enter your birth month (MM):");
        int month = Scanner.nextInt();
        System.out.print("Enter your birth day (DD):");
        int day = Scanner.nextInt();
        LocalDate birthDate = LocalDate.of(year,month,day);
        LocalDate currentDate = LocalDate.now();
        if (birthDate.isAfter(currentDate)) {
            System.out.println("Invalid birth date! The date is in the future.");
        }  else {
            Period age = Period.between(birthDate,currentDate);
            System.out.println("You are " + age.getYears() + " years," + age.getMonths() + "months .");
        }
        Scanner.close();
    }
}

