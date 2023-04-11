package me.grooming.GroomingRepository.MultiThreadingInUse.DeadLockCreation;

public class Spectator {

	synchronized public void takeFirstSeat(Spectator spectatorBuddy) throws InterruptedException {
		
		System.out.println("[ " + Thread.currentThread().getName() + " ] :: Rushing for First Seat!!");
		Thread.sleep(250);
		
		spectatorBuddy.takeSecondSeat(this);
		System.out.println("[ " + Thread.currentThread().getName() + " ] :: Second Seat Taken!!");
		
	}
	
	synchronized public void takeSecondSeat(Spectator spectatorBuddy) throws InterruptedException {
		
		System.out.println("[ " + Thread.currentThread().getName() + " ] :: Rushing for Second Seat!!");
		Thread.sleep(250);
		
		spectatorBuddy.takeFirstSeat(this);
		System.out.println("[ " + Thread.currentThread().getName() + " ] :: First Seat Taken!!");
		
	}
	
}