import java.util.Scanner;

interface Area {
    void area(double l, double b); // For rectangle
}

class rectangle implements Area {
    public void area(double l, double b) { // Implementing for rectangle
        System.out.println("Area of rectangle is " + (l * b));
    }
}

class circle implements Area {
    // Overloaded method for circle
    public void area(double r) { 
        System.out.println("Area of circle is " + (Math.PI * r * r));
    }

    // This method is required by the interface but won't be used
    public void area(double l, double b) {
        System.out.println("This method is not needed for circle.");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle Area
        System.out.println("Enter length and breadth of rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        rectangle rect = new rectangle();
        rect.area(l, b); // Calls rectangle's area method

        // Circle Area
        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();
        circle c = new circle();
        c.area(r); // Calls the overloaded method for circle
    }
}