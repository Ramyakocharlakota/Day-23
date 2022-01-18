package parametrizedtest.java;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(ParametrizedTest.class)
public class ParametrizedTest {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String emailID;

	private boolean expectedResultForFName;
	private boolean expectedResultForLName;
	private boolean expectedResultForNumber;
	private boolean expectedResultForEmail;

	private ValidateUserEntry userEntry;

	public ParametrizedTest(String firstName, String lastName, String contactNumber, String emailID,
			boolean expectedResultForFName, boolean expectedResultForLName, boolean expectedResultForNumber,
			boolean expectedResultForEmail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailID = emailID;
		this.expectedResultForFName = expectedResultForFName;
		this.expectedResultForLName = expectedResultForLName;
		this.expectedResultForNumber = expectedResultForNumber;
		this.expectedResultForEmail = expectedResultForEmail;
	}

	@Before
	public void initialize() {
		userEntry = new ValidateUserEntry();
	}

	@Parametrized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "", "", "", "", false, false, false, false },
				{ "Priyanka", "pryan", "+91 147852369", "pri@@gmail.com", false, false, false, false } });
	}

	@Test
	public void validateFirstName() {
		assertEquals(expectedResultForFName, userEntry.firstName(firstName));
	}

	@Test
	public void validateLastName() {
		assertEquals(expectedResultForLName, userEntry.lastName(lastName));
	}

	@Test
	public void validateContactNumber() {
		assertEquals(expectedResultForNumber, userEntry.contactNumber(contactNumber));
	}

	@Test
	public void validateEmailId() {
		assertEquals(expectedResultForEmail, userEntry.emailID(emailID));
	}

	private void assertEquals(boolean expectedResultForEmail2, boolean emailID2) {
		// TODO Auto-generated method stub
		
	}

}
