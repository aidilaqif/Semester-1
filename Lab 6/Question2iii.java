/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 2iii
*/
import java.util.Scanner;
public class Question2iii {
    public static void main(String args[]){
        //creating scanner class
        Scanner i = new Scanner(System.in);
        //prompt user
        System.out.print("Enter numbers: ");
        int num =i.nextInt();
        //initialize value
        int max=num,countMax=0;
        //do while statement
        do{
            if(num>max){
                max = num;
                countMax = 1;
            }
            else if(num<max){
                max = max;
            }
            else{
                max= max;
                countMax = countMax+1;
            }
            //prompt user
            num = i.nextInt();
        }while(num!=0);
        //display output
        System.out.println("The largest number is "+max);
        System.out.println("The occurence count of the largest number is "+countMax);

       
        i.close();
        
    }
}
