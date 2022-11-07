import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // area of the circle segment formula is : (𝜋 * (r*r) * 𝛼) / 360

        double radius,angle,pi = 3.14;
        System.out.println("Enter the radius = ");
        radius = input.nextDouble();
        System.out.println("Enter the measure of the center angle");
        angle = input.nextDouble();

        double area = (pi * (radius * radius) * angle) / 360;
        System.out.println("Area of the Circle is : " + area);
    }

}
