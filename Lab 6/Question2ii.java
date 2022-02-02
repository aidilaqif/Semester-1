/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 2ii
*/
import java.text.NumberFormat;
import java.util.Scanner;
public class Question2ii {
    public static void main(String args[]) {
        //set maximum decimal places to 3
        NumberFormat nf3=NumberFormat.getInstance();
        nf3.setMaximumFractionDigits(3);
        //set maximum decimal places to 2
        NumberFormat nf2=NumberFormat.getInstance();
        nf2.setMaximumFractionDigits(2);
        //creating scanner
        Scanner i = new Scanner(System.in); 
        //prompt user
        System.out.print("Loan Amount: ");  
        double loan = i.nextDouble();
        //prompt user
        System.out.print("Number of Years: ");
        int loanDuration= i.nextInt();
        i.close();
        //displaying title
        System.out.print("Interest Rate");
        System.out.print("\tMonthly Payment");
        System.out.print("\tTotal Payment");
        double interestRate;
       //looping display
        for(interestRate=5.000;interestRate<=10.000;interestRate=interestRate+0.250){
            System.out.print("\n"+nf3.format(interestRate)+"%");
            double calc1 = loan*((interestRate/100)/12);
            double calc2 = 1-(Math.pow(1+((interestRate/100)/12), (-12*loanDuration)));
            double monthly = calc1/calc2;
            System.out.print("\t\t"+nf2.format(monthly));
            double totalPayment = monthly*12*loanDuration;
            System.out.print("\t\t"+nf2.format(totalPayment));
        }
           
        
    }
    
}
