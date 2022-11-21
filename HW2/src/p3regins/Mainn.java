package p3regins;

public class Mainn {

	// TODO Auto-generated method stub
	static String item1 = "Party Roll";
	static float item1price = 12;
	static String item2 = "Eel Roll";
	static double item2price = 8.50;
	static String item3 = "Kentucky roll";
	static float item3price = 14;
	static String item4 = "Crab Ragoon Roll";
	static double item4price = 9.50;
	

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		String format = "\t\n%-20s%-15.2f%-20s%-15.2f";
		System.out.println("\t\t   SPECIALITY SUSHI");
		System.out.println("\tAll speciality sushi made with sushi rice");

		System.out.println("-----------------------------------------------------------------");
		
		System.out.printf(format, item1, item1price, item3, item3price);

	
		System.out.printf(format, item2, item2price, item4, item4price);
		// System.out.printf(format, "Dragon Roll", 9.50, "Fried Scallop Roll", 9.00);
		System.out.println("\n-----------------------------------------------------------------");

		System.out.println("\nINGREDIENTS");

		System.out.println("*Party Roll: Smoked salmon, fried cream cheese,grilled jalapeno,avocado");
		System.out.println("\n*Eel Roll: Cooked eel , cucumber,avocado");
		System.out.println("\n*Dragon Roll: Cooked eel,cucumber,seaweed,sushi sauce");
		System.out.println("\n*Kentucky Roll: Spicy lobster, soy paper and carrot");
		System.out.println("\n*Crab Ragoon Roll: Crab and cream cheese blend");
		System.out.println("\n*Fried Scallop Roll: Soy paper , Fried scallop,Avocado");

	}

}
