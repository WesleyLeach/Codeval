// Dont include package names when submitting to CodeEval
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Vector;
import java.util.regex.Pattern;


public class Main {
	public static Vector<String> inputs;
	
	public static void simpleSort(){
		for(String line : Main.inputs){
			String[] numbers = line.split(" ");
			double[] number = new double[numbers.length];
			for(int x=0;x<number.length;x++) number[x] = Double.parseDouble(numbers[x]);
			Arrays.sort(number);
			for(int x=0; x<number.length ; x++){
				if(number.length-1 != x){
					System.out.print(number [x] +" ");
				}
				else
					System.out.println(number [x]);
			}

		}
	}

	public static void main(String[] args) throws IOException, URISyntaxException {
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
			simpleSort();
			
			
			
		
		}
		catch(FileNotFoundException exception){
			System.out.println(exception);
		}
		finally{
			
		}
		
		

	}

}
