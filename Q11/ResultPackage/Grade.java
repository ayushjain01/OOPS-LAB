package Q11.ResultPackage;

import Q11.Student;
import java.util.Scanner;

public abstract class Grade implements Student{
    public char grade[][] = new char[4][6];
    public float score[][] = new float[4][6];
    public float credObt[] =  new float[4];
    public float sgpa[] = new float[4];
    public int totalCred[] = new int[4];
    Scanner sc = new Scanner(System.in);

    public void obtainedMarks(int sem){
        System.out.println("Enter Marks for the Following Subjects-");
        for(int i = 0; i < 6; i++){
            System.out.print(subject[i]+" : ");
            score[sem-1][i] = sc.nextFloat();
        }
    }
    public void convertToGrade(int sem){
        for(int i = 0; i < 6; i++){

            if(score[sem-1][i] >= 90){
                grade[sem-1][i] = 'S';
                credObt[sem-1] += (float) credit[i]*10;
            }
            else if(score[sem-1][i] >= 80){
                grade[sem-1][i] = 'A';
                credObt[sem-1] += (float) credit[i]*9;
            }
            else if(score[sem-1][i] >= 70){
                grade[sem-1][i] = 'B';
                credObt[sem-1] += (float) credit[i]*8;
            }
            else if(score[sem-1][i] >= 60){
                grade[sem-1][i] = 'C';
                credObt[sem-1] += (float) credit[i]*7;
            }
            else if(score[sem-1][i] >= 50){
                grade[sem-1][i] = 'D';
                credObt[sem-1] += (float) credit[i]*6;
            }
            else if(score[sem-1][i] >= 40){
                grade[sem-1][i] = 'E';
                credObt[sem-1] += (float) credit[i]*5;
            }
            else {
                grade[sem-1][i] = 'F';
                credObt[sem-1] += (float) credit[i]*4;
            }
            totalCred[sem-1] += credit[i];
        }
        sgpa[sem-1] = credObt[sem-1]/totalCred[sem-1];
        if (sgpa[sem-1]>10)
        {
            throw new java.lang.Error("Invalid SGPA : SGPA cannot be greater than 10.");
        }
    }
}

