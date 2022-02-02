import java.util.Scanner;
public class reverseArray {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] number = number(input);
        int[] reverseNumber = reverseNumber(number);
        input.close();
    }
    public static int[] number(Scanner input){
        int[] number = new int[10];
        System.out.print("Enter 10 number: ");
        for(int i = 0;i<number.length;i++){
            number[i]=input.nextInt();
        }
        return number;
    }
    public static int[] reverseNumber(int[] number){
        int[] reverseNumber = new int[10];
        System.out.print("The reverse of the 10 number: ");
        for(int i = (number.length-1);i>=0;i--){
            reverseNumber[i] = number[i];
            System.out.print(reverseNumber[i]+" ");
        }
        
        return reverseNumber;
    }
}
