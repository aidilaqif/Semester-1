/* 
NAME : AIDIL 'AQIF BIN MOHD PIDAUS
MATRIC NUMBER : 212901
SUBJECT : CSC3100
LECTURE GROUP : 9
TASK TITLE : LAB 6-A 
QUESTION : Reading From Console to File
*/
import java.io.*;
import java.util.*;
public class TestProgram{
	public static void main(String[] args) throws IOException{
		//create new file
		File file=new File("inputFile.txt");
		//write to file
		PrintWriter fname=new PrintWriter(file);
		//condition for existance of the file
		if(!file.exists()) {
			System.out.println("File "+file+" not exist");
		}
		//creating scanner
		Scanner scanner=new Scanner(System.in);
		//initialize data type
		int matricNum=0;
		double firstTest=0;
		double labTest=0;
		double quiz=0;
		double project=0;
		double finalExam=0;
		//looping to prompt more than 10 students
 		for(int i=0;i<=10; i++) {
			//prompt user
			System.out.print("Number matricNum: ");
			matricNum=scanner.nextInt();
			System.out.print("First Test(15%) : ");
			firstTest=scanner.nextDouble();
			System.out.print("Lab Test(20%) : ");
			labTest=scanner.nextDouble();
			System.out.print("Quiz(15%) : ");
			quiz=scanner.nextDouble();
			System.out.print("Project(10%) : ");
			project=scanner.nextDouble();
			System.out.print("Final Exam(40%) : ");
			finalExam=scanner.nextDouble();
			System.out.println();
			//format to print in the input file
			fname.printf("%-15s %12s %19s %14s %15s %18s\n",matricNum,firstTest,labTest,quiz,project,finalExam);
		}
		fname.close();
		scanner.close();
	}
}