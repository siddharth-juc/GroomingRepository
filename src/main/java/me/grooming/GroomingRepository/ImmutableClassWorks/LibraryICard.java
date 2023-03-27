package me.grooming.GroomingRepository.ImmutableClassWorks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class LibraryICard {

	private final String name;
	private final String identificationNumber;
	private final List<String> departments;
	private final Date dateOfEnrollment;
	
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
	
}
