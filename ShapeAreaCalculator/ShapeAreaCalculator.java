package com.metacube;

public class ShapeAreaCalculator {
	public static final double PI = 3.14;
	/**
	 * To calculate triangle area
	 * @param width given as an argument to calculate triangle's area
	 * @param height given as an argument to calculate triangle' area
	 * @return double area of triangle
	 * @throws ArithmeticException if height or width less than or equals to 0
	 */
	public double calculateTriangleArea(double width , double height) throws ArithmeticException {
		if( width == 0 || height ==0 ) {
			throw new ArithmeticException();
		}
		
		return 0.5*height*width;
	}
	
	/**
	 * To calculate rectangle area
	 * @param width given as an argument to calculate rectangle's area
	 * @param height given as an argument to calculate rectangle's area
	 * @return double area of rectangle
	 * @throws ArithmeticException if height or width less than or equals to 0
	 */
	public double calculateRectangleArea(double width, double height) throws ArithmeticException {
		if ( width ==0 || height ==0 ) {
			throw new ArithmeticException();
		}
		
		return width*height;
	}
	
	/**
	 * To calculate square area
	 * @param sideOfSquare given as an argument to calculate square's area
	 * @return double area of square
	 * @throws ArithmeticException if side less than or equals to 0
	 */
	public double calculateSquareArea(double sideOfSquare) throws ArithmeticException {
		if( sideOfSquare == 0 ) {
			throw new ArithmeticException();
		}
		return sideOfSquare*sideOfSquare;
	}
	
	/**
	 * To calculate circle area
	 * @param radius given as an argument to calculate circle's area
	 * @return double area of circle
	 * @throws ArithmeticException if radius less than or equals to 0
	 */
	public double calculateCircleArea(double radius) throws ArithmeticException {
		if( radius == 0 ) {
			throw new ArithmeticException();
		}
		
		return PI*radius*radius;
	}
	
	

}
