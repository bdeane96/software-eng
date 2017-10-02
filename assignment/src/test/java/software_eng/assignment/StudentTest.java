package software_eng.assignment;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StudentTest extends TestCase {
	protected String name, age, dob, id, username;

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public StudentTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(StudentTest.class);
	}

	/**
	 * test to check username is generated correctly
	 */
	public void testStudent() {
		name = "Bronagh Deane";
		age = "21";
		dob = "26/05/1996";
		id = "14407778";
		username = name + age;
		
		Student student = new Student(name, age, dob, id);

		String username = student.getUsername();
		Assert.assertEquals(student.getUsername(), username);
	}

}
