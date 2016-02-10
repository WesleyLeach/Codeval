// Dont include package names when submitting to CodeEval
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Vector;


public class Main {
	public static Vector<String> inputs;
	
	
	public static void LongestRepeatedString(){
		for( String Line :  Main.inputs){
			
			// BRUTE FORCE
			// Move		Move	Move	
			//	right	left	-> <-
			// banana	banana	banana	banana	b		ba	    ban		bana	banan
			//	anana	banan	anan	 anana	ba		ban 	bana	banan	banana
			//   nana	bana	na		  anan	ban		bana	banan	banana
			//    ana	ban				   nan	bana	banan	banana
			//     na	ba				    an	banan	banana
			//      a	b						banana
			//	
			//	a		an		ana		anan	
			//	an		ana		anan	anana
			//	ana		anan	anana
			//	anan	anana
			//	anana
			
			Vector<String> subStrings = new Vector<String>();
			Line = Line.trim();
			Line = Line.toLowerCase();
			for( int x=0 ; x < Line.length() ; x++){
				for( int i=x; i< Line.length(); i ++){
					if( x+i <= Line.length()){
						String sub = Line.substring(x, x+i);
						subStrings.add(sub);
					}
				}
			}
			
			// Get duplicates
			Vector<String> duplicatedStrings = new Vector<String>();
			char[] tempLine = Line.toCharArray();
			boolean foundOnce =false,founceTwice=false;
			int startForSecond;
			
			for( int i=0; i< subStrings.size(); i++){
				char[] tempCompare = subStrings.get(i).toCharArray();
				// Checks for the first duplicate
				// Runs for each word

				foundOnce=false;
				founceTwice=false;
				if (tempCompare.length>0)
				for(int y=0; y<tempLine.length;y++){
					
					if(tempCompare[0] == tempLine[y] && !foundOnce){
						for(int x=1; x< tempCompare.length; x++){
							if( y+x < tempLine.length)
							if(tempCompare[x] ==tempLine[y+x]){
								if(x == tempCompare.length-1){

									foundOnce =true;
									y= y+x+1;
								}
							}
						}
					}
					
					else if(tempCompare[0] == tempLine[y] && foundOnce){
						for(int x=1; x< tempCompare.length; x++){
							if( y+x < tempLine.length)
							if(tempCompare[x] ==tempLine[y+x]){
								if(x == tempCompare.length-1){
									founceTwice =true;
									y= y+x+1;
									break;
								}
							}
						}
					}
				}
				
				if(foundOnce && founceTwice)duplicatedStrings.add(subStrings.get(i));
					
			}
			
			//Find Longest
			String longestString = null;
			if(duplicatedStrings.size() == 0){
				System.out.println("NONE");
			}
			else{
				// finds longest string, if equal it ignores it
				longestString = duplicatedStrings.elementAt(0);
				for(String testString : duplicatedStrings){
					if( longestString.length() < testString.length()){
						longestString = testString;
					}
				}
				if(longestString.equals(" "))System.out.println("NONE");
				else System.out.println(longestString);
			}
			
		}
			
		
		
	}
	
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader ( new FileReader (args[0]) );
			inputs = new Vector<String>(); 
			String lineInput;
			while( (lineInput = br.readLine() )!= null){
				inputs.add(lineInput);
			}
			br.close();
			//Put the function call here
			LongestRepeatedString();
			
			
		
		}
		catch(FileNotFoundException exception){
			System.out.println(exception);
		}
		finally{
			
		}
		
		

	}

}
