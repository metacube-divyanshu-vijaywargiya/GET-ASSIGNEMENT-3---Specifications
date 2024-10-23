package com.metacube;

public class MarkSheetCalculator {
	
	/**
	 * To calculate Average Grade
	 * @param grades array of grade students scored to calculate average grade
	 * @return double average grade from grades arrays
	 * @throws ArithmeticException if no grades array is empty or null
	 */
	public double calculateAverageGrade(double [] grades) throws ArithmeticException {
		if (grades == null || grades.length == 0) {
			throw new ArithmeticException("No Grades Available for calculating Average.");
		}
		
		double gradeSum = 0;
		
		for (double grade : grades) {
			gradeSum += grade;
		}
		
		double AverageGrade = gradeSum/grades.length;
		return AverageGrade;
	}
	
	/**
	 * To calculate Maximum Grade
	 * @param grades array of grade students scored to calculate maximum grade
	 * @return double maximum grade from grades array
	 * @throws ArithmeticException if no grades array is empty or null
	 */
	public double calculateMaximumGrade(double[] grades) throws ArithmeticException {
		if (grades.length == 0 || grades == null) {
			throw new ArithmeticException("No Grades Available for Calculating Maximum Marks.");
		}
		
		double maximumGrade = grades[0];
		
		for (double grade : grades) {
			if(grade  >maximumGrade) {
				maximumGrade = grade;
			}
		}
		
		return maximumGrade;
	}
	
	/**
	 * To calculate Minimum grade
	 * @param grades array of grade students scored to calculate minimum grade 
	 * @return double minimum grade from grades array
	 * @throws ArithmeticException if no grades array is empty or null
	 */
	public double calculateMinimumGrade(double[] grades) throws ArithmeticException {
		if (grades.length == 0 || grades == null) {			
			throw new ArithmeticException("No Grades Available for Calculating Minimum Marks.");
		}
		
		double minimumGrade = grades[0];
		
		for (double grade : grades) {
			if (grade < minimumGrade) {
				minimumGrade = grade;
			}
		}
		
		return minimumGrade;
	}
	
	/**
	 * To calculate percentage of students passed
	 * @param grades array of grade students scored to calculate percentage of students passed
	 * @return double percentage of students passed
	 * @throws ArithmeticException if no grades array is empty or null
	 */
	public double calculatePercentageStudentPassed(double[] grades) throws ArithmeticException {
		if (grades.length == 0 || grades == null) {			
			throw new ArithmeticException("No Grades Available for Calculating Percentage of students passed.");
		}
		
		double passedStudentCount = 0;
		
		for (double grade : grades) {
			if (grade >= 40) {
				passedStudentCount++;
			}
		}
		
		double totalStudents = grades.length;
		return (passedStudentCount/totalStudents)*100;
	}
}
