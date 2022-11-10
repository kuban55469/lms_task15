public class Circle {
    /*
    Circle деген класс тузунуз, анын PI деген свойствасы, area
жана circumference деген статик методдору болсун.
area ны табуу учун: PI * (radius * radius)
circumference ти табуу учун PI * 2 * radius деген формулалар колдонулат
     */
    private final double pi = 3.14;
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void area(int radius,double pi){
        double area = pi * (radius * radius);
        System.out.println("Area = " + area);
    }
    public static void circumference(int radius, double pi){
        double circumference = pi * 2 * radius;
        System.out.println("Circumference = " + circumference);
    }
}
