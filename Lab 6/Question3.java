/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 3
*/
import java.util.Scanner;
import java.text.NumberFormat;
public class Question3 {
    public static void main(String args[]){
        //set maximum decimal places to 2
        NumberFormat nf2=NumberFormat.getInstance();
        nf2.setMaximumFractionDigits(2);
        //creating scanner 
        Scanner i = new Scanner(System.in);
        //prompt user
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = i.nextDouble();
        //declaring variables
        double monthlyCommit=savingAmount;
        //formula for newSavingAmount
        double newSavingAmount = savingAmount*(1+0.00417);
        //loop statement
        for(int months=1;months<=5;months++){
            savingAmount=newSavingAmount;
            newSavingAmount=(monthlyCommit+savingAmount)*(1+0.00417);
        }
        //displaying output
        System.out.println("After the six month, the account value is RM"+nf2.format(newSavingAmount));

        i.close();
    }
    
}
