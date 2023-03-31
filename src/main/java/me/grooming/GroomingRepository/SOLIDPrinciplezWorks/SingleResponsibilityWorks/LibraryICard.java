package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.SingleResponsibilityWorks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryICard {

	private String name;
	private String identificationNumber;
	private List<String> departments;
	private Date dateOfEnrollment;
	private Date dateOfRenewal;

	public LibraryICard(String name, String identificationNumber, List<String> departments, Date dateOfEnrollment) {

		this.name = name;
		this.identificationNumber = identificationNumber;
		this.departments = new ArrayList<String>(departments);
		this.dateOfEnrollment = dateOfEnrollment;

	}

	public String getName() {
		return this.name;
	}

	public String getIdentificationNumber() {
		return this.identificationNumber;
	}

	public List<String> getDepartments() {
		return List.copyOf(this.departments);
	}

	public Date getDateOfEnrollment() {
		return new Date(this.dateOfEnrollment.getTime());
	}

	public Date getDateOfRenewal() {
		return dateOfRenewal;
	}

	public void setDateOfRenewal(Date dateOfRenewal) {
		this.dateOfRenewal = dateOfRenewal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public void setDateOfEnrollment(Date dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}

	/*
	 * The below function, though one may feel like putting it into the LibraryICard
	 * class, shouldn't be here according to Single Responsibility Principle.
	 * 
	 * Now let's say that Library changes the Membership and Renewal policies, then
	 * there are chances that building those changes here can interrupt or break
	 * down the LibraryICard class and other classes which use the object of
	 * LibraryICard class for some feature that isn't its primary goal.
	 * 
	 * Thus, better to cerate another class and assign the responsibility of renewal
	 * to that class.
	 */

	/*
	 * public void renewLibraryICard(LibraryICard givenLibraryICard, Date
	 * newDateOfRenewal) {
	 * 
	 * }
	 */

}
