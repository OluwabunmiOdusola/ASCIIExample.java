package com.bptn.course.week1;

public class ElseIf {

	public static void main(String[] args) {
		/*int testScore = 76;
		char grade;

		if (testScore >= 90) {
		  grade = 'A';
		} else if (testScore >= 80) {
		  grade = 'B';
		} else if (testScore >= 70) {
		  grade = 'C';
		} else if (testScore >= 60) {
		  grade = 'D';
		} else {
		  grade = 'F';
		}

		System.out.println("Your grade is a " + grade);
		// Because testScore is greater than 70, but less than 80, the output will be: Your grade is a C
	}

}*/

		/*boolean studied = true;
		boolean wellRested = true;

		if (wellRested) {
		  System.out.println("Best of luck today!");
		  if (studied) {
		    System.out.println("You are prepared for your exam!");
		  } else {
		    System.out.println("Study before your exam!");
		  }
		}*/
		
		int testScore = 62;
		char grade;

		if (testScore >= 90) {
		  grade = 'A';
		} else if (testScore >= 80) {
		  grade = 'B';
		} else if (testScore >= 70) {
		  grade = 'C';
		} else if (testScore >= 60) {
		  grade = 'D';
		} else {
		  grade = 'F';
		}
		System.out.println("Your grade is " + grade);
		
		
	}
}