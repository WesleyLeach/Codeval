package medium;

import java.util.Arrays;
import java.util.Vector;

import main.Main;

public class JollyJumpers {
	

	
	public static void jollyJumperTest(){
		/*
		 *  So the sequence will have 4 characters.
		 *  N, SEQUENCE
		  	4 1 4 2 3 - Jolly
			3 7 7 8 - Not Jolly
			9 8 9 7 10 6 12 17 24 38 Not jolly
			
			A sequence of n > 0 integers is called a jolly jumper if the absolute values
		 of the differences between successive elements take on all possible values 1 through n - 1. eg.
		 
		  4 1 4 2 3 - Jolly
		   3 3 2 1
		 */
		for(String line : Main.inputs){
			// Needed data structues
			Vector<String> elements  = new Vector<String>();
			String[] numbersChars = line.split(" ");
			int sizeOfSequence = Integer.parseInt(numbersChars[0]);
			// Creates the array of the appropirate size
			boolean[] jollyFlags = new boolean[sizeOfSequence];
			// Sets all values to false
			Arrays.fill(jollyFlags, Boolean.FALSE);
			// numbers we will need
			int[] numbers = new int[sizeOfSequence];
			int index = 0;
			for(int x=0; x < sizeOfSequence; x++){
				numbers[x] = Integer.parseInt(numbersChars[x+1]);
			}
			// Sets all the flags
			for(int x=0; x <sizeOfSequence-1;x++ ){
				//4 1 4 2 3 
				index = Math.abs(numbers[x]-numbers[x+1]);
				if(index >= jollyFlags.length)break;
				else jollyFlags[index] = true;
			}
			boolean flagFinal = true;
			jollyFlags[0]=true;
			// Checks the array
			for(boolean tempFlag :jollyFlags ){
				if(!tempFlag) flagFinal = false;
			}
			if( flagFinal)System.out.println("Jolly");
			else System.out.println("Not jolly");
			}
			
		}

}
