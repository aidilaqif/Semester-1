/* NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 1
*/
import java.util.Scanner;
public class Question1{
    public static void main(String args[]){
        //creating scanner
        Scanner i = new Scanner(System.in);
        //declaring variables
        double product1=2.98,product2=4.50,product3=9.98,product4=4.49,product5=6.87;
        //displaying prices
        System.out.println("Retail prices: ");
        System.out.println("\tProduct 1 = RM"+product1);
        System.out.println("\tProduct 2 = RM"+product2);
        System.out.println("\tProduct 3 = RM"+product3);
        System.out.println("\tProduct 4 = RM"+product4);
        System.out.println("\tProduct 5 = RM"+product5);
        System.out.println("Enter \'0\' to stop the program");
        //declaring variables
        double totalSold;
        //prompt user
        System.out.print("Enter product number: ");
        int product = i.nextInt();
        //looping statement
        while (product!=0){
            //prompt user
            System.out.print("Enter quantity sold: ");
            int quantity = i.nextInt();
            //initialize value
            totalSold=0;
            //switch statement
            switch (product){
                case 1:
                    totalSold=totalSold+(quantity*product1);//formula for product 1
                break;
                case 2:
                    totalSold=totalSold+(quantity*product2);//formula for product 2    
                break;
                case 3:
                    totalSold=totalSold+(quantity*product3);//formula for product 3         
                break;
                case 4:
                    totalSold=totalSold+(quantity*product4);//formula for product 4             
                break;
                case 6:
                    totalSold=totalSold+(quantity*product5);//formula for product 5
                break;
            }
            //displaying output
            System.out.println("The total retail value of all product sold is RM"+totalSold);
            //prompt user
            System.out.print("Enter product number: ");
            product = i.nextInt();
            
        }
        
        
        i.close();

        

        

            }

        
            
        
        
        
    }
