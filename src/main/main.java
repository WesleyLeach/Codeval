// Dont include package names when submitting to CodeEval
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Vector;


public class Main {
	public static Vector<String> inputs;
	
	
	public static void secondToLast(){
		String target = null;
		
		for(String line : Main.inputs){
			String[] words = line.split(",");
			char[] word = words[1].toCharArray();
			char[] sentence = words[0].toCharArray();
			boolean flag = true;
			
			if(word.length >= sentence.length){
				System.out.println("0");
				break;
			}
			
			for(int x = ( sentence.length-word.length ),y=0; x<sentence.length;x++,y++){
				if(sentence[x] != word[y]){
					flag = false;
				}
			}
			
			if(flag){
				System.out.println("1");
			}
			else{
				System.out.println("0");
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
			secondToLast();
		
		}
		catch(FileNotFoundException exception){
			System.out.println(exception);
		}
		finally{
			
		}
		
		

	}

}
