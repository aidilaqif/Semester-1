/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 4
*/
import java.util.Scanner;
public class Question4 {
    public static void main(String args[]){
        //creating scanner
        Scanner i = new Scanner(System.in);
        //declaring variables
        char choice,visitorCategory,foreignerCategory,option;
        //initialize value
        double ticketCharge=0,totalCharge=0;
        int visitorNum=1,ticketQuantity;
        //do while statement
        do{
            
            System.out.println("\n******VISITOR "+visitorNum+"*******");
            //prompt user
            System.out.print("Enter your nationality (M/F) : ");
            char nationality = i.next().charAt(0);
           //do while statement
            do {//switch statement
                switch (nationality){
                case 'M':
                    System.out.print("Choose category of visitor (A - Adult, C - Children, S - senior):");
                    visitorCategory = i.next().charAt(0);
                    System.out.print("Number of tickets:");
                    ticketQuantity=i.nextInt();
                    if(visitorCategory=='A'){
                        ticketCharge = ticketQuantity*43;
                        System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);    
                        totalCharge = totalCharge+ticketCharge;
                    }
                    else if(visitorCategory=='C'){
                        ticketCharge = ticketQuantity*16;
                        System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);    
                        totalCharge = totalCharge+ticketCharge;
                    }
                    else{
                        ticketCharge = ticketQuantity*21;
                        System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);   
                        totalCharge = totalCharge+ticketCharge; 
                    }
                    break;
                case 'F':
                    System.out.print("From which part? (I - Kad/Working Permit/Dependant Pass, E - Asean, O - Others):");
                    foreignerCategory = i.next().charAt(0);
                    System.out.print("Choose category of visitor (A - Adult, C - Children, S - senior):");
                    visitorCategory = i.next().charAt(0);
                    System.out.print("Number of tickets:");
                    ticketQuantity=i.nextInt();

                    switch (foreignerCategory){
                        case 'I':
                            if(visitorCategory=='A'){
                                ticketCharge = ticketQuantity*50;
                                System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);  
                                totalCharge = totalCharge+ticketCharge;  
                            }
                            else if(visitorCategory=='C'){
                                ticketCharge = ticketQuantity*25;
                                System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);    
                                totalCharge = totalCharge+ticketCharge;
                            }
                            else{
                                ticketCharge = ticketQuantity*50;
                                System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);   
                                totalCharge = totalCharge+ticketCharge; 
                            }
                        break;
                        case 'E':
                            if(visitorCategory=='A'){
                                ticketCharge = ticketQuantity*61;
                                System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge); 
                                totalCharge = totalCharge+ticketCharge;   
                            }
                             else if(visitorCategory=='C'){
                                ticketCharge = ticketQuantity*33;
                                System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);  
                                totalCharge = totalCharge+ticketCharge;  
                            }
                            else{
                            ticketCharge = ticketQuantity*61;
                            System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);    
                            totalCharge = totalCharge+ticketCharge;
                            }
                        break;
                        case 'O':
                        if(visitorCategory=='A'){
                            ticketCharge = ticketQuantity*82;
                            System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);  
                            totalCharge = totalCharge+ticketCharge;  
                            }
                        else if(visitorCategory=='C'){
                            ticketCharge = ticketQuantity*43;
                            System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge); 
                            totalCharge = totalCharge+ticketCharge;   
                            }
                        else{
                            ticketCharge = ticketQuantity*82;
                            System.out.println("Visitor Type "+visitorCategory+" Charge "+ticketCharge);  
                            totalCharge = totalCharge+ticketCharge;  
                            }
                        break;
                    }
                    break;
                    
                    
            }
            //prompt user
            System.out.print("Buy other ticket (Y/N)?: ");
            option = i.next().charAt(0);
            
        }while(option == 'Y');

        //display output
        System.out.println("The total payment for Visitor "+visitorNum+" is RM"+totalCharge);
            //prompt user
            System.out.print("Enter another visitor (Y/N)?: ");
            choice = i.next().charAt(0);
            //formula
            visitorNum=visitorNum+1;
            totalCharge=0;
        }while(choice=='Y');
        i.close();
    }
}
