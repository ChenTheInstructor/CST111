package p3;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		String name = getName();
		double gpa = getGPA();
		double curvedGPA = getCurvedGPA(gpa);
		showHeader();
		show(name, gpa, curvedGPA);
	}
	
	public static void showHeader() {
		System.out.printf("%-10s%10s%10s%n", "name", "GPA", "CurvedGpa");
	}
	
	public static void show(String name, double gpa, double curvedGpa) {
		System.out.printf("%-10s%10.2f%10.2f%n", name, gpa, curvedGpa);
	}
	
	public static double getCurvedGPA(double gpa) {
		return gpa + 0.5;
	}
	
	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		return scanner.nextLine();
	}
	
	public static double getGPA() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your GPA: ");
		return scanner.nextDouble();
	}

}
