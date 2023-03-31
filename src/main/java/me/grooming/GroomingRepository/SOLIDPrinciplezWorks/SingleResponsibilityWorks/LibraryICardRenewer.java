package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.SingleResponsibilityWorks;

import java.util.Date;

public class LibraryICardRenewer {

	/*
	 * Here, instead of adding this method to our LibraryICard class defined in this
	 * package and assigning it the responsibility to renew Library Membership, we
	 * have defined a new class which, as the name suggests, is for this
	 * responsibity alone.
	 * 
	 * Now, any thing related to renewal of LibraryICard should be done in this
	 * class, like resetting departments, updating date of enrollment, and so on.
	 */

	public void renewLibraryICard(LibraryICard givenLibraryICard, Date newDateOfRenewal) {
		givenLibraryICard.setDateOfRenewal(newDateOfRenewal);
	}

	/*
	 * However, the below function shouldn't be part of the Renewer as settlement of
	 * dues is not related to renewal of LibraryICard, but rather to LibraryAccount.
	 * If implemented, this will be in contravention to Single Responsibility
	 * Principle, as LibraryICard Renewer will be assigned the duty of calculating
	 * dues as well, which : 1. doesn't look good in first place, as there seems to
	 * be no direct relation between class and member method. 2. unnecessarily
	 * complicates the code architecture.
	 */

	/*
	 * public void calculatePendingDues(LibraryICard givenLibraryICard, Date
	 * dateOfLastClearing) {
	 * 
	 * }
	 */

}