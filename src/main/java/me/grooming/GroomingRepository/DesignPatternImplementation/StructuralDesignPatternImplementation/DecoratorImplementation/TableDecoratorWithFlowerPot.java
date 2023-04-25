package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.DecoratorImplementation;

public class TableDecoratorWithFlowerPot extends TableDecorator {
	
	public TableDecoratorWithFlowerPot(Table roomTable) {
		
		super(roomTable);
		
	}
	
	@Override
	public String decorate() {
		
		String roomTableDescription =  super.decorate() 
				+ " Flower Pot : Lily \n";
		
		return roomTableDescription;
		
		
	}

}