/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 6-A 
QUESTION : Reading From File to Console and File
*/
import java.io.*;
import java.util.*;

public class studentScore {
	public static void main(String[] args) throws IOException {
		//creating file
	    File file1 = new File("inputFile.txt");
	    File file2 = new File("outputFile.txt");
		//write to a file
	    PrintWriter StudentsGrade = new PrintWriter(file2);
		//condition for existance of the file
	    if(!file1.exists()) {
		    System.out.println("File "+ file1 +" not exists");
		    System.exit(0);
	    }
		//creating scanner
	    Scanner input=new Scanner(file1); //Scanner
		
	    while(input.hasNext()) {

		    String matricNum = input.next();
		    double  firstTest= input.nextDouble();
		    double  labTest= input.nextDouble();
		    double  quiz= input.nextDouble();
		    double  project= input.nextDouble();
		    double  finalExam= input.nextDouble();
		    double FinalMarks=(firstTest+labTest+quiz+project+finalExam); 

		    String Grade = null; //Variables
		    if (FinalMarks>=80&&FinalMarks<=100){
			    Grade="A";	
		    }
		    else if(FinalMarks>=70&&FinalMarks<=79){
			    Grade="A-";
		    }
		    else if (FinalMarks>=60&&FinalMarks<=69){			
			    Grade="B";
		    }
		    else if (FinalMarks>=50&&FinalMarks<=59) {
			    Grade="C";
		    }
		    else if (FinalMarks>=40&&FinalMarks<=49) {
			    Grade="D";
		    }
            else
                Grade ="F";

		    System.out.printf("%-15s %-15.2f %-15s\n",matricNum,FinalMarks,Grade);
		    StudentsGrade.printf("%-15s %-15.2f %-15s\n",matricNum,FinalMarks,Grade);
	    }
	    StudentsGrade.close();
	    input.close();
	}
}