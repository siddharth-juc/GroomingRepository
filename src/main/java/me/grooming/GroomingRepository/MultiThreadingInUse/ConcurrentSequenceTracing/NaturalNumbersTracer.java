package me.grooming.GroomingRepository.MultiThreadingInUse.ConcurrentSequenceTracing;

public class NaturalNumbersTracer {

	private int currentNumber;
	private int numberOfThreads;
	private int traceLimit;

	public NaturalNumbersTracer(int numberOfThreads, int traceLimit) {

		this.currentNumber = 1;
		this.numberOfThreads = numberOfThreads;
		this.traceLimit = traceLimit;

	}

	public void traceNaturalNumbers(int threadIndex) {

		synchronized (this) {

			while (currentNumber < traceLimit - 1) {

				while (currentNumber % numberOfThreads != threadIndex) {

					try {

						wait();

					} catch (InterruptedException e) {

						System.out.println(
								"[ " + Thread.currentThread().getName() + " ] sleeping now. Kindly don't disturb!!");
						e.printStackTrace();

					}

				}

				System.out.println(
						"[ " + Thread.currentThread().getName() + " ] :::: Natural Number :: \t" + currentNumber);

				currentNumber++;

				notifyAll();

			}

		}

	}

}