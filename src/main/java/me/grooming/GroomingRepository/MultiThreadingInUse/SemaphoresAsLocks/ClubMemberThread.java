package me.grooming.GroomingRepository.MultiThreadingInUse.SemaphoresAsLocks;

import java.util.concurrent.Semaphore;

public class ClubMemberThread extends Thread {

	private String clubID;
	private ClubDesignations clubDesignation;
	private Semaphore semaphoreLock;

	public ClubMemberThread(String clubID, ClubDesignations clubDesignation, Semaphore semaphoreLock) {

		this.clubID = clubID;
		this.clubDesignation = clubDesignation;
		this.semaphoreLock = semaphoreLock;

	}

	public String getClubID() {

		return this.clubID;

	}

	public ClubDesignations getClubDesignation() {

		return this.clubDesignation;

	}

	@Override
	public void run() {

		if (this.getClubDesignation() == ClubDesignations.MEMBER) {


			try {
				
				semaphoreLock.acquire();
				
				System.out.println("MEMBER :: [ " + this.getClubID() + " ] ");

				System.out.println("Entering Club Inventory . . . . . ");

				ClubInventory.clubInventory.addFirst("New Desks");
				ClubInventory.clubInventory.addFirst("New Books");
				ClubInventory.clubInventory.addFirst("Stationary");
				ClubInventory.clubInventory.addFirst("WiFi Router");

				Thread.sleep(250);

				System.out.println("Updated Club Inventory . . . .");

				for (String inventoryItems : ClubInventory.clubInventory)
					System.out.println(inventoryItems);

				System.out.println("Club Inventory Secured . . . . . ");

				semaphoreLock.release();

			} catch (InterruptedException e) {

				System.out.println("Thread [ " + this.getName() + " ] :: Sleeping right now!! Don't disturb!!");

			}

		}

		else if (this.getClubDesignation() == ClubDesignations.ENTHUSIAST) {

			try {
				
				semaphoreLock.acquire();
				
				System.out.println("ENTHUSIAST :: [ " + this.getClubID() + " ] ");

				System.out.println("Entering Club Inventory . . . . . ");

				ClubInventory.clubInventory.addFirst("Beverages");
				ClubInventory.clubInventory.addLast("Bean Bags");

				Thread.sleep(250);

				System.out.println("Updated Club Inventory . . . .");

				for (String inventoryItems : ClubInventory.clubInventory)
					System.out.println(inventoryItems);

				System.out.println("Club Inventory Secured . . . . . ");

				semaphoreLock.release();

			} catch (InterruptedException e) {

				System.out.println("Thread [ " + this.getName() + " ] :: Sleeping right now!! Don't disturb!!");
				e.printStackTrace();

			}

		}

	}

}