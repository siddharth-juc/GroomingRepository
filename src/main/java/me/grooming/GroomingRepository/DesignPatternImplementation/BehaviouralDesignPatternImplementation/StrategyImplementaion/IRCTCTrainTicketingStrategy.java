package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.StrategyImplementaion;

public class IRCTCTrainTicketingStrategy implements TrainTicketingStrategy {

	@Override
	public void bookTrainTicket() {
		
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		System.out.println("Navigating to IRCTC Site!!");
		System.out.println("Kindly wait while we deduct the amount from your IRCTC Card!!");
		System.out.println("Amount deducted!! Kindly collect the Train ticket!!");
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		

	}

}
