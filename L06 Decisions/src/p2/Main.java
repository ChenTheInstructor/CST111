package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double score = getScore();
		System.out.println("The score entered is: " + score);
		String letterGrade = getLetterGrade(score);
		System.out.println("The letter grade is: " + letterGrade);
		showComments(letterGrade);

	}
	
	public static void showComments(String letterGrade) {
		if(letterGrade.equals("A")) {
			System.out.println("Excellent!");
		} else if(letterGrade.equals("B")) {
			System.out.println("Good!");
		} else if(letterGrade.equals("C")) {
			System.out.println("Not bad!");
		} else if(letterGrade.equals("D")) {
			System.out.println("Not good!");
		} else {
			System.out.println("Pretty bad.");
		}
	}

	public static String getLetterGrade(double score) {
		String letterGrade = "";
		if (score >= 90) {
			letterGrade = "A";
		} else if (score >= 80) {
			letterGrade = "B";
		} else if (score >= 70) {
			letterGrade = "C";
		} else if (score >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}

	public static double getScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your test score: ");
		return scanner.nextDouble();
	}

}
