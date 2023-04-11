package me.grooming.GroomingRepository.MultiThreadingInUse.CyclicBarrierUsage;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class HikingSquadMountaineer implements Runnable {

	private String mountaineerID;
	private int duration;
	private CyclicBarrier cyclicBarrier;

	public HikingSquadMountaineer(String mountaineerID, int duration, CyclicBarrier cyclicBarrier) {

		super();
		this.mountaineerID = mountaineerID;
		this.duration = duration;
		this.cyclicBarrier = cyclicBarrier;

	}

	@Override
	public void run() {

		try {
			
			Thread.sleep(duration);

			System.out.println("Mountaineer :: [ " + this.mountaineerID + " ] :::: Reached CheckPost!!");

			cyclicBarrier.await();
			
		} catch (InterruptedException | BrokenBarrierException e) {
			
			System.out.println("Waiting for updates from Mountaineer :: [ " + this.mountaineerID + " ] :::: /");
			e.printStackTrace();
			
		}

	}

}