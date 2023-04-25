package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.DecoratorImplementation;

public class TableDecoratorWithAlarmClock extends TableDecorator {
	
	public TableDecoratorWithAlarmClock(Table roomTable) {
		
		super(roomTable);
		
	}

	@Override
	public String decorate() {
		
		String roomTableDescription =  super.decorate() 
				+ " Alarm Clock : Digital \n";
		
		return roomTableDescription;
		
		
	}

}