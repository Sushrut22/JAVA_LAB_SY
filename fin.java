import java.util.Scanner;

final class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public final double area() {
        return length * breadth;
    }
}

public class fin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double breadth = input.nextDouble();

        Rectangle rectangle = new Rectangle(length, breadth);
        double area = rectangle.area();

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
        input.close();
    }
}