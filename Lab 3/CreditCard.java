/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC100
LECTURE GROUP : 9
TASK TITLE : LAB 3 
QUESTION : 2
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class CreditCard {
    public static void main(String args[]) {

        //declaring data type
        double NetBalance,PaymentAmount,NumberOfDays,DayOfPayment,MonthlyInterestRate,InterestCharge;

        //declare scanner for input
        Scanner i = new Scanner(System.in);

        //formating text to 2 decimal places max
        NumberFormat nf= NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);

        //display please enter text
        System.out.println("Please enter:");

        //promt and read users input
        System.out.print("Previous Net Balance: ");
        NetBalance = i.nextDouble();

        System.out.print("Payment amount: ");
        PaymentAmount = i.nextDouble();

        System.out.print("Number of Days in the billing cycle: ");
        NumberOfDays = i.nextDouble();

        System.out.print("The day of the payment was made: ");
        DayOfPayment = i.nextDouble();

        System.out.print("Monthly interest rate: ");
        MonthlyInterestRate = i.nextDouble();

        //calculation for the interest charge
        InterestCharge = (NetBalance*NumberOfDays-PaymentAmount*DayOfPayment)/NumberOfDays*MonthlyInterestRate/100;

        //displaying the interest charge
        System.out.println("\nThe interest charge is "+ nf.format(InterestCharge));

        //closing the scanner
        i.close();
    }
}
