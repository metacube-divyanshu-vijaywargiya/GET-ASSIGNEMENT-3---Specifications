package com.metacube;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("Enter number of students : ");
			int numberOfStudents = scanner.nextInt();
			
			if (numberOfStudents<=0) {
				throw new ArithmeticException("Number of Students must be greater than 0.");
			}
			
			double[] grades =new double[numberOfStudents];
			System.out.println("Enter grades for " + numberOfStudents + " Students : ");
			
			for (int i=0;i<numberOfStudents;i++) {
				System.out.println("Enter grade for " + (i+1) + " Student : ");
				grades[i]= scanner.nextDouble();
				if (grades[i] < 0 || grades[i] > 100) {
					throw new ArithmeticException("Grade must lie in 0-100.");
				}
			}
			
			MarkSheetCalculator markSheetCalculator = new MarkSheetCalculator();
			System.out.println("Average Grade : " + markSheetCalculator.calculateAverageGrade(grades));
			System.out.println("Maximum Grade : " + markSheetCalculator.calculateMaximumGrade(grades));
			System.out.println("Minimum Grade : " + markSheetCalculator.calculateMinimumGrade(grades));
			System.out.println("Passed Students(%) : " + markSheetCalculator.calculatePercentageStudentPassed(grades));
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input. Please Enter Only Integer for Number of Students and Grades.");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			scanner.close();
		}
		
	}

}
