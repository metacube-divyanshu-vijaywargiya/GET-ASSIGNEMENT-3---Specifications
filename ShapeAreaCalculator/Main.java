package com.metacube;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ShapeAreaCalculator areaCalculator = new ShapeAreaCalculator();
		Scanner scanner = new Scanner(System.in);

		System.out.println(" 1. Circle \n 2. Rectangle \n 3. Square \n 4. Triangle");
		System.out.println(" Choose a Shape to calculate Area : ");
		
		int choice = scanner.nextInt();
		
		switch (choice) {
		
		case 1: 
			try {	
				System.out.println("Enter Radius : ");
				double radius = scanner.nextDouble();
				
				System.out.println("Area for circle of Radius = " + radius + " is : " + areaCalculator.calculateCircleArea(radius));
				break; 
				
			} catch (ArithmeticException e) {
				System.out.println("Radius of circle must be greater than 0.");
				break;
			}
			
		case 2: 
			try {		
				System.out.println("Enter height of Rectangle : ");
				double height = scanner.nextDouble();
				
				System.out.println("Enter Width of Rectangle : ");
				double width = scanner.nextDouble();
				
				System.out.println("Area of Rectangle with Height = " + height + " & Width = " + width + " is : " + areaCalculator.calculateRectangleArea(width, height));
				break; 
				
			} catch (ArithmeticException e) {
				System.out.println("Height or width of rectangle must be greater than 0.");
				break;
			}
			
		case 3:
			try {
				System.out.println("Enter Side : ");
				double sideOfSquare = scanner.nextDouble();
				
				System.out.println("Area of square with Side = " + sideOfSquare + " is : " + areaCalculator.calculateSquareArea(sideOfSquare));
				break;
				
			} catch (ArithmeticException e) {
				System.out.println("Side of Square must be greater than 0.");
				break;
			}
			
		case 4:
			try {
				System.out.println("Enter Height of Triangle : ");
				double heightOfTriangle = scanner.nextDouble();
				
				System.out.println("Enter Width of Triangle : ");
				double widthOfTriangle = scanner.nextDouble();
				
				System.out.println("Area of Triangle with Height = " + heightOfTriangle + " & Width = " + widthOfTriangle + " is : " + areaCalculator.calculateTriangleArea(widthOfTriangle, heightOfTriangle));
				break;			
				
			} catch (ArithmeticException e) {
				System.out.println("Height or Width of Triangle must be greater than 0.");
				break;
			}
			
			default: 
				System.out.println("Invalid option.");
		}
		
		scanner.close();
	}
}
