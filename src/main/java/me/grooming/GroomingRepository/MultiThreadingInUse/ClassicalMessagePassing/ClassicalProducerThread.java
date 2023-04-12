package me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing;

import java.util.List;

public class ClassicalProducerThread implements Runnable {

	private String threadName;

	private List<Integer> sharedIntegerBuffer;

	public ClassicalProducerThread(String threadName, List<Integer> sharedIntegerBuffer) {

		this.threadName = threadName;
		this.sharedIntegerBuffer = sharedIntegerBuffer;

	}

	public String getThreadName() {

		return threadName;

	}

	@Override
	public void run() {

		try {

			int messageValue = 0;

			while (true) {

				synchronized (this) {

					while (sharedIntegerBuffer.size() == 1) {

						/*
						 * This tells the thread to go into the waiting state.
						 * 
						 */
						wait();

					}

					System.out.println("[ Producer Thread ] [ " + this.getThreadName() + " ] :: messageValue :::: "
							+ messageValue);

					sharedIntegerBuffer.add(messageValue);

					messageValue++;

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

			System.out.println("[ Producer Thread ] [ " + this.getThreadName() + " ] sleeping now. Do not disturb!!");
			e.printStackTrace();

		}

	}

}