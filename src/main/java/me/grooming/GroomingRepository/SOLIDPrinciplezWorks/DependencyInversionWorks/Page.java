package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.DependencyInversionWorks;

public class Page {

	private String notes;
	private boolean isFilled;
	private boolean isSmudged;

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public String getNotes() {
		return notes;
	}

	public void writeNotes(String notes) {
		this.notes = notes;
	}

	public boolean isSmudged() {
		return isSmudged;
	}

	public void setSmudged(boolean isSmudged) {
		this.isSmudged = isSmudged;
	}

}