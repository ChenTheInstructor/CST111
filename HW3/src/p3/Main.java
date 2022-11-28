package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double n1 = getNumber();
		showResult(square(n1));
//		double n2 = getNumber();
//		double n3 = getNumber();
//		showResult(getAverage(n1, n2, n3));
//		double result1 = add(n1, n2);
//		double result2 = subtract(4, 3);
//		double result3 = divide(4, 3);
//		double result4 = divide(n1, n2);
//		showResult(result1);
//		showResult(result2);
//		showResult(result3);
//		showResult(result4);
//		showResult(result1, result2, result3, result4);
	}
	
	public static double square(double n) {
		return n * n;
	}
	
	public static double getAverage(double x, double y, double z) {
		return (x + y + z)/ 3;
	}
	
	public static double getAverage(double x, double y) {
		return (x + y)/ 2;
	}
	
	public static void showResult(double result) {
		System.out.printf("%5.2f%n", result);
	}
	
	public static void showResult(double n1, double n2, double n3, double n4) {
		System.out.printf("%8.2f%8.2f%8.2f%8.2f%n", n1, n2, n3, n4);
	}

	public static double getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return scanner.nextDouble();
	}

	public static double divide(double x, double y) {
		return x / y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static double multiply(double n1, double n2) {
		return n1 * n2;
	}

	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtract(double n1, double n2) {
		return n1 - n2;
	}

	

}
