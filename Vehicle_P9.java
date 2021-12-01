import java.util.Scanner;

abstract class Vehicle{
    int yearOfManufacture;
    Vehicle(){
        this.yearOfManufacture = 0;
    }
    Vehicle(int y){
        this.yearOfManufacture = y;
    }
    abstract int getData();
    abstract void putData(int y);
}

class TwoWheeler extends Vehicle{

    TwoWheeler(){
        super();
    }
    TwoWheeler(int y){
        super(y);
    }
    int getData(){
        return this.yearOfManufacture;
    }
    void putData(int y){
        this.yearOfManufacture = y;
    }
}

final class FourWheeler extends Vehicle{

    FourWheeler(){
        super();
    }
    FourWheeler(int a){
        super(a);
    }
    int getData(){
        return this.yearOfManufacture;
    }
    void putData(int a){
        this.yearOfManufacture =a;
    }
}

class MyTwoWheeler extends TwoWheeler{
    MyTwoWheeler(){
        super();
    }
    MyTwoWheeler(int a){
        super(a);
    }
    void putData(int a){
        super.putData(a);
    }
}

class Vehicle_P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyTwoWheeler mtw = new MyTwoWheeler();
        System.out.print("Enter the year of manufacture of your two wheeler : ");
        int a = sc.nextInt();
        mtw.putData(a);
        System.out.println("The year of manufacture of my two wheeler is : " + mtw.getData());

        System.out.print("Enter the year of manufacture of the four wheeler : ");
        int b = sc.nextInt();
        FourWheeler fw = new FourWheeler(b);
        System.out.println("The year of manufacture of the four wheeler is : " + fw.getData());


    }
}
