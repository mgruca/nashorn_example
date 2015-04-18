package pl.rits;


import org.junit.Ignore;
import org.junit.Test;
import pl.rits.validation.Validator;

/**
 * User: Michal
 * Date: 2015-04-18
 */
public class Validate {

	@Test
	public void validatePositive() throws Exception {
		String nameValidationScript = "src/resources/validate.js";

		new Validator().validate("{\"name\" : \"jan\"}", nameValidationScript);
	}

	@Test
	//@Ignore//SHOULD FAIL WHEN COMMENTED
	public void validateNegative() throws Exception {
		String nameValidationScript = "src/resources/validate.js";

		new Validator().validate("{\"name\" : \"janek\"}", nameValidationScript);
	}

}
