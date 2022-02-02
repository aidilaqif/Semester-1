import java.text.NumberFormat;
import java.util.Scanner;
public class calcTotalMarks {
    public static void main(String args[]){
        //creating scanner
        Scanner input = new Scanner(System.in);
        //rounding of to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        //declaring variables data type
        String name;
        double quiz1,quiz2,quiz3,quizAve,assignment1,assignment2,assignmentAve,midTerm,finalExam,finalMark;
        char grade,choice;
        //loop for the program
        do{
            name = readName(input);//calling readName method
            quiz1 = readQuiz1(input);//calling readQuiz1 method
            quiz2 = readQuiz2(input);//calling readQuiz2 method
            quiz3 = readQuiz3(input);//calling readQuiz3 method
            quizAve = calcQuizAve(quiz1, quiz2, quiz3,nf);//calling calcQuizAve method
            assignment1 = readAssignment1(input);//calling readAssignment1 method
            assignment2 = readAssignment2(input);//calling readAssignment2 method
            assignmentAve = calcAssignmentAve(assignment1, assignment2, nf);//calling calcAssignmentAve method
            midTerm = readMidTerm(input);//calling readMidTerm method
            finalExam = readFinalExam(input);//calling readFinalExam method
            finalMark = caclFinalMark(quizAve, assignmentAve, midTerm, finalExam);//calling calcFinalMark method
            grade = setGrade(finalMark);//calling finalMark method
            displayResults(name, finalMark, grade,nf);//calling displayResults method
            choice=repeat(input);//calling repeat method
        }while(choice=='y');//condition for loop 
        input.close();

    }
    //method to read name
    public static String readName(Scanner input){
        System.out.print("Enter student's name: ");
        String name = input.next();
        return name;
    }
    //method to read Quiz1 mark 
    public static double readQuiz1(Scanner input){
        System.out.print("Enter mark for Quiz1: ");
        double quiz1 = input.nextDouble();
        return quiz1;
    }
    //method to read Quiz2 mark
    public static double readQuiz2(Scanner input){
        System.out.print("Enter mark for Quiz2: ");
        double quiz2 = input.nextDouble();
        return quiz2;
    }
    //method to read Quiz3 mark
    public static double readQuiz3(Scanner input){
        System.out.print("Enter mark for Quiz3: ");
        double quiz3 = input.nextDouble();
        return quiz3;
    }
    //method to calculate Quizzes Average mark
    public static double calcQuizAve(double quiz1,double quiz2,double quiz3,NumberFormat nf){
        double quizAve = (quiz1 + quiz2 + quiz3)/3;
        System.out.println("Quizzes average is: "+nf.format(quizAve));
        return quizAve;
    }
    //method to read Assignment1 mark
    public static double readAssignment1(Scanner input){
        System.out.print("Enter mark for Assigment1: ");
        double assignment1 = input.nextDouble();
        return assignment1;
    }
    //method to read Assignment2 mark
    public static double readAssignment2(Scanner input){
        System.out.print("Enter mark for Assigment2: ");
        double assignment2 = input.nextDouble();
        return assignment2;
    }
    //method to calculate Assignments Average mark
    public static double calcAssignmentAve(double assignment1,double assignment2,NumberFormat nf){
        double assignmentAve = (assignment1+assignment2)/2;
        System.out.println("Assignment average is: "+nf.format(assignmentAve));
        return assignmentAve;
    }
    //method to read Mid Term mark
    public static double readMidTerm(Scanner input){
        System.out.print("Enter Mid-Term Exam mark: ");
        double midTerm = input.nextDouble();
        return midTerm;
    }
    //method to read Final Exam mark
    public static double readFinalExam(Scanner input){
        System.out.print("Enter Final Exam mark: ");
        double finalExam = input.nextDouble();
        return finalExam;
    }
    //method to calculate Final Mark
    public static double caclFinalMark(double quizAve,double assignmentAve,double midTerm,double finalExam){
        double finalMark = (quizAve/15)*15 + (assignmentAve/25)*25 + (midTerm/50)*20 + (finalExam/80)*40;
        return finalMark;
    }
    //method to determine grade based on Final Mark
    public static char setGrade (double finalMark){
        char grade=0;
            if (finalMark>=80 && finalMark<=100){
                grade = 'A';
            }
            else if(finalMark>=70 && finalMark<=79){
                grade = 'B';
            }
            else if(finalMark>=55 && finalMark<=69){
                grade = 'C';
            }
            else if(finalMark>=45 && finalMark<=54){
                grade = 'D';
            }
            else {
                grade ='F';
            }
        return grade;
    }
    //method to display name,final mark and grade
    public static void displayResults(String name,double finalMark,char grade,NumberFormat nf){
        System.out.println(name+", your final mark for SSK3100 is "+nf.format(finalMark)+" and grade "+grade+".");
    }
    //method to read choice for the looping
    public static char repeat(Scanner input){
        char choice=0;
        System.out.print("More grade computation? y/n: ");
        choice = input.next().charAt(0);
        return choice;
    }
}
