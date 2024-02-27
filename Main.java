package Money_Management_System_School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Teacher ram = new Teacher(1,"ram",2500);
//		Teacher lakshman = new Teacher(2,"lakshman",2500);
//		Teacher reddy = new Teacher(3,"reddy",2500);
//		
//		Student rama = new Student(101,"rama",5);
//		Student lakshmana = new Student(102,"lakshmana",5);
//		Student reddi = new Student(103,"reddi",12);
//		
//		
//		List<Teacher> teacher = new ArrayList();
//		teacher.add(reddy);
//		teacher.add(lakshman);
//		teacher.add(ram);
//		
//		List<Student>student = new ArrayList();
//		student.add(reddi);
//		student.add(lakshmana);
//		student.add(rama);
		
		
		Scanner scanner = new Scanner(System.in);

        // Creating a list to store teachers and students
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        // Taking input for teachers
        System.out.println("Enter number of teachers:");
        int numTeachers = scanner.nextInt();
        for (int i = 0; i < numTeachers; i++) {
            System.out.println("Enter teacher ID:");
            int teacherId = scanner.nextInt();
            System.out.println("Enter teacher name:");
            String teacherName = scanner.next();
            System.out.println("Enter teacher salary:");
            int teacherSalary = scanner.nextInt();

            // Creating Teacher object and adding to the list
            Teacher teacher = new Teacher(teacherId, teacherName, teacherSalary);
            teachers.add(teacher);
        }

        // Taking input for students
        System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student ID:");
            int studentId = scanner.nextInt();
            System.out.println("Enter student name:");
            String studentName = scanner.next();
            System.out.println("Enter student grade:");
            int studentGrade = scanner.nextInt();

            // Creating Student object and adding to the list
            Student student = new Student(studentId, studentName, studentGrade);
            students.add(student);
        }

		School primark = new School(teachers , students);
		
//		System.out.println("Intially Primark account balance " + primark.getTotalMoneyEarned());
//		teacher.updateFeesPaid(500);
//		
//		System.out.println("Primark has earned " + primark.getTotalMoneyEarned());
//		reddi.updateFeesPaid(5000);
//		System.out.println("Primark has earned " + primark.getTotalMoneyEarned());
//		
//		ram.receiveSalary(ram.getSalary());
//		System.out.println("Primark has Spent " + primark.getTotalMoneySpent());
//		System.out.println("Primark has earned " + primark.getTotalMoneyEarned());
		
		
		

		// Update fees paid by a student
		if (!students.isEmpty()) {
		    Student student = students.get(0); // Assuming the first student in the list
		    System.out.println("Enter the fees paid by the student:");
		    int feesPaidByStudent = scanner.nextInt();
		    student.updateFeesPaid(feesPaidByStudent);
		    System.out.println("Primark has earned: " + primark.getTotalMoneyEarned());
		} else {
		    System.out.println("No students available.");
		}

		// Receive salary by a teacher
		if (!teachers.isEmpty()) {
		    Teacher teacher = teachers.get(0); // Assuming the first teacher in the list
		    teacher.receiveSalary(teacher.getSalary());
		    System.out.println("Primark has Spent: " + primark.getTotalMoneySpent());
		    System.out.println("Primark has earned: " + primark.getTotalMoneyEarned());
		} else {
		    System.out.println("No teachers available.");
		}
	}

}
