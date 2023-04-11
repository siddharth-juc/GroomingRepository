package me.grooming.GroomingRepository.MultiThreadingInUse.DeadLockCreation;

public class CollisionThread extends Thread {
	
	private Spectator friendSpectator01;
	private Spectator friendSpectator02;
	
	public CollisionThread(Spectator friendSpectator01, Spectator friendSpectator02) {
		
		this.friendSpectator01 = friendSpectator01;
		this.friendSpectator02 = friendSpectator02;
		
	}

	@Override
	public void run() {
		
		try {
			
			friendSpectator01.takeFirstSeat(friendSpectator02);
			
		} catch (InterruptedException e) {
			
			System.out.println("[ " + this.getName() + " ] Sleeping Right Now!! Don't disturb, please!!");
			e.printStackTrace();
			
		}
		
	}	

}