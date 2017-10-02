package software_eng.assignment;

import org.joda.time.DateTime;

public class Student {
	private String name, age, id;
	private DateTime dob;
	
	public Student(String name, String age, DateTime dob, String id) {
		this.setName(name);
		this.setAge(age);
		this.setDob(dob);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public DateTime getDob() {
		return dob;
	}

	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return name+age;
	}

	public String toString() {
		return "Student info:" + name + "," + age +"," + dob +"," + id +"\n";
	}
}
