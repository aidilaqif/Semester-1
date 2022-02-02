/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 5 
QUESTION : 1
*/
import java.util.Scanner;
import java.util.regex.Pattern;
public class question1{

    public static void main(String[] args){

        Scanner i = new Scanner(System.in);

        //prompt user to enter string
        System.out.print("Enter string : ");
        String st=i.next();

        //if else condition
        if(Pattern.matches("[0-9]+", st))
            System.out.println("String contains digit only");
        else if(Pattern.matches("[a-zA-Z]+", st))
            System.out.println("String contains letter only");
        else
            System.out.println("String is mixed");
        i.close();
    }
   
}