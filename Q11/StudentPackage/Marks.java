package Q11.StudentPackage;
import Q11.Student;
import Q11.ResultPackage.Grade;

public abstract class Marks extends Grade implements Student{

    double cgpa = 0;
    public void printSGPA(int sem){
        System.out.println("The SGPA obtained in "+(sem)+" sem is : " +sgpa[sem-1]);
    }

    public void calcCGPA(){
        float sum = 0;
        for(int k=0;k<4;k++){
            sum += sgpa[k];
        }
        cgpa = sum/4;
        System.out.println("The CGPA obtained is : "+cgpa);
    }
}