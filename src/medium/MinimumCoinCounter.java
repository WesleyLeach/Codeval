package medium;

import main.Main;

public class MinimumCoinCounter {

	public static void coinCounter(){
		int one=1,three=3,five=5;
		for(String line : Main.inputs){
			int number = Integer.parseInt(line),coinCount=0;
			while( number >= 5){
				number -=5;
				coinCount++;
			}
			while( number >= 3){
				number -=3;
				coinCount++;
			}
			while( number >=1){
				number -=1;
				coinCount++;
			}
			System.out.println(coinCount);
		}
	}


}
