/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 4 
QUESTION : 1
*/

import java.util.Scanner;
import java.text.NumberFormat;
public class BMI {
    public static void  main(String[] args) {
        
        //declaring scanner for input
        Scanner i = new Scanner(System.in);
        
        //formating text to 2 decimal places max
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);

        //Displaying BMI information
        System.out.println("BMI information:");
        System.out.println("BMI (18.5-24.9) \u2192 Normal");
        System.out.println("BMI (25-29.9) \u2192 Over Weight");
        System.out.println("BMI (30-34.9) \u2192 Obese");
        System.out.println("BMI (35-39.9) \u2192 Severely Obese");
        System.out.println("BMI (>=40) \u2192 Morbidly Obese");
        System.out.println("********************************************");
        System.out.println("CAUTION!!");
        System.out.println("Women - waist size > 35 inches");
        System.out.println("Men - waist size > 40 inches");
        System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
        System.out.println("\n*******************************************");
        System.out.println("\nHEALTH CALCULATOR");
        
        //declaring data type for input variable
        String name,gender;
        double height,weight,waist,bmi;
        //Promt and read user input
        System.out.print("\nEnter your name : ");
        name = i.nextLine();

        System.out.print("Enter your gender(Male/Female) : ");
        gender = i.nextLine();

        System.out.print("Enter your height in meters : ");
        height = i.nextDouble();

        System.out.print("Enter your weight in kilogram : ");
        weight = i.nextDouble();

        System.out.print("Enter your waist size in inches : ");
        waist= i.nextDouble();

        bmi = weight/(height*height);

        //declaring constant variable
        String congratulate = " has a good life style..Congratss!!!!.";
        String advice = " has higher risk for heart disease and diabetes";

        //if condition for Normal BMI
        if(bmi>=18.5&&bmi<=24.9){
            String status="Normal";
            if(gender.equals("Male")&&waist<=40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Male")&&waist>40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
            else if(gender.equals("Female")&&waist<=35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Female")&&waist>35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
        }
        //if condition for Over Weight BMI
        else if(bmi>=25&&bmi<=29.9){
            String status="Over Weight";
            if(gender.equals("Male")&&waist<=40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Male")&&waist>40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
            else if(gender.equals("Female")&&waist<=35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Female")&&waist>35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            } 
        }
        //if condition for Obese BMI
        else if(bmi>=30&&bmi<=34.9){
            String status="Obese";
            if(gender.equals("Male")&&waist<=40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Male")&&waist>40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
            else if(gender.equals("Female")&&waist<=35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Female")&&waist>35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            } 
        }
        //if condition for Severely Obese BMI
        else if(bmi>=35&&bmi<=39.9){
            String status="Severely Obese";
            if(gender.equals("Male")&&waist<=40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Male")&&waist>40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
            else if(gender.equals("Female")&&waist<=35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Female")&&waist>35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
        }
        //if condition for Morbidly Obese
        else{
            String status="Morbidly Obese";
            if(gender.equals("Male")&&waist<=40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Male")&&waist>40){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
            else if(gender.equals("Female")&&waist<=35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+congratulate);
            }
            else if(gender.equals("Female")&&waist>35){
                System.out.println(name+", your BMI is "+nf.format(bmi)+", so that means you are "+status+" and"+advice);
            }
        }
        
        i.close();
    }
    
}
