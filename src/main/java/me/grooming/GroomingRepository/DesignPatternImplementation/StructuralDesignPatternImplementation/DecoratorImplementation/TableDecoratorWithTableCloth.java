package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.DecoratorImplementation;

public class TableDecoratorWithTableCloth extends TableDecorator {

	public TableDecoratorWithTableCloth(Table roomTable) {
		
		super(roomTable);
		
	}

	@Override
	public String decorate() {
		
		String roomTableDescription =  super.decorate() 
				+ " Table Cloth : Deep Blue \n";
		
		return roomTableDescription;
		
	}
	
}