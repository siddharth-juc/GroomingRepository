package me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing;

public class ClassicalConsumerThread extends ClassicalActorThread {

	private String threadName;

	public ClassicalConsumerThread(String threadName) {

		this.setThreadName(threadName);

	}

	public String getThreadName() {

		return threadName;

	}

	public void setThreadName(String threadName) {

		this.threadName = threadName;

	}

	@Override
	public void run() {

		try {

			while (true) {

				synchronized (this) {

					while (ClassicalActorThread.integerBuffer.size() == 0) {

						/*
						 * This tells the thread to go into the waiting state.
						 * 
						 */
						wait();

					}

					int messageValue = ClassicalActorThread.integerBuffer.removeFirst();

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