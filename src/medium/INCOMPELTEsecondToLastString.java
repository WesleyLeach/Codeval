package medium;
import main.Main;
public class INCOMPELTEsecondToLastString {
	
	public static void secondToLast(){
		String target = null;
		
		for(String line : Main.inputs){
			String[] words = line.split(" ");
			int sizeOfArray = words.length;
			if( sizeOfArray <2){
				System.out.println(words[0]);
			}
			else{
				System.out.println(words[words.length-2]);
			}
			
		}
		
		
	}

}
