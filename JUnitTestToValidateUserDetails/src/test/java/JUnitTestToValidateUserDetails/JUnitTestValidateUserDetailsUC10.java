package JUnitTestToValidateUserDetails;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTestValidateUserDetailsUC10 {
	// test to verify that first name matches pattern
	// Happy mood
	@Test
	public void givenFirstName_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Lalit");
		Assert.assertEquals(true, result);
	}

	// test to verify that first name do not matches pattern
	// Sad mood
	@Test
	public void givenFirstName_WhenShort_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("La");
		Assert.assertEquals(false, result);
	}

	// test to verify that first name do not matches pattern
	// Sad mood
	@Test
	public void givenFirstName_WhenSpecialCharacter_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Lalit$");
		Assert.assertEquals(false, result);
	}

	// test to verify that last name matches pattern
	// Happy mood
	@Test
	public void givenLastName_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Gahlawat");
		Assert.assertEquals(true, result);
	}

	// test to verify that last name do not matches pattern
	// Sad mood
	@Test
	public void givenLastName_WhenShort_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Ga");
		Assert.assertEquals(false, result);
	}

	// test to verify that last name do not matches pattern
	// Sad mood
	@Test
	public void givenLastName_WhenSpecial_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Gahlawat$");
		Assert.assertEquals(false, result);
	}

	// test to verify that email address matches pattern
	// Happy mood
	@Test
	public void givenEmail_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("gah.lawat@dmail.co.in");
		Assert.assertEquals(true, result);
	}

	// test to verify that email address do not matches pattern
	// sad mood
	@Test
	public void givenEmail_WhenNotProper_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("..gah.lawat@dmail.co.in");
		Assert.assertEquals(false, result);
	}

	// test to verify that mobile number matches pattern
	// Happy mood
	@Test
	public void givenMobileNumber_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobileNumber("91 9812345678");
		Assert.assertEquals(true, result);
	}

	// test to verify that mobile number do not matches pattern
	// sad mood
	@Test
	public void givenMobileNumber_WhenNotProper_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobileNumber("919812345678");
		Assert.assertEquals(false, result);
	}

	// test to verify that password matches pattern
	// Happy mood
	@Test
	public void givenPassword_WhenProper_Returntrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("AsssB123@ahsh");
		Assert.assertEquals(true, result);
	}

	// test to verify that password do not matches pattern
	// sad mood
	@Test
	public void givenPassword_WhenNoUpperCase_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("sss123@ahsh");
		Assert.assertEquals(false, result);
	}

	// test to verify that password do not matches pattern
	// sad mood

	@Test
	public void givenPassword_WhenNoSpecialCharacter_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("sss123ABahsh");
		Assert.assertEquals(false, result);
	}

}
