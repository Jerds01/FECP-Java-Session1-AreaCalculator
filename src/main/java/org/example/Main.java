package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static double calculateCircleArea(double radius){
        return Math.PI*radius*radius;
    }
    public static double calculateTriangleArea(double base, double height){
        return (0.5 * base * height);
    }
    public static double calculateRectangleArea(double length, double width){
        return length*width;
    }




    public static void main(String[] args) {

        double radius;
        double base;
        double height;
        double length;
        double width;
        double result;
        int shapeChosen;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        shapeChosen = scanner.nextInt();

        switch (shapeChosen){
            case 1:
                System.out.print("Enter the radius: ");
                radius = scanner.nextDouble();
                result = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f", result);
                break;
            case 2:
                System.out.print("Enter the base: ");
                base = scanner.nextDouble();
                System.out.print("Enter the height: ");
                height = scanner.nextDouble();
                result = calculateTriangleArea(base,height);
                System.out.printf("Area of the triangle: %.2f",result);
                break;
            case 3:
                System.out.print("Enter the length: ");
                length = scanner.nextDouble();
                System.out.print("Enter the width: ");
                width = scanner.nextDouble();
                result = calculateRectangleArea(length,width);
                System.out.printf("Area of the rectangle: %.2f", result);
                break;

        }
    }
}