package medium;

import java.util.regex.Pattern;

public class INCOMPLETE_EmailValidation {
	
	public static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
	          "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
	          "\\@" +
	          "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
	          "(" +
	          "\\." +
	          "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
	          ")+"
	      );
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	private static boolean checkEmail(String email) {
      return EMAIL_ADDRESS_PATTERN.matcher(email).matches();
}
	private static boolean checkEmail2(String email) {
      return VALID_EMAIL_ADDRESS_REGEX.matcher(email).matches();
}

}
