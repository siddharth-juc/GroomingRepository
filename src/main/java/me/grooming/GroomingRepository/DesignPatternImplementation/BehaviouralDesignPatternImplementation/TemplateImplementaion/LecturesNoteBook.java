package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.TemplateImplementaion;

public class LecturesNoteBook extends NoteBookTemplate {

	@Override
	public void selectNoteBookType() {
		
		System.out.println("Notebook type : Blank white on both sides");
		
	}

	@Override
	public void markDetailsOnNoteBook() {
		
		System.out.println("Notebook Details : Marked using a Nameslip on front");
		
	}

	@Override
	public void takeNotes() {
		
		System.out.println("Notebook notes : Taking notes in Lectures");
		
	}

}