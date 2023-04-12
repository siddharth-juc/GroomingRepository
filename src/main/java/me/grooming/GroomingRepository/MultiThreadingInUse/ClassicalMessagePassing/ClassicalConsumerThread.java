package me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing;

import java.util.List;

public class ClassicalConsumerThread implements Runnable {

	private String threadName;

	private List<Integer> sharedIntegerBuffer;

	public ClassicalConsumerThread(String threadName, List<Integer> sharedIntegerBuffer) {

		this.threadName = threadName;
		this.sharedIntegerBuffer = sharedIntegerBuffer;

	}

	public String getThreadName() {

		return threadName;

	}

	@Override
	public void run() {

		try {

			while (true) {

				synchronized (this) {

					while (sharedIntegerBuffer.size() == 0) {

						/*
						 * This tells the thread to go into the waiting state.
						 * 
						 */
						wait();

					}

					int messageValue = sharedIntegerBuffer.remove(0);

					System.out.println("[ Consumer Thread ] [ " + this.getThreadName() + " ] :: messageValue :::: "
							+ messageValue);

					/*
					 * This notifies all the threads that are waiting for this thread to finish its
					 * tasks so that they can use the common resources currently held by this
					 * thread. Once notifyAll() is called, the other threads are signalled that the
					 * lock has been released and the common resources are now free for use by other
					 * threads needing them.
					 * 
					 */
					notifyAll();

					Thread.sleep(250);

				}

			}

		} catch (InterruptedException e) {

			System.out.println("[ Consumer Thread ] [ " + this.getThreadName() + " ] sleeping now. Do not disturb!!");
			e.printStackTrace();

		}

	}

}