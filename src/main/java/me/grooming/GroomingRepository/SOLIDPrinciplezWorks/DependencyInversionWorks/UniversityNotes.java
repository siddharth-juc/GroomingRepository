package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.DependencyInversionWorks;

import java.util.List;

public class UniversityNotes {

	/*
	 * Here, instead of UniversityNotes depending upon a concrete class like
	 * FountainPen, we map its dependency to an abstract layer (here, an interface) called
	 * WritingInstrument, so that even if we have to use a Pencil, we can take our
	 * Notes seamlessly.
	 */

	WritingInstrument writingInstrument;
	private SingleRuledNotebook singleRuledNotebook;
	String topics;

	public UniversityNotes(WritingInstrument writingInstrument, SingleRuledNotebook singleRuledNotebook,
			String topics) {

		this.writingInstrument = writingInstrument;
		this.singleRuledNotebook = singleRuledNotebook;
		this.topics = topics;

	}

	public void takeNotes(WritingInstrument writingInstrument, List<String> topicNotes) {

		singleRuledNotebook.getPages().forEach(page -> {
			writingInstrument.write(page, topicNotes.get(singleRuledNotebook.getCurrentPageNumber()));
		});

	}
}