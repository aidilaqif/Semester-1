/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC100
LECTURE GROUP : 9
TASK TITLE : LAB 2 
QUESTION : 1
*/
public class minutes{
    public static void main(String args[]){

        //declaring variables data type
        int minutes,hours;

        //assign values to variable
        minutes = 197;

        //calculate output
        hours= minutes/60;
        minutes = minutes%60;

        //displaying output
        System.out.println( hours + "hours and " +  minutes + "minutes.");
    }
}