package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.DependencyInversionWorks;

public class FountainPen implements WritingInstrument {

	private double inkCapacity;

	public double getInkCapacity() {

		return inkCapacity;

	}

	private void setInkCapacity(int inkCapacity) {

		this.inkCapacity = inkCapacity;

	}

	private void refillInkFromInkPot() {

		setInkCapacity(100);

	}

	@Override
	public void write(Page currentPage, String topicNotes) {

		if (inkCapacity < topicNotes.length() / 1000)
			this.refillInkFromInkPot();

		currentPage.writeNotes(topicNotes);
		currentPage.setFilled(true);
		inkCapacity -= topicNotes.length() / 1000;
		this.smudge(currentPage);

	}

	private void smudge(Page currentPage) {

		currentPage.setSmudged(true);
		inkCapacity *= 99 / 1000;

	}

}