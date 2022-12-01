package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int temp = getTemperature();
		decideWhatToWear(temp);
	}

	public static int getTemperature() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature outside: ");
		return scanner.nextInt();
	}

	public static void decideWhatToWear(int temperature) {
		if (temperature >= 80) {
			System.out.println("Wear shorts.");
		} else if (temperature >= 50) {
			System.out.println("Wear long sleeves");
		} else {
			System.out.println("Wear a sweater");
		}
	}

}
