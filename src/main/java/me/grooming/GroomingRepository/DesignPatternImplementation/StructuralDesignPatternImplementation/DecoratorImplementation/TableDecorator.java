package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.DecoratorImplementation;

public abstract class TableDecorator implements Table {

	private Table roomTable;
	
	public TableDecorator(Table roomTable) {
		
		this.roomTable = roomTable;
		
	}

	@Override
	public String decorate() {
		
		return roomTable.decorate();
		
	}

}
