package software_eng.assignment;

import java.util.Iterator;
import java.util.List;
import org.joda.time.*;

public class Course {
	private String courseName;
	private List<Module> modules;
	private DateTime startdate, endDate;
	
	public Course() {
		
	}
	
	public Course(String courseName, List<Module> modules, DateTime startDate, DateTime endDate) {
		setCourseName(courseName);
		setModules(modules);
		setStartdate(startDate);
		setEndDate(endDate);
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public List<Module> getModules() {
		return modules;
	}
	
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public DateTime getStartdate() {
		return startdate;
	}
	
	public void setStartdate(DateTime startdate) {
		this.startdate = startdate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public String toString() {
		String moduleInfo = "";
		
		for(Iterator<Module> it = modules.iterator(); it.hasNext();) {
			Module module = it.next();
			moduleInfo += module.toString();
		}
		
		return "Course: " + courseName + ", " + moduleInfo +"\nStart date: " + startdate + "\nEnd date: " +endDate;
	}
}
