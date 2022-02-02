import java.util.Scanner;
public class averageArray {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            double[] num = new double[10];
            int z=0;
            System.out.print("Enter 10 numbers: ");
            for(z=0;z<num.length;z++){
                num[z] = input.nextDouble();

            }
            double average = average(num);
            System.out.println("The average of the 10 number is "+average(num));
            input.close();
        }
    }
    public static int average(int num[]){
        int sum=0;
        for(int z=0;z<num.length;z++){
            sum=sum+num[z];
        }
        int average = sum/num.length;
        return average;
    }
    public static double average(double num[]){
        double sum=0;
        for(int z=0;z<num.length;z++){
            sum=sum+num[z];
        }
        double average = sum/num.length;
        return average;
    }
}
