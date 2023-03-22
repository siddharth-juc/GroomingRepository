package me.grooming.GroomingRepository.PolymorphismVisiblility;

public class UniversityStudent {

	protected String studentName;
	protected String studentGender;
	protected String studentRollNumber;

	/*
	 * This isn't visible to even MathematicsStudent while rest are visible & are
	 * inherited by MathematicsStudent.
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

	/*
	 * This method isn't visible to any other class, whereas other methods can be
	 * used even outside the package due to them being public.
	 */
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
