// Dont include package names when submitting to CodeEval
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Vector;


public class Main {
	public static Vector<String> inputs;
	
	public static void identicalURI(){
		// Sample input delimited by semicolon
		// http://abc.com:80/~smith/home.html;http://ABC.com/%7Esmith/home.html
		for(String line : Main.inputs){
			String[] URIs = line.split(";");
		}

	}
	
	public static void main(String[] args) throws IOException {
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
		
		}
		catch(FileNotFoundException exception){
			System.out.println(exception);
		}
		finally{
			
		}
		
		

	}

}
