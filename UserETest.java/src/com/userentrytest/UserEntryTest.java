package com.userentrytest;

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	public class UserEntryTest {

		@Test
		public void userTest() {
			ValidateUserEntry userEntry = new ValidateUserEntry();
			assertEquals("Ramya", userEntry.firstName("Ramya"));
			assertEquals("Kocharlakota", userEntry.lastName("Kocharlakota"));
			assertEquals("5646564648", userEntry.contactNumber("82433015215"));
			assertEquals("abc.abcd@bl.co.go", userEntry.contactNumber("abc.abcd@bl.co.go"));
	}

}
