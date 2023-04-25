package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.StateImplementaion;

public class KioskInStockState implements KioskState {
	
	@Override
	public void dispenseBeverage(SelfServiceKiosk selfServiceKiosk, String beverageName) {
		
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		System.out.println("Dispensing Beverage : \n" + beverageName);
		System.out.println("Kindly wait while we deduct the amount from your Kiosk Card!!");
		System.out.println("Amount deducted!! Kindly collect the bill!!");
		System.out.println("Kindly collect your chilled " + beverageName + " from the dispenser of Kiosk : " + selfServiceKiosk.getKioskID() + " !!");
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		
	}

}