package JUnitTestToValidateUserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

// creating class to declare variables 
@RunWith(Parameterized.class)
public class JUnit_ParameterisedTest_ForMultipleEmailAddressesUC11 {

	private String emailAddress;
	private boolean expectedResult;

// constructor for intialisation of declared variables
	public JUnit_ParameterisedTest_ForMultipleEmailAddressesUC11(String emailAddress, boolean expectedResult) {
		this.emailAddress = emailAddress;
		this.expectedResult = expectedResult;
	}

// method to store all test cases in an 2-D array 
	@Parameterized.Parameters
	public static Collection data() {
// happy mood cases
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true },
// sad mood cases
				{ "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false }, { "abc123@.com", false },
				{ "abc@.com.com", false }, { ".abc@abc.com", false }, { "abc()*@gmail.com", false },
				{ "abc@%*.com", false }, { "abc..2002@gmail.com", false }, { "abc.@gmail.com", false },
				{ "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false }, { "abc@gmail.comm.aa.au", false } });
	}

// test method to check whether all test  cases are of same pattern
	@Test
	public void email_PrameterizedTest() {
		// creating instance of uservalidator class
		UserValidator validator = new UserValidator();

		boolean result = validator.validateEmail(emailAddress);
		Assert.assertEquals(expectedResult, result);

	}

}
