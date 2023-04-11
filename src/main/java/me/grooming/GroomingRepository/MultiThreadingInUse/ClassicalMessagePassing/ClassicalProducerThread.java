package me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing;

public class ClassicalProducerThread extends ClassicalActorThread {

	private String threadName;

	public ClassicalProducerThread(String threadName) {

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

			int messageValue = 0;

			while (true) {

				synchronized (this) {

					while (ClassicalActorThread.integerBuffer.size() >= 1) {
						
						/*
						 * This tells the thread to go into the waiting state.
						 * 
						 */
						wait();
						
					}

					System.out.println("[ Producer Thread ] [ " + this.getThreadName() + " ] :: messageValue :::: "
							+ messageValue);

					ClassicalActorThread.integerBuffer.add(messageValue);
					
					messageValue ++;

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