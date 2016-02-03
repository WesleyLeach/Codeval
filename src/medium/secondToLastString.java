package medium;
import main.Main;
public class secondToLastString {
	

	
	public static void secondToLast(){
		/*
		 11 index
		 Hello World,World
		 Hello CodeEval,CodeEval
		 San Francisco,San Jose
		 * 
		 */
		
		
		for(String line : Main.inputs){
			if(line.equals(""));
			else{
				
				// Getting needed variables
				String[] words = line.split(",");
				char[] sentence = words[0].toCharArray();
				char[] word = words[1].toCharArray();
				boolean flag = true;
				//System.out.println("SENTENCE :" + words[0]);
				//System.out.println("WORD: "+words[1]);
				// Checks for one edge case
				if(word.length > sentence.length){
					flag=false;
				}
				else if (word.equals(sentence)){
					flag=true;
				}
				// Checking if The last string is the string in question
				if( word.length > sentence.length);
				else
				for(int x = ( (sentence.length-1)-(word.length-1) ),y=0; y<word.length;x++,y++){
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
		
		
	}

}
