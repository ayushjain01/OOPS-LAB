import java.util.Scanner;
public class FibonacciRec{
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    public static void main(String args[]) {
        int count;
Scanner sc=new Scanner(System.in);  
 System.out.println("Enter -");
 count = sc.nextInt();
 System.out.print("Fibonacci Series of "+count+" numbers: ");
	for(int i = 0; i < count; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}