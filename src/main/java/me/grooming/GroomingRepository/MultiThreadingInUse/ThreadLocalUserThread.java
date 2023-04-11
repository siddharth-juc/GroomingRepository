package me.grooming.GroomingRepository.MultiThreadingInUse;

public class ThreadLocalUserThread extends Thread {

	/*
	 * ThreadLocal variables can be read & written by Threads only, hencethey can be
	 * operated upon only through run() method, only by a single thread, while
	 * visible to no other Thread.
	 * 
	 */
	private ThreadLocal<String> threadSecret;
	private final String secret;

	public ThreadLocalUserThread(String threadSecret) {

		this.threadSecret = new ThreadLocal<>();
		secret = threadSecret;

	}

	@Override
	public void run() {

		this.threadSecret.set(secret);
		System.out.println("Thread [ " + this.getName() + " ] :::: Thread Secret :: " + this.threadSecret.get());

	}

}