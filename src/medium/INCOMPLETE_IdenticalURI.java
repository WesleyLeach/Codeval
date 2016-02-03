package medium;

import java.net.URI;
import java.net.URISyntaxException;

import main.Main;

public class INCOMPLETE_IdenticalURI {
	

	public static void identicalURI() throws URISyntaxException{
		// Sample input delimited by semicolon
		// http://abc.com:80/~smith/home.html;http://ABC.com/%7Esmith/home.html
		/*
		 	1. A port that is empty or not given is equivalent to the default port of 80 
			2. Comparisons of host names MUST be case-insensitive 
			3. Comparisons of scheme names MUST be case-insensitive 
			4. Characters are equivalent to their % HEX HEX encodings. 
			(Other than typical reserved characters in urls like , / ? : @ & = + $ #)
		 */
		for(String line : Main.inputs){
			String[] URIs = line.split(";");
			String URIOne = URIs[0];
			String URITwo = URIs[1];
			URI uriOne = new URI (URIOne);
			URI uriTwo = new URI (URITwo);
			URIOne = uriOne.toString();
			URITwo = uriTwo.toString();
			
			if(URIOne.equals(URITwo))System.out.println("True");
			else System.out.println("False");
			
			
		}

	}
}
