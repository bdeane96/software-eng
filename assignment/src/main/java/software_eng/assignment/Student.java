package software_eng.assignment;

public class Student {
	private String name, age, dob, id;
	
	public Student(String name, String age, String dob, String id) {
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return name+dob;
	}

}
