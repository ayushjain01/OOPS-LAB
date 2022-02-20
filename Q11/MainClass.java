package Q11;

import  Q11.StudentPackage.*;
import Q11.ResultPackage.*;

public class MainClass{

    public static void main(String[] args){
        RegisterStudent r = new RegisterStudent();
        System.out.println("Semester 1");
        r.semester(1);
        r.obtainedMarks(1);
        r.convertToGrade(1);
        r.printSGPA(1);

        System.out.println("Semester 2");
        r.semester(2);
        r.obtainedMarks(2);
        r.convertToGrade(2);
        r.printSGPA(2);

        System.out.println("Semester 3");
        r.semester(3);
        r.obtainedMarks(3);
        r.convertToGrade(3);
        r.printSGPA(3);

        System.out.println("Semester 4");
        r.semester(4);
        r.obtainedMarks(4);
        r.convertToGrade(4);
        r.printSGPA(4);

        r.calcCGPA();
    }
}