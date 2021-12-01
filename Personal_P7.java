

import java.util.Scanner;
public class Personal_P7{

    String name;
    int age;
    String education;
    double basic,da,hra;
    int yearsOfExperience;
    int  numberOfLoans;
    double loanAmount;

    Personal_P7(String name,int age,String education,double basic,double da,double hra,
                int yearsOfExperience,int numberOfLoans,double loanAmount){
        this.name = name;
        this.age = age;
        this.education = education;
        this.basic = basic;
        this.da = da;
        this.hra = hra;
        this.yearsOfExperience = yearsOfExperience;
        this.numberOfLoans = numberOfLoans;
        this.loanAmount = loanAmount;
    }

    public static void main(String[] args){

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Employees : ");
        n = sc.nextInt();
        Personal_P7[] empl = new Personal_P7[n];

        for(int i=0; i<n; i++){

            System.out.println("Enter Employee " + (i+1) +"'s Details :");
            System.out.println("Enter Employee Name : ");
            String emplName = sc.next();
            System.out.println("Enter Employee Age : ");
            int emplAge = sc.nextInt();
            System.out.println("Enter Educational Qualifications : ");
            String emplEdu = sc.next();
            System.out.println("Enter Basic salary : ");
            double emplBS = sc.nextDouble();
            System.out.println("Enter DA salary : ");
            double emplDA = sc.nextDouble();
            System.out.println("Enter HRA salary : ");
            double emplHRA = sc.nextDouble();
            System.out.println("Enter Years of Experience : ");
            int emplYE = sc.nextInt();
            System.out.println("Enter Number of Loans : ");
            int emplLN = sc.nextInt();
            System.out.println("Enter the Total Loan Amount : ");
            double emplTotal = sc.nextDouble();

            empl[i] = new Personal_P7(emplName,emplAge,emplEdu,emplBS,emplDA,emplHRA,emplYE,emplLN,emplTotal);
            System.out.println("######################Display details######################");
            display(empl[i]);
            System.out.println("###########################################################");
        }
    }

    static void isEligible(Personal_P7 p){
        if(p.yearsOfExperience >= 10 && (p.basic + p.da + p.hra >= 400000) && p.numberOfLoans<=1){
            System.out.println("Employee is eligible for a loan");
        }
        else{
            System.out.println("Employee is not eligible for a loan");
        }
    }

    static void taxPay(Personal_P7 p){
        double tax;
        if((p.basic + p.da + p.hra <= 100000)){
            tax = 0;
        }
        else if((p.basic + p.da + p.hra <= 200000)){
            tax = .2 * (p.basic + p.da + p.hra);
        }
        else if(p.basic + p.da + p.hra <= 300000){
            tax = .3 * (p.basic + p.da + p.hra);
        }
        else if(p.basic + p.da + p.hra <= 400000){
            tax = .35 * (p.basic + p.da + p.hra);
        }
        else {
            tax = .4 * (p.basic + p.da + p.hra);
        }
        System.out.println("Tax to be Paid : " + tax);
    }

    static void isEligiblePromotion(Personal_P7 p){
        if(p.yearsOfExperience >=10 && (p.numberOfLoans <=1)){
            System.out.println("Employee is eligible for promotion");
        }
        else{
            System.out.println("Employee is not eligible for promotion");
        }
    }

    static void display(Personal_P7 p){
        System.out.println("Name of person is : " + p.name);
        System.out.println("Age of person is : " + p.age);
        System.out.println("Education of person is : " + p.education);
        System.out.println("Salary of person is : " + (p.basic+p.da+p.hra));
        System.out.println("Experience of person is : " + p.yearsOfExperience);
        System.out.println("No of loans  of person are : " + p.numberOfLoans);
        System.out.println("Loan amount corresponds to : " + p.loanAmount);
        isEligible(p);
        isEligiblePromotion(p);
        taxPay(p);
    }

}
