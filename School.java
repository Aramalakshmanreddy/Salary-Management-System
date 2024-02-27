package Money_Management_System_School;

import java.util.List;

/**
 * A School can have many students , many teachers 
 * Implements teachers and students using an ArrayList.
 * @author ramal
 *
 */
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;  //with static we can access the method otherwise we have tohave an instance of methd
	private static int totalMoneySpent;
	
	
	public School(List<Teacher> teachers, List<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent =0;
	}


	public List<Teacher> getTeachers() {
		return teachers;
	}

/**
 * adds a teacher tothe school
 * teacher to the teachers should be added
 * @param teachers
 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}


	public List<Student> getStudents() {
		return students;
	}


	public void addStudents(Student student) {
		students.add(student);
	}


	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public static void  updateTotalMoneyEarned(int totalMoney) {
		totalMoneyEarned += totalMoney;
	}


	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}


	public static void updateTotalMoneySpent(int moneySpent) {
	     totalMoneyEarned-=moneySpent;
	     totalMoneySpent += moneySpent;
	     
	}
	
	
	
	
}
