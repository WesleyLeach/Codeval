package hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import main.main;

public class PALINDROMIC_RANGES {
	
	public PALINDROMIC_RANGES(){
		Vector<String> lines = main.inputs;
		for( String line : lines){
			
			// This will grab the two ranges
			String[] ranges = line.split(" ");
			int numberOfPalindromes=0,interestingPalindromes=0;
			int start = Integer.parseInt( ranges[0]);
			int end = Integer.parseInt( ranges[1] );
			List<Integer> range = new ArrayList<Integer>();
			List<Integer> rangeSaver = new ArrayList<Integer>();
			// Creates the base range
			for(int x = start; x<= end; x++)range.add(x);
			
			// sets the counters to 0 for this line
			interestingPalindromes=0;
			numberOfPalindromes=0;
			
			while(range.size() > 0){
				
				// Calculates the palindromes in a range
				rangeSaver = range;
				while( range.size() > 0 ){
					// Counts the palindromes in this range
					for(int y=0; y< range.size();y++){
						if (isPalindrome( range.get(y))) numberOfPalindromes++;
					}
					// Checks if the number of palinDromes is even
					if( (numberOfPalindromes % 2) == 0 ) 
						interestingPalindromes += 1;
					// If the range has at least one element continue 
					if (range.size() > 1){
						range = range.subList( 0, ( range.size()-1 ));
						
					}
					else if (range.size() == 1){
						break;
					}
					// Start out outer while loop
					numberOfPalindromes=0;
					if(rangeSaver.size() > 1)
						range = rangeSaver.subList( (rangeSaver.size()-rangeSaver.size()+1 ), ( range.size() ));
					else if( rangeSaver.size() ==1){
						break;
					}
				}
				
				// Adds the amount of interesting palindromes to the counter

				// Termination condition

				numberOfPalindromes=0;
					
			}
			System.out.println(interestingPalindromes);
			
		}
	}
	
	boolean isPalindrome(int number){
		String numberAsString =String.valueOf(number);
		if(numberAsString == null) return false;
		char[] numberAsChars = numberAsString.toCharArray();
		
		for( int x=0; x < numberAsChars.length ; x++){
			if( numberAsChars.length == 1) return true;
			if ( x >= (numberAsChars.length -1) - x ) return true;
			if( numberAsChars[ ( (numberAsChars.length -1) - x )] != numberAsChars[x] ){
				return false;
			}
		}
		return true;
		
	}

}
