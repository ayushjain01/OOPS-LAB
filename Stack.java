import java.util.*;

public class Stack {
    int top = -1;
    int size;
    int[] mystack;

    Stack(int size) {
        this.size = size;
        this.mystack = new int[this.size];
    }

    private void push(int item) {
        if (this.top == this.size-1) {
            System.out.println("Stack Overflow");
        } else {
            this.mystack[++this.top] = item;
        }
    }

    private int pop() {
        if (this.top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return this.mystack[this.top--];
        }
    }

    private void display() {
        if (this.top == -1) {
            System.out.println("Stack Empty. Cannot Display");
        } else {
            System.out.println("Stack Elements -");
            for (int i = 0; i <= this.top; i++) {
                System.out.print(this.mystack[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Stack size -");
        n = sc.nextInt();
        Stack stack = new Stack(n);
        while (true)
        {
            System.out.println("Press\n1.To Push\n2.To Pop\n3. To Display\n4.To Exit\nEnter -");
            int choice;
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter -");
                    n = sc.nextInt();
                    if (n == 0)
                    {
                        System.out.println("0 not allowed");
                    }
                    else
                    {
                        stack.push(n);
                    }
                    break;
                case 2:
                    n = stack.pop();
                    if (n != 0)
                    {
                        System.out.println("Item Popped = "+n);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
