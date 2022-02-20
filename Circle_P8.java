package OOPSLab;

import java.util.Scanner;
import java.lang.Math;

class Circle{

    double radius;

    Circle(){
        this.radius = 0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    double circleArea(){
        return (Math.PI * this.radius * this.radius);
    }
}

class Sector extends Circle{

    double angle;
    Sector(){
        super();
        this.angle = 0;
    }
    Sector(double angle, double radius){
        super(radius);
        this.angle = angle;
    }

    double sectorArea(){
        return (0.5 * this.radius * this.radius * this.angle);
    }
}

class Segment extends Circle{

    double length;
    Segment(){
        super();
        this.length = 0;
    }
    Segment(double length,double radius){
        super(radius);
        this.length = length;
    }
    double segmentArea(){
        double h = this.radius - Math.pow(Math.pow(this.radius, 2) - Math.pow((this.length / 2), 2), 0.5);
        return ((h / (6 * this.length)) * ((3 * h * h) + (4 * this.length * this.length)));
    }
}

class Circle_P8 {

    public static void main(String[] args) {
        double a, r, l;
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Enter.
                    1. For Circle
                    2. For Sector
                    3. For Segment
                    4. To Exit
                    """);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Radius of the Circle : ");
                    r = sc.nextDouble();
                    Circle c1 = new Circle(r);
                    System.out.println("The Area of the Circle is: " + c1.circleArea());
                    break;
                case 2:
                    System.out.println("Enter the Radius of the Circle : ");
                    r = sc.nextDouble();
                    System.out.println("Enter the Angle of Sector in Radians : ");
                    a = sc.nextDouble();
                    Sector s1 = new Sector(a, r);
                    System.out.println("The Area of the Sector of the Circle is: " + s1.sectorArea());
                    System.out.println("The Area of the Circle is: " + s1.circleArea());
                    break;
                case 3:
                    System.out.println("Enter the Radius of the Circle : ");
                    r = sc.nextDouble();
                    System.out.println("Enter the Length of Segment of the Circle : ");
                    l = sc.nextDouble();
                    Segment s2 = new Segment(l, r);
                    System.out.println("The Area of the Segment of the Circle is: " + s2.segmentArea());
                    System.out.println("The Area of the Circle is: " + s2.circleArea());
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
