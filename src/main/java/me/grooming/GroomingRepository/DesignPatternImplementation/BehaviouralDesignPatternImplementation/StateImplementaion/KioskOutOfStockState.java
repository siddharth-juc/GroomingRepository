package me.grooming.GroomingRepository.DesignPatternImplementation.BehaviouralDesignPatternImplementation.StateImplementaion;

public class KioskOutOfStockState implements KioskState {

	@Override
	public void dispenseBeverage(SelfServiceKiosk selfServiceKiosk, String beverageName) {
		
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		System.out.println("Sorry!! Beverage : \n" + beverageName + "\n Out of Stock currently!!");
		System.out.println("Kindly reselect a beverage in stock!!");
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
		
	}

}