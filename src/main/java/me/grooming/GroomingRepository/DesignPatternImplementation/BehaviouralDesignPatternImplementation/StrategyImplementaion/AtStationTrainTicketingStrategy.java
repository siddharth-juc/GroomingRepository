package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.StrategyImplementaion;

public class AtStationTrainTicketingStrategy implements TrainTicketingStrategy {

	@Override
	public void bookTrainTicket() {
		
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		System.out.println("Contacting the nearest Railway Station to book Train Ticket!!");
		System.out.println("Filling the Reservation Form!!");
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		
	}

}