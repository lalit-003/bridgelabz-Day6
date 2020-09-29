package JUnitTestToValidateUserDetails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
	// initialising and assigning regex pattern as String to User detail types
	public static final String firstName = "[A-Z]{1}[A-za-z]{2,}";
	public static final String lastName = "[A-Z]{1}[A-za-z]{2,}";
	public static final String emailAddress = "^([0-9a-zA-Z]{1,})([+-._][a-z0-9A-Z]{1,})*@([0-9a-zA-Z]{1,})(.[a-zA-Z]{2,4})?.([a-zA-Z]{2,3})$";
	public static final String mobileNo = "[0-9]{2}[; ;][0-9]{10}";
	public static final String password = "((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%]{1})[0-9A-Za-z]).{8,}";

// method for first name to return true if matches pattern And return false if not matches pattern
	public boolean validateFirstName(String fName) {

		Pattern pattern = Pattern.compile(firstName);

		return pattern.matcher(fName).matches();
	}

//// method for last name to return true if matches pattern And return false if not matches pattern
	public boolean validateLastName(String lName) {
		
		Pattern pattern = Pattern.compile(lastName);

		return pattern.matcher(lName).matches();

	}

	// method for email to return true if matches pattern And return false if not
	// matches pattern
	public boolean validateEmail(String email) {
				Pattern pattern = Pattern.compile(emailAddress);

		return pattern.matcher(email).matches();

	}

	// method for mobile number to return true if matches pattern And return false
	// if not matches pattern
	public boolean validateMobileNumber(String mobileNumber) {
		
		Pattern pattern = Pattern.compile(mobileNo);

		return pattern.matcher(mobileNumber).matches();

	}

	// method for password to return true if matches pattern And return false if not
	// matches pattern
	public boolean validatePassword(String passwrd) {
		
		Pattern pattern = Pattern.compile(password);

		return pattern.matcher(passwrd).matches();

	}

}
