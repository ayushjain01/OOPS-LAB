import java.util.Scanner;

public class Account {
    int accNo;
    String name;
    long phoneNo;
    double balance = 0;

    Account(int accNo, String name, long phoneNo)
    {
        this.accNo = accNo;
        this.name = name;
        this.phoneNo = phoneNo;
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number:");
        this.accNo = sc.nextInt();
        System.out.print("Enter Account Holder's Name:");
        this.name = sc.next();
        System.out.print("Enter Phone Number-");
        this.phoneNo = sc.nextLong();
    }
    private void deposit(double amm){
        this.balance += amm;
        System.out.print("\nAmount Deposited\nCurrent Balance:" + this.balance);

    }

    private void withdraw(double amm){
        if (amm>this.balance){
            System.out.print("\nInsufficient Balance");
        }
        else{
            this.balance -= amm;
            System.out.print("\nAmount Withdrawn\nCurrent Balance:" + this.balance);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int accNo = 0;
        String name = "";
        long phoneNo = 0;
        int choice;
        double amm;
        System.out.print("Enter Account Details:\n");
        Account acc = new Account(accNo, name, phoneNo);
        acc.getInput();
        System.out.println("Welcome " + acc.name + "!");
        while(true){
            System.out.print("\nPress\n1.To Deposit\n2.To Withdraw\n3.To View Balance\n4.Quit\n...");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter amount to deposit:");
                    amm = sc.nextDouble();
                    acc.deposit(amm);
                    break;
                case 2:
                    System.out.print("\nEnter amount to withdraw:");
                    amm = sc.nextDouble();
                    acc.withdraw(amm);
                    break;
                case 3:
                    System.out.print("\nCurrent Balance:" + acc.balance);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.print("Invalid Input");
            }
        }

    }
}
