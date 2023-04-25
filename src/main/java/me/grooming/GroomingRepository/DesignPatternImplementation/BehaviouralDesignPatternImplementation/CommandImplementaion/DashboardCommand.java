package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.CommandImplementaion;

public abstract class DashboardCommand {
	
	protected CarDashboard carDashboard;
	
	public DashboardCommand(CarDashboard carDashboard) {
		
		this.carDashboard = carDashboard;
		
	}
	
	public abstract void executeCommand();

}