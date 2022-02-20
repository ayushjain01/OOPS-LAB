package Q10.ISE;
import Q10.Department;
import Q10.Faculty;
import java.util.Scanner;

public class ISE_Department implements Department{
    Scanner sc = new Scanner(System.in);
    public void readData(Faculty f){
        System.out.println("Enter Faculty Details -");
        System.out.print("Name :");
        f.name = sc.nextLine();
        System.out.print("Designation :");
        f.designation = sc.nextLine();
        System.out.print("Experience :");
        f.yearsOfExperience = sc.nextInt();
        sc.nextLine();
        System.out.print("Subjects Handled :");
        f.subjectsHandled = sc.nextLine();
        System.out.print("Number of Research Consultancy Projects :");
        f.numberOfResearchConsultancyProjs = sc.nextInt();
        System.out.print("Number of Designations :");
        f.numberOfDesignations = sc.nextInt();
        sc.nextLine();
        System.out.print("Joining Date :");
        f.joiningDate = sc.nextLine();
        System.out.print("Enter the age of the faculty");
        int tempAge = sc.nextInt();
        if(tempAge <=58){
            f.age = tempAge;
            sc.nextLine();
        }
        else{
            throw new java.lang.Error("Age Exception!");
        }
    }

    public void printData(Faculty f){
       System.out.println("Faculty Details :");
       System.out.println("Name : " + f.name);
       System.out.println("Age : " + f.age);
       System.out.println("Designation : " + f.designation);
       System.out.println("Subjects Handled : " + f.subjectsHandled);
       System.out.println("Experience : " + f.yearsOfExperience);
       System.out.println("Joining Date : " + f.joiningDate);
    }

    public void printNumberOfDesignations(Faculty f){
        System.out.println("The Number of Designations the Faculty had Till Date are :" + f.numberOfDesignations);
    }

    public void printNumberOfResearchConsultancyProjs(Faculty f){
        System.out.println("The Number of Research Consultancy Projects the Faculty Took Till Date are: " + f.numberOfResearchConsultancyProjs);
    }
}

