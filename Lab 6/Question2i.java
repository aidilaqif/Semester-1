/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 2i
*/
import java.text.NumberFormat;
public class Question2i {
    public static void main(String args[]){

        //formating to 3 decimal places
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);

        //displaying title of the table
        System.out.print("Ping");
        System.out.print("\t    Square Meter");
        System.out.print("|");
        System.out.print("  Square meter");
        System.out.print("\t\tPing");

        //declaring varibles data type
        int ping,squareMeter=30;

        //loop to display and calc results
        for(ping=10;ping<=80;ping=ping+5){
            //display ping value
            System.out.print("\n"+ping);
            //calculation for converting ping to squaremeter
            double calcSquareMeter = ping*3.305;
            //display the calculated value for squaremeter
            System.out.print("\t\t" + nf.format(calcSquareMeter));
            //display divider
            System.out.print("\t|");
            //calculation for converting squaremeter to ping
            double calcPing = squareMeter/3.305;
            //dusplay squaremeter value
            System.out.print("\t    "+squareMeter);
            //display calculated value for ping
            System.out.print("\t\t"+nf.format(calcPing));
            //increment value for squaremeter
            squareMeter=squareMeter+5;
            
        }
        
        
        
        

        
    }
}
