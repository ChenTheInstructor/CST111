package p1_menu_wilson;

public class Main {

	static String format = "\t%-40S%-10s%-40S%-10s%n";
	static String format2 = "\t%-40s%-10s%-40s%n";
        
	static String item1 = "Party Roll";
	static String price1 = "12";
	static String item2 = "Kentucky Roll";
	static String price2 = "14";
        
	static String i1l1 = "Smoked salmon, fried cream cheese,";
	static String i1l2 = "grilled jalapeno, avocado topped with";
        static String i1l3 = "spicy crab, sweet chill sauce, tempura";
        static String i1l4 = "crunch and scallions";
	
        static String i2l1 = "Spicy lobster, soy paper and carrot topped";
	static String i2l2 = "with seared tuna, salmon, avocado, sushi";
	static String i2l3 = "sauce, scallions and spicy mayo";
        
	static String item3 = "Eel Roll";
	static String price3 = "8.50";
	static String item4 = "Crab Rangoon Roll";
	static String price4 = "9.50";
        
	static String i3l1 = "Cooked eel, cucumber, avocado, seaweed,";
	static String i3l2 = "sesame seeds, sushi sauce";
        
	static String i4l1 = "Crab and cream cheese blend, seaweed,";
	static String i4l2 = "tempura-fried, topped with sushi sauce";
        static String i4l3 = "and sweet chili sauce";
        
        static String item5 = "Dragon Roll";
	static String price5 = "9.50";
	static String item6 = "Fried Scallop Roll";
	static String price6 = "9";
        
	static String i5l1 = "Cooked eel, cucumber, seaweed,";
	static String i5l2 = "sushi sauce; wrapped in avocado";
        static String i5l3 = "and sesame seeds";
	
        static String i6l1 = "Soy paper, fried scallop, avocado: topped";
	static String i6l2 = "with red tobiko and spicy mayo";
        
        static String item7 = "Fantasy Roll (Spicy)";
	static String price7 = "9";
	static String item8 = "Tempura Rainbow Roll";
	static String price8 = "12";
        
	static String i7l1 = "Avocado, seaweed, sesame seeds: topped";
        static String i7l2 = "with snow crab and spicy mayo; choice";
	static String i7l3 = "of tuna, salmon, shrimp,";
        static String i7l4 = "yellow tail or white tuna";
        
	static String i8l1 = "Tempura shrimp, avocado, spicy mayo,";
	static String i8l2 = "seaweed; topped with shrimp, salmon,";
        static String i8l3 = "white tuna and tuna";
                
        static String item9 = "Rainbow Roll";
	static String price9 = "11";
	static String item10 = "Volcano Roll";
	static String price10 = "8.50";
        
	static String i9l1 = "California; topped with tuna, salmon,";
	static String i9l2 = "shrimp, white tuna and yellow tail";
        
	static String i10l1 = "California, topped with ground spicy tuna";
	static String i10l2 = "and black tobiko";
        
        static String item11 = "New York Roll";
	static String price11 = "12";
	static String item12 = "Chicago Roll";
	static String price12 = "11";
        
	static String i11l1 = "Tuna, avocado, seaweed: topped with tuna";
	
	static String i12l1 = "Soy paper, seared filet mignon, asparagus,";
	static String i12l2 = "scallions, cream cheese; topped with";
        static String i12l3 = "avocado, spicy mayo and Aqua sauce";
                
        static String item13 = "Boston Roll";
	static String price13 = "11";
	static String item14 = "Crunchy Texas Roll";
	static String price14 = "12";
        
	static String i13l1 = "Salmon, avocado, seaweed, topped:";
	static String i13l2 = "with salmon";
	
        static String i14l1 = "Seared white tuna, avocado, seaweed,";
	static String i14l2 = "topped with crab, fried onion, sushi sauce";
        static String i14l3 = "and spicy mayo";
        
        
        static String item15 = "Tuna Lover's Roll";
	static String price15 = "12";
	static String item16 = "Yum Yum Roll";
	static String price16 = "12";
        
	static String i15l1 = "Spicy tuna, avocado, seaweed: topped with";
	static String i15l2 = "seared white tuna";
        
	static String i16l1 = "Spicy craefish, jaiapeno, cucumber,";
	static String i16l2 = "topped with shrimp, seaweed salad, red";
        static String i16l3 = "tobiko and yum yum sauce";
        
        static String item17 = "Soft Shell Crab Roll";
	static String price17 = "11";
	static String item18 = "Tuna Stack";
	static String price18 = "12";
        
	static String i17l1 = "Ternpura soft shell crab, lettuce, avocado,";
	static String i17l2 = "seaweed, topped with sushi sauce and";
	static String i17l3 = "sweet chili sauce";
        
        static String i18l1 = "Spicy tuna, mango and avocado layered";
	static String i18l2 = "on sushi rice: citrus ponzu sauce, scallions";
        static String i18l3 = "and microgreens";
        
        static String item19 = "Midori Roll";
	static String price19 = "9";
	static String i19l1 = "Soy paper, tuna, salmon, avocado; topped";
	static String i19l2 = "with sushi sauce and spicy mayo";
	
        static String item20 = "Poke Bowl";
	static String price20 = "12";
	static String item21 = "Crunchy Munchy Roll";
	static String price21 = "11";
        
	static String i20l1 = "Sushi rice, pickled radish and carrot,";
	static String i20l2 = "jalapeno, wasabi mayo, Sriracha, wakame,";
	static String i20l3 = "citrus ponzu sauce, sesame seeds; choice";
        static String i20l4 = "of tune or salmon";
        
        static String i21l1 = "Fried crab, cucumber, avocado, seaweed,";
	static String i21l2 = "Sriracha: topped with tempura crunch";
        static String i21l3 = "shrimp and sushi sauce";
        
        static String item22 = "Teriyaki Chicken Bowl";
	static String price22 = "10";
	static String item23 = "Surf and Turf Roll";
	static String price23 = "12";
        
	static String i22l1 = "Teriyaki chicken, sushi rice, fried";
	static String i22l2 = "asparagus, cucumber, carrot, avocado,";
        static String i22l3 = "sushi sauce, Sriracha, sesame seeds";
                
	static String i23l1 = "Crab and cream cheese blend, spicy";
	static String i23l2 = "mayo, asparagus, seaweed: topped with";
        static String i23l3 = "avocado, seared filet mignon, Sriracha";
        static String i23l4 = "and sushi sauce";
                
    public static void main(String[] args) {
        		
		
		dividedLine();
		displayBanner();
		showBlankLines();
		show2Items(item1, price1, item2, price2, i1l1, i1l2, i1l3, i1l4, i2l1, i2l2, i2l3, "");
		showBlankLine();
		show2Items(item3, price3, item4, price4, i3l1, i3l2, "", "", i4l1, i4l2, i4l3, "");
		showBlankLine();
                show2Items(item5, price5, item6, price6, i5l1, i5l2, i5l3, "", i6l1, i6l2, "", "");
                showBlankLine();
                show2Items(item7, price7, item8, price8, i7l1, i7l2, i7l3, i7l4, i8l1, i8l2, i8l3, "");
                showBlankLine();
                show2Items(item9, price9, item10, price10, i9l1, i9l2, "", "", i10l1, i10l2, "", "");
                showBlankLine();
                show2Items(item11, price11, item12, price12, i11l1, "", "", "", i12l1, i12l2, i12l3, "");
                showBlankLine();
                show2Items(item13, price13, item14, price14, i13l1, i13l2, "", "", i14l1, i14l2, i14l3, "");
                showBlankLine();
                show2Items(item15, price15, item16, price16, i15l1, i15l2, "", "", i16l1, i16l2, i16l3, "");
                showBlankLine();
                show2Items(item17, price17, item18, price18, i17l1, i17l2, i17l3, "", i18l1, i18l2, i18l3, "");
                showBlankLine();
                show2Items(item19, price19, item20, price20, i19l1, i19l2, "", "", i20l1, i20l2, i20l3, i20l4);
                showBlankLine();
                show2Items(item21, price21, item22, price22, i21l1, i21l2, i21l3, "", i22l1, i22l2, i22l3, "");
                showBlankLine();
                show2Items(item23, price23, "", "", i23l1, i23l2, i23l3, i23l4, "", "", "", "");
                showBlankLines();
                dividedLine();
                
				
    }

    public static void show2Items (String item1, String price1, String item2, String price2, String i1l1, String i1l2, String i1l3, String i1l4, String i2l1, String i2l2, String i2l3, String i2l4) {
		System.out.printf(format, item1, price1, item2, price2);
		System.out.printf(format2, i1l1, " ", i2l1);
		System.out.printf(format2, i1l2, " ", i2l2);
                System.out.printf(format2, i1l3, " ", i2l3);
                System.out.printf(format2, i1l4, " ", i2l4);
	}
	
	public static void showBlankLines() {
		System.out.println("\n\n");
	}
	
	public static void showBlankLine() {
		System.out.println("\n");
	}

	public static void dividedLine() {
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}

	public static void displayBanner() {
		System.out.printf("%n\t%-30S%n", "SPECIALTY SUSHI");
		System.out.printf("\t%-30s%n", "This is highly ranked menu");
        }

}
