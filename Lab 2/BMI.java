/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC100
LECTURE GROUP : 9
TASK TITLE : LAB 2 
QUESTION : 3
*/
import java.util.Scanner;
public class BMI {
    public static void main(String args[]) {
        
        //declaring variables data type
        double height,weight,BMI;
        
        Scanner sc = new Scanner(System.in);
        
        //request and read user input
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        //request and read user input
        System.out.print("Enter your height in m : ");
        height = sc.nextDouble();
        System.out.print("Enter your weight in kg : ");
        weight = sc.nextDouble();

        //calculate and display
        BMI = weight/(height*height);
        System.out.println( name +",your BMI is " + BMI + ".");
        sc.close();
        
    }
    
}
