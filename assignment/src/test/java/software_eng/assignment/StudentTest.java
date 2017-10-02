package software_eng.assignment;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StudentTest extends TestCase {
	protected String name, age,  id, username;
	protected DateTime dob;

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
		
		DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy");
		String date = "05/26/1996";
		dob = dtf.parseDateTime(date);
		
		name = "Bronagh Deane";
		age = "21";
		id = "14407778";
		username = name + age;
		
		Student student = new Student(name, age, dob, id);

		String username = student.getUsername();
		Assert.assertEquals(student.getUsername(), username);
	}

}
