package fmi.informatics.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import fmi.informatics.extending.Student;

public class StudentData {

	public static void main(String[] args) {
		studentGenerate();

	}
	
	public static void studentGenerate() {
		Scanner scanner = new Scanner(System.in);
		List<Student> generateStudent =
				Arrays.asList(
						Student.StudentGenerator.make(),
						Student.StudentGenerator.make(),
						Student.StudentGenerator.make(),
						Student.StudentGenerator.make(),
						Student.StudentGenerator.make()
				);

		System.out.println("\nPress 1 for ascending , Press 2 for descending order: ");
		try {
			int number = scanner.nextInt();
			if (number == 1) {
				System.out.println("\nAscending order selected! ");
				studentAscending(generateStudent);
				generateStudent.forEach((s) -> System.out.println
						("Name: " + s.getName() + ", Age: " + s.getAge() + ", EGN: " + s.getEgn() + ", University: " + s.getUniversity() + ", Speciality: " + s.getSpeciality()));

			} else if (number == 2) {
				System.out.println("\nDescending order selected: ");
				studentDescending(generateStudent);
				generateStudent.forEach((s) -> System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", EGN: "
						+ s.getEgn() + ", University: " + s.getUniversity() + ", Speciality: " + s.getSpeciality()));
			} else {
				System.out.println("Sorted by Default");
				generateStudent.forEach((s) -> System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", EGN: "
						+ s.getEgn() + ", University: " + s.getUniversity() + ", Speciality: " + s.getSpeciality()));
			}
		} catch (Exception e) {
			System.err.println("Please choose a Number");
		}


	}
	
	public static void studentAscending(List<Student> randomStudents) {
		randomStudents.sort(Comparator.comparing(Student::getSpeciality));
	}
	public static void studentDescending(List<Student> randomStudents) {
		randomStudents.sort((a, b) -> b.getSpeciality().compareTo(a.getSpeciality()));
	}
	
}
