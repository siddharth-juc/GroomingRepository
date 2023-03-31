package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.DependencyInversionWorks;

public class Pencil implements WritingInstrument {

	private boolean isSharpened;

	public boolean isSharpened() {

		return isSharpened;

	}

	public void setSharpened(boolean isSharpened) {

		this.isSharpened = isSharpened;

	}

	@Override
	public void write(Page currentPage, String topicNotes) {

		currentPage.writeNotes(topicNotes);
		currentPage.setFilled(true);

	}

}