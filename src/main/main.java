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
			String lineSaver = Line;
			
			// Goes to the right
			
			Line = lineSaver;
			char[] temp = Line.toCharArray();
			for (int x =0; x< Line.length(); x++){
				// removes the first element and adds the remainder to the Vector
				
			}
			
			
			
			for (String output : subStrings) 
				if( !output.equals(null) )System.out.println(output);
			
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
