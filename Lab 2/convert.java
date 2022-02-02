/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC100
LECTURE GROUP : 9
TASK TITLE : LAB 2 
QUESTION : 2
*/
public class convert{
    public static void main(String args[]) {

        //declaring variables and data type
        double height_inches,weights_pounds,height_cm,weights_kg;

        //assigning value to variables
        height_inches = 6;
        weights_pounds = 300;

        //converting variables to different unit
        height_cm = height_inches*2.54;
        weights_kg = weights_pounds/2.205;

        //displaying output
        System.out.println("Your height in inches is " + height_inches + "inches and your height in centimeter is " + height_cm + "cm.");
        System.out.println("Your weight in pounds is " + weights_pounds + "pounds and your weight in kilogram is " + weights_kg + "kg.");
       
        
        
    }
}