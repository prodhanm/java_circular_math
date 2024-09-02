/*
 * 
 * Properties of a Circle
 * Author: Mustafa Prodhan
 * Date: 9/12/2017
 * Derived from the Arizona State University CSE 110 Lab 01
 * 
 * The purpose of this program is to track this lab as work done in class.
 * This version is more of a modified version of the original lab.
 * It is already done and graded at 100%. 
 */

import java.util.Scanner;
 public class Circle {
    public static void main(String[] args) {
        double radius;
        double diameter;
        double area;
        double circumference;
        double semiArea;
        
        Scanner circ = new Scanner(System.in);
        radius = circ.nextDouble();
        diameter = radius * 2;
        area = Math.PI * Math.pow(radius, 2);
        circumference = Math.PI * diameter;
        semiArea = area / 2;

        System.out.println("Properties of a Circle");
        System.out.println("Radius             : " + radius);
        System.out.print("Diameter           : ");
        System.out.printf("%.1f", diameter);
        System.out.println("");
        System.out.print("Circumference      : ");
        System.out.printf("%.5f", circumference);
        System.out.println("");
        System.out.print("Area               : " );
        System.out.printf("%.8f", area);
        System.out.println("");
        System.out.print("Area of Semicircle : ");
        System.out.printf("%.9f", semiArea);
        System.out.println("");
        System.out.println("");
        System.out.println("Properties \"Rounded\" Down");
        System.out.println("Radius             : " + Math.round(radius -0.5));
        System.out.println("Diameter           : " + Math.round(diameter -0.5 ));
        System.out.println("Circumference      : " + Math.round(circumference -0.5));
        System.out.println("Area               : " + Math.round(area -0.5));
        System.out.println("Area of Semicircle : " + Math.round(semiArea -0.5));
        System.out.println("");
        System.out.println("Properties \"Rounded\" Up");
        System.out.println("Radius             : " + Math.round(radius));
        System.out.println("Diameter           : " + Math.round(diameter ));
        System.out.println("Circumference      : " + Math.round(circumference));
        System.out.println("Area               : " + Math.round(area));
        System.out.println("Area of Semicircle : " + Math.round(semiArea));
        circ.close();
    }
 }