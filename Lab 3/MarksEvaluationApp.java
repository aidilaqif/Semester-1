/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC100
LECTURE GROUP : 9
TASK TITLE : LAB 3 
QUESTION : 1
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class MarksEvaluationApp{
    public static void main(String args[]) {

        //declaring input variables    
        double FirstTest,SecondTest,Assignment1,Assignment2,Assignment3,FinalExam;

        //declaring scanner for input
        Scanner i = new Scanner(System.in);

        //formating text to 2 decimal places max
        NumberFormat nf= NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);

        //displaying title fo the application
        System.out.println("\t\t\t\t\t  COMPUTER PROGRAMMING I");
        System.out.println("\t\t\t\t\t\t(CSC3100)");
        System.out.println("\t*********************************MARKS EVALUATION APPLICATION*********************************");
        System.out.println("\r\nPLEASE ENTER MARKS:-");

         //declaring data type
         double Test1Percentage,Test2Percentage,SubTotal,SubTotalPercentage,FinalExamPercentage,Total;

        //prompt and read user input
        System.out.print("\r\n\t FIRST TEST: ");
        FirstTest= i.nextDouble();

        System.out.print("\tSECOND TEST: ");
        SecondTest= i.nextDouble();

        System.out.print("\r\n      ASSIGNMENT 1: ");
        Assignment1= i.nextDouble();

        System.out.print("      ASSIGNMENT 2: ");
        Assignment2= i.nextDouble();

        System.out.print("      ASSIGNMENT 3: ");
        Assignment3= i.nextDouble();
        
        System.out.print("\r\nFINAL EXAMINATION: ");
        FinalExam= i.nextDouble();

        //calculation for percentage
        Test1Percentage = FirstTest/50*0.2*100;
        Test2Percentage = SecondTest/50*0.2*100;
        SubTotal = (Assignment1+Assignment2+Assignment3);
        SubTotalPercentage = SubTotal/90*0.3*100;
        FinalExamPercentage = FinalExam/100*0.3*100;
        Total = Test1Percentage+Test2Percentage+SubTotalPercentage+FinalExamPercentage;

        //displaying calculated marks
        System.out.println("\t\t\t\t\t      CALCULATED MARKS");
        System.out.println("TEST1\t\tTEST2\t\tAS1     AS2     AS3     SUB-TOTAL\t\tFINAL EXAM\t\tTOTAL");
        System.out.println("\r\n_____________________________________________________________________________________________________________");
        System.out.println(FirstTest+" ("+nf.format(Test1Percentage)+"%)  "+SecondTest+" ("+nf.format(Test2Percentage)+"%)    "+Assignment1+"     "+Assignment2+"    "+Assignment3+"    "+SubTotal+"("+nf.format(SubTotalPercentage)+"%)"+"             "+FinalExam+"("+nf.format(FinalExamPercentage)+"%)"+"            "+nf.format(Total)+"%");
      
        //closing scanner
        i.close();
        




        
    }

}
    
