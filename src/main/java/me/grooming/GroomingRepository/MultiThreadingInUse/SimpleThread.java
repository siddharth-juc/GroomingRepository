package me.grooming.GroomingRepository.MultiThreadingInUse;

public class SimpleThread extends Thread {

	@Override
	public void run() {
		
		try {
			
			System.out.println("Running a Simple Thread with Name =====> " + this.getName());
			System.out.println("Daemon Status                     =====> " + this.isDaemon());
			
			for(int i = 0; i < 25; i++) {
				
				System.out.println("[ " + this.getName() + " ] Iteration =====> \t" + i);
				
				Thread.sleep(25);
				
			}
			
		} catch (InterruptedException e) {
			
			System.out.println("Do Not Disturb!! " + this.getName() + " Sleeping right now!!");
			
			e.printStackTrace();
			
		}
		
	}

}