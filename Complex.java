import java.util.*;


public class Complex {
    float real;
    float imaginary;

    Complex(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public static Complex sum_c(Complex c1, Complex c2){
        Complex c3 = new Complex(0,0);
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }

    public static Complex diff_c(Complex c1,Complex c2){
        Complex c3 = new Complex(0,0);
        c3.real = c1.real - c2.real;
        c3.imaginary = c1.imaginary - c2.imaginary;
        return c3;
    }

    public static Complex mul_c(Complex c1,Complex c2){
        Complex c3 = new Complex(0,0);
        c3.real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        c3.imaginary = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return c3;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r1,r2,i1,i2;
        System.out.println("Enter Real and Imaginary part of Complex Number 1,separated by space-");
        r1 = sc.nextFloat();
        i1 = sc.nextFloat();
        System.out.println("Enter Real and Imaginary part of Complex Number 1\2,separated by space-");
        r2 = sc.nextFloat();
        i2 = sc.nextFloat();
        Complex c1 = new Complex(r1,i1);
        Complex c2 = new Complex(r2,i2);
        Complex sum = sum_c(c1,c2);
        Complex diff = diff_c(c1,c2);
        Complex prod = mul_c(c1,c2);
        System.out.println("Complex Number 1: "+c1.real+"+"+c1.imaginary+"i");
        System.out.println("Complex Number 2: "+c2.real+"+"+c2.imaginary+"i");
        System.out.println("Sum: "+sum.real+"+"+sum.imaginary+"i");
        System.out.println("Difference: "+diff.real+"+"+diff.imaginary+"i");
        System.out.println("Product: - "+prod.real+"+"+prod.imaginary+"i");
        sc.close();
    }
}
