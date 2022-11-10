import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        Circle circle = new Circle(scanner.nextInt());
        Circle.area(circle.radius, circle.getPi());
        Circle.circumference(circle.radius, circle.getPi());
    }
}