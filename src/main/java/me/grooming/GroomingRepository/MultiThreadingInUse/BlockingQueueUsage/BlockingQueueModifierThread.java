package me.grooming.GroomingRepository.MultiThreadingInUse.BlockingQueueUsage;

public class BlockingQueueModifierThread extends Thread {

	private boolean isFiller;

	public BlockingQueueModifierThread(boolean isFiller) {

		this.isFiller = isFiller;

	}

	@Override
	public void run() {

		if (this.isFiller) {

			synchronized (this) {

				try {

					SharedResource.blockingQueue.put(this.getName());

					System.out.println("Filler Thread [ " + this.getName() + " ] :: Updated Blocking Queue");

					for (String queueString : SharedResource.blockingQueue) {

						System.out.println("[ " + queueString + " ] :: OK");

						Thread.sleep(250);

					}

				} catch (InterruptedException e) {

					System.out.println("Thread [ " + this.getName() + " ] :: Sleeping right now!! Don't disturb!!");
					e.printStackTrace();

				}

			}

		}

		else {

			synchronized (this) {

				SharedResource.blockingQueue.remove();

				System.out.println("Emptier Thread [ " + this.getName() + " ] :: Updated Blocking Queue");

				for (String queueString : SharedResource.blockingQueue) {

					System.out.println("[ " + queueString + " ] :: OK");
					try {

						Thread.sleep(250);

					} catch (InterruptedException e) {

						System.out.println("Thread [ " + this.getName() + " ] :: Sleeping right now!! Don't disturb!!");
						e.printStackTrace();

					}

				}

			}

		}

	}

}