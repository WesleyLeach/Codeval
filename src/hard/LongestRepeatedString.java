package hard;

import java.util.Vector;

import main.Main;

/*
 * 
 * 

REPEATED SUBSTRING

INPUTS
banana
am so uniqe

ANSWER
an
NONE
 */

public class LongestRepeatedString {

	public LongestRepeatedString(){
		Vector<String> Lines = Main.inputs;
		Vector<String> possibleStrings = new Vector<String>();
		for( String Line : Lines){
			// BRUTE FORCE
			// So the idea is to slice the string into all possible substrings
			// Then sort the vector that contains substrings by length
			// go down the least in descending order, test if sub string is in inputed string
			// print first string to be in input string and exit
			Vector<String> subStrings = new Vector<String>();
			String lineSaver = Line;
			for (int x =1; x<= Line.length(); x++){
				// removes the first element and adds the remainder to the Vector
				Line = Line.substring(x);
				subStrings.addElement(Line);
			}
			for (String output : subStrings) System.out.println(output);
			
			
		}
		
	}

}
