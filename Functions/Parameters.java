package Functions;

public class Parameters {

    public static void main(String args[]) {
        double area = rectangleArea(2.4, 3.7);
        System.out.println("area of rect is " + area);
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

}
