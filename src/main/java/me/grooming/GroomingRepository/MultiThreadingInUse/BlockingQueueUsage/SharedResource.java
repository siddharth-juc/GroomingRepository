package me.grooming.GroomingRepository.MultiThreadingInUse.BlockingQueueUsage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SharedResource {

	static BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(2);
	
}