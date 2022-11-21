package HW2chris;

public class menu {

	public static void main(String[] args) {
		System.out.printf("%20S", "\t\t\t\t----------Specialty Sushi----------\n");
		String format = "%-6d%16S%8.2f%-6S";
		String middle = "  |  ";
		String line = "-----------------------------------------------------";
		int n = 1;
		System.out.println("\t\t\t\t\t    631-555-1234");
		System.out.println(line + line);
		String item1 = "Tuna Roll";
		String item1Price = "6.99";
		String item1Line = "   Fresh Tuna, Rice, Seaweed";
		String item2 = "Salmon Roll";
		String item2Price = "8.99";
		String item2Line = "  Fresh Salmon, Rice, Seaweed";
		String item3 = "Dragon Roll";
		String item3Price = "10.99";
		String item3Line = "  Eel, Cucumber, Seaweed";
		String item4 = "Eel Avocado Roll";
		String item4Price = "9.99";
		String item4Line = "   Eel, Avocado, Seaweed";
		String item5 = "Spicy Tuns Roll";
		String item5Price = "8.99";
		String item5Line = "  Spicy Tuna, Seaweed";
		String item6 = "Crunchy Roll";
		String item6Price = "8.49";
		String item6Line = "  Spicy Tuna, White Tuna";
	
//		System.out.println();
		
		System.out.printf(format, n, item1, item1Price, middle);
		System.out.printf(format, ++n, item2, item2Price, middle);
		System.out.printf(format, ++n, item3, item3Price, middle);
		System.out.println();
		System.out.printf("%-30S", item1Line);
		System.out.print(middle);
		System.out.printf("%-31S", item2Line);
		System.out.print(middle);
		System.out.printf("%-31S", item3Line);
		System.out.print(middle);
		System.out.println();
		System.out.println(line + line);
		System.out.printf(format, ++n, item4, item4Price, middle);
		System.out.printf(format, ++n, item5, item5Price, middle);
		System.out.printf(format, ++n, item6, item6Price, middle);
		System.out.println();
		System.out.printf("%-30S", item4Line);
		System.out.print(middle);
		System.out.printf("%-31S", item5Line);

		System.out.print(middle);
		System.out.printf("%-31S", item6Line);

		System.out.print(middle);
		System.out.println();
		System.out.println(line + line);
		
		String item7 = "Veggie Roll";
		String item7Price = "5.99";
		String item7Line = "   Avocado, Cabbage, Mango";
		String item8 = "California Roll";
		String item8Price = "6.99";
		String item8Line = "  Crab, Avocado, Mango";
		String item9 = "Rainbow Roll";
		String item9Price = "7.69";
		String item9Line = "  Tofu, Carrots, Cucumber";

		
		
		System.out.printf(format, ++n, item7, item7Price, middle);
		System.out.printf(format, ++n, item8, item8Price, middle);
		System.out.printf(format, ++n, item9, item9Price, middle);
		System.out.println();
		
		System.out.printf("%-30S", item7Line);
		System.out.print(middle);
		System.out.printf("%-31S", item8Line);

		System.out.print(middle);
		System.out.printf("%-31S", item9Line);

		System.out.print(middle);
		
		System.out.println();
		System.out.println(line + line);
		

	}

}

