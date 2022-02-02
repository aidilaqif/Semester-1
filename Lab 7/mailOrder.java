/* NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 7
QUESTION : 2
*/
import java.util.Scanner;
public class mailOrder{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        double productPrice=0;
        displayInstruction();
        double totalPrice = caclTotalPrice(productPrice, input);
        displayTotalPrice(totalPrice);
        
        
        input.close();
    }
    public static void displayInstruction(){
        System.out.println("Price of each item\nProduct 1 = RM 2.98\nProduct 2 = RM 4.50\nProduct 3 = RM 9.98\nProduct 4 = 4.49\nProduct 5 = RM 6.87");
        System.out.println("Enter \'-9999\' to get the total price");
    }
    public static double caclTotalPrice(double productPrice,Scanner input){
        double totalPrice =0;
        int productNum=0,quantitySold=0;
        productNum = readProduct(input);
        while(productNum!=-9999){
            double price = determinePrice(productNum);
            quantitySold = readQuantity(input);
            productPrice = caclProductPrice(price, quantitySold);
            totalPrice = totalPrice + productPrice;
            productNum = readProduct(input);
            }
        
        return totalPrice;
    }
    public static int readProduct(Scanner input){
        System.out.print("Enter product number: ");
        int productNum=input.nextInt();
        return productNum;
    }
    public static double determinePrice(int productNum){
        double price=0;
        switch (productNum){
            case 1:
                price=2.98;
                break;
            case 2:
                price=4.5;
                break;
            case 3:
                price=9.98;
                break;
            case 4:
                price=4.49;
                break;
            case 5:
                price=6.87;
                break;
        }
        return price;
    }
    public static int readQuantity(Scanner input){
        System.out.print("Enter quantity sold: ");
        int quantitySold = input.nextInt();
        return quantitySold;
    }
    public static double caclProductPrice(double price,int quantitySold){
        double productPrice = quantitySold*price;
        return productPrice;
    }
    
    public static void displayTotalPrice(double totalPrice){
        System.out.println("The total price of all product is RM"+totalPrice);
    }
}


