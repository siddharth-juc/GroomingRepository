package me.grooming.GroomingRepository.PolymorphismVisiblility;

public class UniversityStudent {

	protected String studentName;
	protected String studentGender;
	protected String studentRollNumber;

	/*
	 * This isn't visible to even MathematicsStudent while rest are visible & are
	 * inherited.
	 */
	private String studentMobileNumber;

	public void setStudentRoll(String studentID) {
		this.studentRollNumber = studentID;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}

	private String getStudentMobileNumber() {
		return studentMobileNumber;
	}

	public void printStudentDetails() {
		System.out.println("Printing Student Details . . . . . . . . . . . . . . . . ");
		System.out.println("Student Name 	=====> " + this.studentName);
		System.out.println("Student Gender 	=====> " + this.studentGender);
		System.out.println("Student Roll 	=====> " + this.studentRollNumber);
		System.out.println("Student Mobile  =====> " + this.getStudentMobileNumber());
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
	}

}
