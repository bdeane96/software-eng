package software_eng.assignment;

import java.util.Iterator;
import java.util.List;

public class Module {
	private String moduleName, moduleID;
	private List<Student> studentList;

	public Module() {

	}

	public Module(String moduleName, String moduleID, List<Student> studentList) {
		setModuleName(moduleName);
		setModuleID(moduleID);
		setStudentList(studentList);
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleID() {
		return moduleID;
	}

	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
  
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public String toString() {

		String studentsInfo = "";
		if (studentList != null) {
			for (Iterator<Student> it = studentList.iterator(); it.hasNext();) {
				Student student = it.next();
				studentsInfo += student.toString();
			}
		}

		return "\nModule:" + moduleName + "," + moduleID + ", \nStudents:\n" + studentsInfo;
	}
}
