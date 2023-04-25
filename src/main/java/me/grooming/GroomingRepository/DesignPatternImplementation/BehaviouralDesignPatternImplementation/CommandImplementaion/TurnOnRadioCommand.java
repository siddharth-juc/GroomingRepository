package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.CommandImplementaion;

public class TurnOnRadioCommand extends DashboardCommand {
	
	public TurnOnRadioCommand(CarDashboard carDashboard) {
		
		super(carDashboard);
		
	}
	
	@Override
	public void executeCommand() {
		
		this.carDashboard.turnOnRadio();
		
	}

}