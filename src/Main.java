import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*    (Compute the volume of a cylinder) Write a program that reads in the radius
    and length of a cylinder and computes the area and volume using the following formulas:
        area = radius * radius * pi
        volume = area * length

                */

        //Creating Scanner object
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159265359;
        double area,volume;

        // Prompt user to enter the radius and length of a cylinder

        System.out.println("Enter the radius");
        double radius= sc.nextDouble();
        System.out.println("Enter the length");
        double length=sc.nextDouble();

    // Comput the area and volume

            area = radius*PI;
            volume = area*length;

            // Display result

        System.out.println("Area of cylider is  "+area);
        System.out.println("Volume of cylider is  "+volume);










    }
}