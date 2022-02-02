/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC100
LECTURE GROUP : 9
TASK TITLE : LAB 2 
QUESTION : 5
*/
import java.util.Scanner;
public class cost {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double distance,miles_per_gallon,price_per_gallon,cost;

        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        miles_per_gallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        price_per_gallon = input.nextDouble();

        cost = distance / miles_per_gallon * price_per_gallon;
        System.out.print("\nThe cost of driving is $" + cost);

        input.close();
    }
}
