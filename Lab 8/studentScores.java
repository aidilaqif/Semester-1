import java.util.Scanner;
public class studentScores{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
            int bestScore=0;
            int i;
            char grade=0;
            int gradeA=0,gradeB=0,gradeC=0,gradeD=0,gradeF=0;
            System.out.print("Enter the number of students: ");
            int studentNum = input.nextInt();
            int[] scores = new int[studentNum];
            System.out.print("Enter "+studentNum+" scores: ");
            for(i=0;i<studentNum;i++){
                scores[i] = input.nextInt();
                if(scores[i]>=bestScore){
                    bestScore = scores[i];
                }
                else{
                    bestScore = bestScore;
                }   
            }
            for(i=0;i<studentNum;i++){
                if(scores[i]>=(bestScore-5)){
                    grade = 'A';
                    gradeA=gradeA+1;
                }
                else if(scores[i]>=(bestScore-10)){
                    grade = 'B';
                    gradeB =gradeB+1;
                }
                else if(scores[i]>=(bestScore-15)){
                    grade = 'C';
                    gradeC =gradeC+1;
                }
                else if(scores[i]>=(bestScore-20)){
                    grade = 'D';
                    gradeD =gradeD+1;
                }
                else {
                    grade = 'F';
                    gradeF =gradeF+1;
                }
            System.out.println("Student "+i+" is "+scores[i]+" and grade is "+grade);
            
            }
            System.out.println("The number of student who get A is "+gradeA);
            System.out.println("The number of student who get B is "+gradeB);
            System.out.println("The number of student who get C is "+gradeC);
            System.out.println("The number of student who get D is "+gradeD);
            System.out.println("The number of student who get F is "+gradeF);
            input.close();
        
    }
}