package ehsan;

public class Newcode {
	
		static String itemFormat = "\t%-40s%-10s%-40s%6s%n";
		static String detailFormat = "\t%-40s%-10s%-40s%n";
		static String item1 = "Party Roll";
		static String item1Price = "12";
		static String item2 = "Kentucky Roll";
		static String item2Price = "14";
		static String item1Line1 = "Smoked Salmon, Fried Cream Cheese";
		static String item2Line1 = "Spicy lobster, soy paper and carrot topped";
		static String item1Line2 = "grilled jalapeno, avocado; topped with";
		static String item2Line2 = "with seared Tuna, salmon, avocado, sushi";
		static String item1Line3 = "spicy crab, sweet chilli sauce, tempura";
		static String item2Line3 = "sauce, scallions and spicy mayo.";
		static String item1Line4 = "crunch and skallions.";
		static String item2Line4 = "";
		
		static String item3 = "Dragon Roll";
		static String item3Price = "9";
		static String item4 = "Fried Scallop  Roll";
		static String item4Price = "9";
		static String item3Line1 = "Cooked eel, cucumber, seaweed, sushi";
		static String item4Line1 = "Soy paper, fried scallop, avocado;topped";
		static String item3Line2 = "sauce; wrapped in avocado and sesame.";
		static String item4Line2 = "with red tobiko and spicy mayo.";
		
		static String item5 = "Rainbow Roll";
		static String item5Price = "11";
		static String item6 = "Volcano Roll";
		static String item6Price = "9";
		static String item5Line1 = "California; topped with tuna, salmon,";
		static String item6Line1 = "California, topped with ground spicy tuna";
		static String item5Line2 = "shrimp, white tuna and yellow tail.";
		static String item6Line2 = "and black tobiko.";
		
		public static void main(String[] args) { // main method
//			
			
			showLine();
			displayBanner();
			showBlankLines();
			showItems (item1, item1Price, item2, item2Price, item1Line1, item2Line1, item1Line2, item2Line2, item1Line3, item2Line3, item1Line4, item2Line4);
			showBlankLine();
			show2Items(item3, item3Price, item4, item4Price, item3Line1, item4Line1, item3Line2, item4Line2);
			showBlankLine();
			show3Items(item5, item5Price, item6, item6Price, item5Line1, item6Line1, item5Line2, item6Line2);
			showBlankLine();
			showLine();
			
		}

		public static void showItems(String item1, String item1Price, String item2, String item2Price, 
			String item1Line1, String item2Line1, String item1Line2, String item2Line2, String item1Line3, String item2Line3, String item1Line4, String item2Line4) {
			System.out.printf(itemFormat, item1, item1Price, item2, item2Price);
			System.out.printf(detailFormat, item1Line1, " ", item2Line1);
			System.out.printf(detailFormat, item1Line2, " ", item2Line2);
			System.out.printf(detailFormat, item1Line3, " ", item2Line3);
			System.out.printf(detailFormat, item1Line4, " ", item2Line4);
		}
		public static void show2Items(String item1, String item1Price, String item2, String item2Price, 
			String item1Line1, String item2Line1, String item1Line2, String item2Line2) {
			System.out.printf(itemFormat, item1, item1Price, item2, item2Price);
			System.out.printf(detailFormat, item1Line1, " ", item2Line1);
			System.out.printf(detailFormat, item1Line2, " ", item2Line2);
		}
		public static void show3Items(String item5, String item5Price, String item6, String item6Price, String item5Line1, String item6Line1, String item5Line2, String item6Line2) {
		System.out.printf (itemFormat, item5, item5Price, item6, item6Price);
		System.out.printf (detailFormat, item5Line1," ", item6Line1);
		System.out.printf (detailFormat, item5Line2," ", item6Line2);
		}	
		
		private static void displayBanner() { // method
			System.out.printf("%n\t%-30S\n", "Specialty Sushi");
			System.out.println();
			System.out.printf("\t%-30s%n", "All speciality sushi made with sushi rice");
		}

		public static void showLine() {
			System.out.println("---------------------------------------------------------------------------------------------------------");
		}

		public static void showBlankLines() {
			System.out.println("\n\n");
		}
		public static void showBlankLine() {
			System.out.println();
		}
	}




