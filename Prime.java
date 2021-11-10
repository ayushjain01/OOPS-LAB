import java.util.Scanner;
class Prime{  
public static void main(String args[])  
{    
 int num,i,flag =0;
 Scanner sc=new Scanner(System.in);  
 System.out.println("Enter number-");
 num = sc.nextInt();
 if (num <= 1){
  System.out.println(num+" is Neither a Prime nor Composite Number"); 
 }
 else{
     for (i = 2; i<((int) (num/2));i++){
         if (num%i ==0){
             flag = 1;
             break;
         }
     }
     if (flag == 1){
         System.out.println(num+" is a Composite Number");
     }
     else{
         System.out.println(num+" is a Prime Number");
     }
 }

     
 }}  