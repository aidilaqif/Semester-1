/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC100
LECTURE GROUP : 9
TASK TITLE : LAB 2 
QUESTION : 4
*/
import java.util.Scanner;
public class grades {
    public static void main(String args[]){
        
        //declaring variables data type
        double assignment1,assignment2,mid_exam,final_exam;
        int quiz1,quiz2,quiz_average;
        double average_assignment,percent_quizes,percent_assignments,percent_mid_exam,percent_final_exam,final_mark;
        Scanner input = new Scanner(System.in);
        
        //request and read user input for Quiz1
        System.out.print("Enter mark for Quiz1: ");
        quiz1 = input.nextInt();
        
        //request and read user input for Quiz2
        System.out.print("Enter mark for Quiz2: ");
        quiz2 = input.nextInt();

        //calculating average mark for Quiz1 and Quiz2
        quiz_average = (quiz1 + quiz2)/2;

        //displaying average mark for Quiz1 and Quiz2
        System.out.print("Your Quizzes average is: " + quiz_average);

        //request and read user input for Assignment1
        System.out.print("\n\nEnter mark for Assignment1: ");
        assignment1 = input.nextDouble();

        //request and read user input for Assignment2
        System.out.print("Enter mark for Assignment2: ");
        assignment2 = input.nextDouble();

        //calculating average mark for assignment1 and assignment2
        average_assignment = (assignment1 + assignment2)/2;

        //displaying average mark for assignment1 and assignment2
        System.out.print("Your Assignment average is: " + average_assignment);

        //request and read user input for Mid-Term Exam Mark
        System.out.print("\n\nEnter your Mid-Term Exam mark: ");
        mid_exam = input.nextInt();

        //request and read user input for Final Exam Mark
        System.out.print("Enter your Final Exam mark: ");
        final_exam = input.nextInt();

        //calculation for the percentages
        percent_quizes = (quiz_average) * 0.15;
        percent_assignments = (average_assignment) * 0.25;
        percent_mid_exam = mid_exam * 0.2;
        percent_final_exam = final_exam * 0.4;

        //calculation for final mark
        final_mark = percent_quizes + percent_assignments + percent_mid_exam + percent_final_exam;
        
        //displaying final mark and final percentage for each section
        System.out.print("\n\nYour final mark for SSK3100 is " + final_mark);
        System.out.print("\n(Quiz: " + percent_quizes + " Assignment: " + percent_assignments + " Mid-term: " + percent_mid_exam + " Final: " + percent_final_exam + ")");

        input.close();

    }
    
}
