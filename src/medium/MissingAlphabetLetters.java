package medium;

import java.util.Arrays;

import main.Main;

public class MissingAlphabetLetters {
	
	public static void printMissingAlphabet(){
		for(String line : Main.inputs){
			char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			boolean[] flags = new boolean[alphabet.length];
			Arrays.fill(flags, false);
			line = line.toLowerCase();
			line = line.trim();
			char[] stringChar = line.toCharArray();
			
			// Marks off present letters in the flag array
			for(int i = 0; i < stringChar.length; i++){
				for( int x =0; x < alphabet.length; x++){
					if( stringChar[i] == alphabet[x])
					flags[x] = true;
				}
			}
			// Checks the flag array for missing letters
			boolean nullFlag = true;
			for( int x=0; x < flags.length ; x++){
				if (!flags[x]){
					System.out.print(alphabet[x]);
					nullFlag = false;
				}
			}
			if(nullFlag) System.out.println("NULL");
			else System.out.println();
		}
	}

}
