// Dont include package names when submitting to CodeEval
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Vector;


public class Main {
	public static Vector<String> inputs;
	
	public static int sumOfArray(int[] arrayInput){
		int sum=0;
		for( int part : arrayInput)sum += part;
		return sum;
	}
	
	public static void largestSubSetSum(){
		for(String line : Main.inputs){
			String[] numberStrings = line.split(",");
			int[] numbers = new int[numberStrings.length];
			// Fills the new int array
			for(int x=0; x<numbers.length;x++){
				numbers[x] = Integer.getInteger(numberStrings[x]);
			}
			int largestSum=0,tempSum=0;
			// Begin calculating largest sum here
			for(int i=0; i <1000000; i++)
			// Example input -10,2,3,-2,0,5,-15
			Random random = new Random();
			int firstEndPoint = random.nextInt(numbers.length);
			int secondEndPoint = random.nextInt(numbers.length);
			
			if(firstEndPoint > secondEndPoint){
				int temp=secondEndPoint;
				secondEndPoint = firstEndPoint;
				firstEndPoint = temp;
			}
			int[] subAry = Arrays.copyOfRange(numbers, firstEndPoint , secondEndPoint);
			tempSum = sumOfArray(subAry);
			// Reassigns largest Sum
			if(tempSum > largestSum) largestSum = tempSum;
			}
		
			
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
