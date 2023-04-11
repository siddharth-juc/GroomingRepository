package me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing;

import java.util.LinkedList;

public abstract class ClassicalActorThread implements Runnable {

	public static LinkedList<Integer> integerBuffer = new LinkedList<>();
	private static int capacity;

	public static int getCapacity() {
		
		return capacity;
		
	}

	public static void setCapacity(int capacity) {
		
		ClassicalActorThread.capacity = capacity;
		
	}

}