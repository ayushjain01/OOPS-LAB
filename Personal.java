/*
Note :
Take Salary from the user, calculate Basic, HRA and DA salary. Basic Salary = 65% of Salary, HRA and DA = 50% of basic salary
Loan :
A person is eligible for a loan, if 21<age<65 and yearsofexperience >= 5 and numberofloans >=1 and Basic+HRA+DA >= ₹ 4,00,000
Tax:
totalsalary = basic + hra + da
calculate tax on the basic of the following criteria
_________________________________
|  totalsalary           | tax  |
|-------------------------------|
| ₹0 - ₹2,50,000	     | Nil  |
| 2,50,001 - ₹ 5,00,000	 | 5%   |
| 5,00,001 - ₹ 7,50,000	 | 10%  |
| 7,50,001 - ₹ 10,00,000 | 15%  |
| 10,00,001 - ₹12,50,000 | 20%  |
| 12,50,001 - ₹15,00,000 | 25%  |
| Above 15,00,000        | 30%  |
|-------------------------------|

Promotion:
An employee is eligible for promotion if yearofexpirence >= 5, age<65 and number of loans <=1
*/
import java.util.Scanner;

public class Personal {
    String name;
    int age;
    String education;
    double salary;
    double basic, da, hra;
    int yearsOfExperience;
    int numberOfLoans;
    double loanAmount;
    double totalSalary;

    Personal(String name, int age, String education, double salary, int yearsOfExperience, int numberOfLoans, double loanAmount) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.salary = salary;
        this.basic = 0.65 * salary;
        this.da = 0.5 * this.basic;
        this.hra = 0.5 * this.basic;
        this.yearsOfExperience = yearsOfExperience;
        this.numberOfLoans = numberOfLoans;
        this.loanAmount = loanAmount;
        this.totalSalary = this.basic + this.da + this.hra;
    }

    private void isEligible() {
        if (21 < this.age && this.age < 65 && this.yearsOfExperience >= 5 && (this.totalSalary >= 400000) && this.numberOfLoans <= 1) {
            System.out.println("Employee " + this.name + " is eligible for a loan");
        } else {
            System.out.println("Employee " + this.name + " is not eligible for a loan");
        }
    }

    private void taxPay() {
        double tax;
        if (this.totalSalary <= 250000) {
            tax = 0;
        } else if (this.totalSalary <= 500000) {
            tax = .05 * this.totalSalary;
        } else if (this.totalSalary <= 750000) {
            tax = .10 * this.totalSalary;
        } else if (this.totalSalary <= 1000000) {
            tax = .15 * this.totalSalary;
        } else if (this.totalSalary <= 1250000) {
            tax = .20 * this.totalSalary;
        } else if (this.totalSalary <= 1500000) {
            tax = .25 * this.totalSalary;
        } else {
            tax = .30 * this.totalSalary;
        }
        System.out.println("Tax to be Paid : " + tax);
    }

    private void isEligiblePromotion() {
        if (this.yearsOfExperience >= 5 && this.numberOfLoans <= 1 && this.age < 65) {
            System.out.println("Employee " + this.name + " is eligible for promotion");
        } else {
            System.out.println("Employee " + this.name + " is not eligible for promotion");
        }
    }

    private void display() {
        System.out.println("Employee Details -");
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Education : " + this.education);
        System.out.println("Salary(CTC) : " + this.salary);
        System.out.println("Basic Salary : " + this.basic);
        System.out.println("HRA Salary : " + this.hra);
        System.out.println("DA Salary : " + this.da);
        System.out.println("Experience : " + this.yearsOfExperience);
        System.out.println("No. of loans : " + this.numberOfLoans);
        System.out.println("Loan amount corresponds to : " + this.loanAmount);
        this.isEligible();
        this.isEligiblePromotion();
        this.taxPay();
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Employees : ");
        n = sc.nextInt();
        Personal[] empl = new Personal[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + "'s Details :");
            System.out.println("Name : ");
            sc.nextLine();
            String emplName = sc.nextLine();
            System.out.println("Age : ");
            int emplAge = sc.nextInt();
            System.out.println("Educational Qualifications : ");
            sc.nextLine();
            String emplEdu = sc.nextLine();
            System.out.println("Salary : ");
            double emplSalary = sc.nextDouble();
            System.out.println("Years of Experience : ");
            int emplYE = sc.nextInt();
            System.out.println("Number of Loans : ");
            int emplLN = sc.nextInt();
            System.out.println("Total Loan Amount : ");
            double emplTotal = sc.nextDouble();
            empl[i] = new Personal(emplName, emplAge, emplEdu, emplSalary, emplYE, emplLN, emplTotal);
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println("######################Display details######################");
            empl[i].display();
            System.out.println("###########################################################");
        }
    }
}
