/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 3(ii)
*/

import java.util.Scanner;

public class ShippingPackage {
    public static void main(String args[]){

        Scanner i = new Scanner(System.in);

        double weight;

        System.out.print("Enter the weight of the package in pounds: ");
        weight = i.nextDouble();

        if(weight>0&&weight<=2){
            System.out.println("Your shipping cost is 2.5 pound.");
        }
        else if(weight>2&&weight<=4){
            System.out.println("Your shipping cost is 4.5 pound.");
        }
        else if(weight>4&&weight<=10){
            System.out.println("Your shipping cost is 7.5 pound.");
        }
        else if(weight>10&&weight<=20){
            System.out.println("Your shipping cost is 10.5 pound.");
        }
        else{
            System.out.println("The package cannot be shipped.");
        }

        i.close();



    }

    
}
