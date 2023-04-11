package me.grooming.GroomingRepository.MultiThreadingInUse.DeadLockCreation;

public class OtherCollisionThread extends Thread {
	
	private Spectator friendSpectator01;
	private Spectator friendSpectator02;
	
	public OtherCollisionThread(Spectator friendSpectator01, Spectator friendSpectator02) {
		
		this.friendSpectator01 = friendSpectator01;
		this.friendSpectator02 = friendSpectator02;
		
	}

	@Override
	public void run() {
		
		try {
			
			friendSpectator02.takeSecondSeat(friendSpectator01);
			
		} catch (InterruptedException e) {
			
			System.out.println("[ " + this.getName() + " ] Sleeping Right Now!! Don't disturb, please!!");
			e.printStackTrace();
			
		}
		
	}

}