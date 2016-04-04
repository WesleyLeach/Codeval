// Dont include package names when submitting to CodeEval
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class Main {
	public static Vector<String> inputs;
	
	

	public static void getMajorElement(){
		
		
		for (String inputLine : inputs){
			
			String[] inputNumbers = inputLine.split(",");
			
			
			int majorInt = (inputNumbers.length) / 2;
			String majorElement = "None";
			
			Map<String, Integer> occurences = new HashMap<String, Integer>();
			for( String number : inputNumbers){
				
				if(!occurences.containsKey(number)){
					occurences.put(number, 0);
				}
				else{
					occurences.put(number, occurences.get(number) + 1);
				}
				
				if(occurences.get(number) >= majorInt){
					majorElement = number;
					System.out.println(majorElement);
					
				}
			}
			if(majorElement.equals("None"))System.out.println(majorElement);
			
			
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
			getMajorElement();
			
			
		
		}
		catch(FileNotFoundException exception){
			System.out.println(exception);
		}
		finally{
			
		}
		
		

	}

}
