package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.DecoratorImplementation;

public class StudyTable implements Table {

	@Override
	public String decorate() {
		
		String studyTableDescription = "Study Table :: \n"
				+ " Material : Teak Wood \n"
				+ " Drawers : 2 \n"
				+ " Compartments : 2 \n"
				+ " Colour : Light Grey \n";
		
		return studyTableDescription;
		
	}

}
