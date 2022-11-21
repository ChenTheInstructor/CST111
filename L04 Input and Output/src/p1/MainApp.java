package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		requestString("gpa");
		double gpa = getGpa();
		
		requestString("name");
		String name = getName();
		
		requestString("age");
		int age = getAge();
		
		System.out.println("The name is " + name);
		System.out.println("The GPA is: " + gpa);
		System.out.println("The age is " + age);
	}
	
	public static int getAge() {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		return age;
	}
	
	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		return name;
	}
	
	public static void requestString(String something) {
		System.out.println("Enter a(n) " + something + ": ");
	}
	
	public static double getGpa() {
		Scanner scanner = new Scanner(System.in);
		double gpa = scanner.nextDouble();
		return gpa;
	}
}
