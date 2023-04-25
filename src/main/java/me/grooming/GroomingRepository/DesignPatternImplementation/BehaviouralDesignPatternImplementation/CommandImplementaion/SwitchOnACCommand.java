package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.CommandImplementaion;

public class SwitchOnACCommand extends DashboardCommand {

	public SwitchOnACCommand(CarDashboard carDashboard) {
		
		super(carDashboard);
		
	}

	@Override
	public void executeCommand() {
		
		this.carDashboard.switchOnAC();
		
	}
	
}