package Q11.StudentPackage;

import Q11.Student;
import Q11.StudentPackage.Marks;
import java.util.Scanner;
public class RegisterStudent extends Marks implements Student{
    Scanner sc = new Scanner(System.in);
    String name;
    String branch;
    int cred;
    public void setName(){
        System.out.print("Enter Student Name :");
        name = sc.nextLine();
    }
    public void setBranch(){
        System.out.print("Enter Student Branch :");
        branch = sc.nextLine();
    }
    public void semester(int sem) {
        if (sem == 1) {
            setName();
            setBranch();
        }
        System.out.println("Enter Subjects and Credits-");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + " : ");
            subject[i] = sc.nextLine();
            System.out.print(" Credits for Subject " + (i + 1) + ":\t");
            credit[i] = sc.nextInt();
            sc.nextLine();
            cred = cred + credit[i];
            if(cred >=30){
                throw new java.lang.Error("CreditLimit Exception : Maximum Credit Limit(30) Reached.");
            }
        }
    }
}