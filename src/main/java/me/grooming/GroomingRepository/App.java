package me.grooming.GroomingRepository;

import me.grooming.GroomingRepository.AutoBoxingUnBoxing.AutoBoxUnBox;

import me.grooming.GroomingRepository.EnumsWork.Cantonments;

import me.grooming.GroomingRepository.PolymorphismVisiblility.MathematicsStudent;
import me.grooming.GroomingRepository.PolymorphismVisiblility.UniversityStudent;

public class App {

	public static void main(String[] args) {

		UniversityStudent universityStudent = new UniversityStudent();
		universityStudent.setStudentRoll("327X6119922");
		universityStudent.setStudentName("Siddharth J. ");
		universityStudent.setStudentGender("Male");
		universityStudent.setStudentMobileNumber("+918897565485");

		/*
		 * This calls printStudentDetails() defined in UniversityStudent -> the base
		 * class
		 */
		universityStudent.printStudentDetails();

		MathematicsStudent mathematicsStudent = new MathematicsStudent();
		mathematicsStudent.setStudentRoll("327X6119922");
		mathematicsStudent.setStudentName("Siddharth J. ");
		mathematicsStudent.setStudentGender("Male");

		/*
		 * This calls assignProject with 3 arguments defined in MathematicsStudent
		 */
		mathematicsStudent.assignProject("Cosmology", "Study", "Dr. P. K. S. ");

		/*
		 * This calls printStudentDetails() defined in MathematicsStudent -> the derived
		 * class printStudentDetails() in derived class overrides the method in base
		 * class. The object of derived class implements the method defined by the
		 * derived class itself while the base class method implementation is hidden.
		 */
		mathematicsStudent.printStudentDetails();

		/*
		 * This calls assignProject with 4 arguments defined in MathematicsStudent
		 */
		mathematicsStudent.assignProject("Cosmology", "Study", "Dr. P. K. S. ", "Gaurav G. ");
		mathematicsStudent.printStudentDetails();

		/*
		 * Showing the usage of an Enum with multiple arguments and a private
		 * constructor
		 */
		Cantonments cbank = Cantonments.PATHANKOT;
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		System.out.println("Right now at  		=====> " + cbank.getFullName());
		System.out.println("With Station Code 	=====> " + cbank.getStationCode());
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
		AutoBoxUnBox autoBoxUnBox = new AutoBoxUnBox();
		autoBoxUnBox.autoBox();
		autoBoxUnBox.unBox();
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();

	}

}
