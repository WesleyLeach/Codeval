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
			
			// Creates the base range
			for(int x = start; x<= end; x++)range.add(x);
			interestingPalindromes=0;
			numberOfPalindromes=0;
			while(range.size() > 0){
				
				
				
				// Calculates the palindromes in a range
				for(int y=0; y< range.size();y++){
					if (isPalindrome( range.get(y))) numberOfPalindromes++;
				}
				// Adds the amount of interesting palindromes
				if( (numberOfPalindromes % 2) == 0 ) 
					interestingPalindromes += numberOfPalindromes/2;
				if (range.size() > 1)
					range = range.subList( ( range.size()-range.size()+1 ), ( range.size()-1 ));
				else{
					System.out.println(interestingPalindromes);
					break;
				}
					
			}
			
			
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
