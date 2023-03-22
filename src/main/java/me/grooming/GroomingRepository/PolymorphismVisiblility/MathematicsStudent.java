package me.grooming.GroomingRepository.PolymorphismVisiblility;

public class MathematicsStudent extends UniversityStudent {

	private String projectDomain;
	private String projectType;
	private String professorInCharge;
	private String projectBuddy;

	public void setProjectBuddy(String projectBuddy) {
		this.projectBuddy = projectBuddy;
	}

	public void setProjectDomain(String projectDomain) {
		this.projectDomain = projectDomain;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public void setProfessorInCharge(String professorInCharge) {
		this.professorInCharge = professorInCharge;
	}

	public void assignProject(String projectDomain, String projectType, String professorInCharge) {
		this.setProjectDomain(projectDomain);
		this.setProjectType(projectType);
		this.setProfessorInCharge(professorInCharge);
		this.setProjectBuddy("Not Applicable");
	}

	public void assignProject(String projectDomain, String projectType, String professorInCharge, String projectBuddy) {
		this.setProjectDomain(projectDomain);
		this.setProjectType(projectType);
		this.setProfessorInCharge(professorInCharge);
		this.setProjectBuddy(projectBuddy);
	}

	public void printStudentDetails() {
		System.out.println("Printing Student Details . . . . . . . . . . . . . . . . .");
		System.out.println("Student Name 			=====> " + this.studentName);
		System.out.println("Student Gender 			=====> " + this.studentGender);
		System.out.println("Student Roll 			=====> " + this.studentRollNumber);
		System.out.println(". . . . . . . . DEPARTMENT OF MATHEMATICS . . . . . . . .");
		System.out.println("Project Domain			=====> " + this.projectDomain);
		System.out.println("Project Type			=====> " + this.projectType);
		System.out.println("Professor In Charge		=====> " + this.professorInCharge);
		System.out.println("Project Buddy			=====> " + this.projectBuddy);
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println();
	}
}
