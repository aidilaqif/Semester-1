/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 5 
QUESTION : 2
*/
import java.util.Scanner;
public class question2 {
    public static void main(String[] args){

        //creating scanner
        Scanner i = new Scanner(System.in);

        //prompt user to enter string
        System.out.print("Enter string : ");
        String st = i.nextLine();
        
        //display all the options available
        System.out.println("\n\nOptions Available:");
        System.out.println("\n1. Character at a specific index(enter \'option 1\')");
        System.out.println("2. Compare string with a new string(enter \'option 2\')");
        System.out.println("3. Identify how many characters in the string(enter \'option 3\')");
        System.out.println("4. Count number of letters in the string(enter \'option 4\')");
        System.out.println("5. Count number of digits in the string(enter \'option 5\')");
        System.out.println("6. Change any lowercase letter into uppercase letter(enter \'option 6\')");
        System.out.println("7. Change any uppercase letter into lowercase letter(enter \'option 7\')");
        System.out.println("8. Replace any character in the string with a new characher(enter \'option 8\')");
        System.out.println("9. Delete any character or substring in the string(enter \'option 9\')");
        System.out.println("10. Insert any character or string into the string(enter \'option 10\')");

        //prompt user 
        System.out.print("\nEnter option: ");
        String option = i.nextLine();

        //switch case based on options entered
        switch (option){
            case "option 1":System.out.print("\nEnter the index that you want : ");
                int num = i.nextInt();
                char ch = st.charAt(num);
                System.out.println("The character for the index that you want is "+ch);
            break;

            case "option 2":System.out.print("\nEnter the new string : ");
                String st2 = i.nextLine();
                if(st.equals(st2))
                    System.out.println("Both of this strings are equal.");
                else
                    System.out.println("These two strings are not equal.");
            break;

            case "option 3":System.out.print("The string "+st+" has "+st.length()+" characters.");
            break;

            case "option 4":
            int CountLetters = 0;
            for(int z=0;z<st.length();z++){
                if(Character.isLetter(st.charAt(z)))
                CountLetters++;
            }
            System.out.println(st+" has "+CountLetters+" number of letters.");
            break;

            case "option 5":
            int CountDigits=0;
            for(int z=0;z<st.length();z++){
                if(Character.isDigit(st.charAt(z)))
                CountDigits++;
            }
            System.out.println(st+" has "+CountDigits+" number of digits.");
            break;

            case "option 6":System.out.print("Enter the letter that you want to be uppercase: ");
                char letter = i.next().charAt(0);
                System.out.println("The uppercase of the letter "+letter+" is "+Character.toUpperCase(letter)+".");
            break;

            case "option 7":System.out.print("Enter the letter that you want to be lowercase: ");
                letter = i.next().charAt(0);
                System.out.println("The lowercase of the letter "+letter+" is "+Character.toLowerCase(letter)+".");
            break;

            case "option 8":
                System.out.print("Enter the character that you want to replace : ");
                letter = i.next().charAt(0);
                System.out.print("Enter the new character : ");
                char new_letter = i.next().charAt(0);
                String new_st =st.replace(letter, new_letter);
                System.out.println("The new string is "+new_st+".");
            break;

            case "option 9":
                System.out.print("Enter the character that you want to remove : ");
                String remove_letter = i.next();
                new_st = st.replaceAll(remove_letter , "");
                System.out.print("The new string is "+new_st);
            break;

            case "option 10":System.out.print("Enter \'String\' to insert new string or enter \'Character\' to enter new character : ");
                String option10 = i.nextLine();
                if(option10.equals("String")){
                    System.out.print("Enter the new string you want to add : ");
                    new_st=i.nextLine();
                    System.out.println(st+" "+new_st);
                }
                else
                    System.out.print("Enter the new character that you want to add : ");
                    new_letter = i.next().charAt(0);
                    System.out.print(st+new_letter);
            break;

        }
        i.close();
    }
}
