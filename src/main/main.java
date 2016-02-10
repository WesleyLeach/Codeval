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
			// banana	banana	banana	banana
			//	anana	banan	anan	 anana
			//   nana	bana	na		  anan
			//    ana	ban				   nan
			//     na	ba				    an
			//      a	b
			Vector<String> subStrings = new Vector<String>();
			Line = Line.trim();
			for( int x=0 ; x < Line.length() ; x++){
				for( int i=0; i< Line.length(); i ++){
					if( x+i <= Line.length()){
						String sub = Line.substring(x, x+i);
						subStrings.add(sub);
					}
				}
			}
			// Get duplicates
			Vector<String> duplicatedStrings = new Vector<String>();
			for( int i=0; i< subStrings.size(); i++){
				for(int x=0; x< subStrings.size(); x++){
					if( i != x){
						if( subStrings.elementAt(i).equals(subStrings.elementAt(x)) ){
							duplicatedStrings.add(subStrings.elementAt(i));
						}
					}
				}
					
			}
			
			//Find Longest
			String longestString = null;
			if(duplicatedStrings.size() == 0 ){
				System.out.println("NULL");
			}
			else{
				longestString = duplicatedStrings.elementAt(0);
				for(String testString : duplicatedStrings){
					if( longestString.length() < testString.length()){
						longestString = testString;
					}
				}
				System.out.println(longestString);
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
