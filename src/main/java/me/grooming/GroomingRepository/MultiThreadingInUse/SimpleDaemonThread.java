package me.grooming.GroomingRepository.MultiThreadingInUse;

public class SimpleDaemonThread extends Thread {

	public SimpleDaemonThread(String threadName) {

		super(threadName);

		/*
		 * Using this function, we can set any Thread object as Daemon Thread.
		 * 
		 */
		this.setDaemon(true);

	}

	@Override
	public void run() {

		try {

			System.out.println("Running a Simple Thread with Name =====> " + this.getName());

			/*
			 * isDaemon() function, likewise can check whether the Thread object is Daemon
			 * thread or not.
			 * 
			 */
			System.out.println("Daemon Status 					  =====> " + this.isDaemon());

			for (int i = 0; i < 25; i++) {

				System.out.println("[ " + this.getName() + " ] Iteration =====> \t" + i);

				Thread.sleep(25);

			}

		} catch (InterruptedException e) {

			System.out.println("Do Not Disturb!! " + this.getName() + " Sleeping right now!!");

			e.printStackTrace();

		}

	}

}