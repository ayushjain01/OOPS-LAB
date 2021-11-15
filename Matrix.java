import java.util.Scanner;

public class Matrix{
    int array[][];
    int rows;
    int columns;
    Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.array = new int[rows][columns];
    }
    Scanner sc = new Scanner(System.in);
    public void getInput(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++){
                this.array[i][j] = sc.nextInt();
            }
        }
    }

    public static Matrix matrixMul(Matrix m1,Matrix m2){
        if (m1.columns != m2.rows){
            System.out.println("Matrices have Incorrect Order");
            return null;
        }
        else{
            Matrix prod = new Matrix(m1.rows,m2.columns);
            for(int i=0;i<m1.rows;i++){
                for(int j=0;j<m2.columns;j++){
                    for(int k=0;k<m1.columns;k++) {
                        prod.array[i][j] += m1.array[i][k] * m2.array[k][j];
                    }
                }
            }
            return prod;
        }
    }

    public void printMatrix(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++){
                System.out.print(this.array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter Number of rows and columns for matrix 1:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter Number of rows and columns for matrix 2:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        Matrix m1 = new Matrix(r1,c1);
        Matrix m2 = new Matrix(r2,c2);

        System.out.println("Enter the elements of matrix 1");
        m1.getInput();

        System.out.println("Enter the elements of matrix 2");
        m2.getInput();

        Matrix m3 = matrixMul(m1,m2);
        System.out.println("Matrix 1 is:");
        m1.printMatrix();

        System.out.println("Matrix 2 is:");
        m2.printMatrix();

        if (m3!= null) {
            System.out.println("Product Matrix is:");
            m3.printMatrix();
        }
        sc.close();
    }
}