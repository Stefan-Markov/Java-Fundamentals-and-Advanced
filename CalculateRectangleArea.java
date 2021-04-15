import java.util.Scanner;

public class CalculateRectangleArea {

    public static double getArea(double width, double height) {

        return width * height;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int calculateArea = width * height;

        System.out.println(calculateArea);
    }
}
