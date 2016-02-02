package medium;

import main.Main;

public class fromArabicToRomanNumeral {

	String[] Symbols = {"M","CM","D","C","XC","L","XL","X","IX","V","I"};
	int[] values  ={1000,900,500,100,90,50,40,10,9,5,4,1};

	public static void printRomanNumerals(){

		// 159  CLIX
		// 296  CCXCVI
		// 3992 MMMCMXCII
		for( String line : Main.inputs){
			int number = Integer.parseInt(line);
			
			// Checks if number is in range
			if( number > 3999 || number < 1 ) return;
			// Mod by 1000 until you cant anymore
			
			while( number >= 1000){
				number = number-1000;
				System.out.print("M");
			}
			// check if in the 900 range
			if( number >= 900){
				number = number-900;
				System.out.print("CM");
			}
			// Mod by 500 until you cant anymore
			while( number >= 500){
				number = number-500;
				System.out.print("D");
			}
			if( number >= 400){
				number = number-400;
				System.out.print("CD");
			}
			// mod by 100 until you cant anymore
			while( number >= 100){
				number = number-100;
				System.out.print("C");
			}
			// check if  in the 90 range
			if( number >= 90){
				number = number-90;
				System.out.print("XC");
			}
			// mode by 50 until you cant
			while( number >= 50){
				number = number-50;
				System.out.print("L");
			}
			// check if in the 40 range
			if( number >= 40){
				number = number-40;
				System.out.print("XL");
			}
			// Mod by 10 until you cant anymore
			while( number >= 10){
				number = number-10;
				System.out.print("X");
			}
			if( number >= 9){
				number = number-9;
				System.out.print("IX");
			}
			// Mod by 5 until you cant anymore
			while( number >= 5 ){
				number = number-5;
				System.out.print("V");
			}
			// check if its in the 4 range
			if( number >= 4){
				number = number-4;
				System.out.print("IV");
			}
			while(number > 0){
				System.out.print("I");
				number--;
			}
			System.out.println();
		}
		
	
	}
}
