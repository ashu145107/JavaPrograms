import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        if (name.equals("S")) {
            int length = Integer.parseInt(s.nextLine());
            Square square = new Square();
            square.setLength(length);
            System.out.println("Perimeter : " + square.perimeter());
            System.out.println("Area : " + square.area());
        }
        else if (name.equals("R")) {
            int length = Integer.parseInt(s.nextLine());
            int width = Integer.parseInt(s.nextLine());
            Rectangle square = new Rectangle();
            square.setLength(length);
            square.setWidth(width);
            System.out.println("Perimeter : " + square.perimeter());
            System.out.println("Area : " + square.area());
        }
        else if (name.equals("C")) {
            int length = Integer.parseInt(s.nextLine());
            Circle square = new Circle();
            square.setRadius(length);
            System.out.println("Circumference : " + square.perimeter());
            System.out.println("Area : " + square.area());
        }
        else if (name.equals("T")) {
            int length = Integer.parseInt(s.nextLine());
            int width = Integer.parseInt(s.nextLine());
            int Radius = Integer.parseInt(s.nextLine());
            Triangle square = new Triangle();
            square.setLength(length);
            square.setWidth(width);
            square.setRadius(Radius);
            System.out.println("Perimeter : " + square.perimeter());
            System.out.println("Area : " + square.area());
        }
    }
}