package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.DependencyInversionWorks;

/*
 * This interface acts as an abstract layer which can be dependable for UniversityNotes, thus allowing 
 * the Notes to be taken regardless of the Writing Instrument being used, provided it implements the 
 * WritingInstrument fnterface.
 */

public interface WritingInstrument {

	public void write(Page currentPage, String topicNotes);

}