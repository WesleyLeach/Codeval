package medium;

import java.util.Arrays;

import main.Main;

public class CountingPrimes {
	public static boolean[] primes;
	private static int primeLimit;
	
	public static void generatePrimeList(int limit){
		
		// sieve of Ethaosthene 
		primeLimit = limit;
		Main.primes = new boolean[primeLimit];
		Arrays.fill(primes, true);
		for(int x=2; x<=Math.sqrt(primeLimit) ; x++	){
			if( primes[x] ){
				for( int j=x*x ,y=0 ; j  < primeLimit; y++,j += x ){
					primes[j] = false;
				}
			}
		}
		
	}

	public static void primesBetweenInts(){
		for(String line : Main.inputs){
			String[] numbers = line.split(",");
			int lowerBound = Integer.parseInt(numbers[0]);
			int upperBound = Integer.parseInt(numbers[1]);
			generatePrimeList(upperBound*upperBound);
			

			int numberOfPrimes=0;
			for(int x=0; x<= upperBound; x++){
				
				if( Main.primes[x] ){
					if( x <= upperBound &&  x>=lowerBound)
					numberOfPrimes++;
				}
			}
			System.out.println(numberOfPrimes);
			
		}
		
	}

}
