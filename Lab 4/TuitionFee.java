/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 2
*/
import java.util.Scanner;

public class TuitionFee {
    public static void main(String args[]){

        Scanner i = new Scanner(System.in);
        
        System.out.println("                       Tuition Fee");
        System.out.println(" _______________________________________________________");
        System.out.println("|STANDARD                   |Tuition Fee                |");
        System.out.println(" _______________________________________________________");
        System.out.println("|S4/S5                      |RM100                      |");
        System.out.println(" _______________________________________________________");
        System.out.println("|S6                         |RM130                      |");
        System.out.println(" _______________________________________________________");
        System.out.println("\n _______________________________________________________");
        System.out.println("|Standard Subjects*    |F1/F2/F3         |F4/F5         |");
        System.out.println(" _______________________________________________________");
        System.out.println("|1 Subject             |RM80 per month  |RM90 per month |");
        System.out.println("_______________________________________________________");
        System.out.println("|2 Subject             |RM150 per month |RM170 per month|");
        System.out.println("_______________________________________________________");
        System.out.println("|3 Subject             |RM210 per month |RM240 per month|");
        System.out.println("_______________________________________________________");

        System.out.print("Enter the standard/form of the student(S4/S5/S6/F1/F2/F3/F4/F5) : ");
        String student = i.nextLine();
        
        
        if (student.equals("S4")||student.equals("S5")){
            System.out.println("Tuition Fee is RM100");
        }
        else if(student.equals("S6")){
            System.out.println("Tuition Fee is RM130");
        }
        else if(student.equals("F1")||student.equals("F2")||student.equals("F3")){
            System.out.print("Number of Standard Subjects taken : ");
            int subject = i.nextInt();
            if(subject==1)
                System.out.println("Tuition Fee is RM80 per month");
            
            else if(subject==2){
                System.out.println("Tuition Fee is RM150 per month");
            }
            else {
                System.out.println("Tuition Fee is RM210 per month");
            }

        }
        else if(student.equals("F4")||student.equals("F5")){
            System.out.print("Number of Standard Subjects taken : ");
            int subject = i.nextInt();
            if(subject==1){
                System.out.println("Tuition Fee is RM90 per month");
            }
            else if(subject==2){
                System.out.println("Tuition Fee is RM170 per month");
            }
            else {
                System.out.println("Tuition Fee is RM240 per month");
            }
        }
        i.close();
    }

}