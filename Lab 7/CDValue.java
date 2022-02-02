import java.util.Scanner;
import java.text.NumberFormat;
public class CDValue{
    public static void main(String args[]){
        //creating scanner
        Scanner input = new Scanner(System.in);
        //rounding of to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);

        double amount = readAmount(input);//calling readAmount method
        double percentageYield = readPercentage(input);//calling readPercentage method
        int months = readMonths(input);//calling readMonths method
        System.out.print("Month\tCD Value\n");//displaying message
        //initialize variables data type
        int z;
        //loop for the calculation
        for(z=1;z<=months;z++){
            double cdValue = calcValue(amount, percentageYield);
            amount = cdValue;
            display(z, cdValue,nf);
        }       
        input.close();
    }
    //method to display message for looping
    public static void display(int z, double cdValue,NumberFormat nf) {
        System.out.print(z+"\t"+nf.format(cdValue)+"\n");
    }
    //method to calculate the CD Value
    public static double calcValue(double amount, double percentageYield) {
        double cdValue;
        cdValue = amount + amount*percentageYield/1200;
        return cdValue;
    }
    //method to read the maturity period
    public static int readMonths(Scanner input) {
        System.out.print("Enter the maturity period (number of months): ");
        int months = input.nextInt();
        return months;
    }
    //method to read annual percentage yield
    public static double readPercentage(Scanner input) {
        System.out.print("Enter annual percentage yield: ");
        double percentageYield = input.nextDouble();
        return percentageYield;
    }
    //method to read the initial deposit amount
    public static double readAmount(Scanner input) {
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        return amount;
    }
    
    
}