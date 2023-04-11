package me.grooming.GroomingRepository.MultiThreadingInUse.ConcurrentSequenceTracing;

public class NumberTracingThread implements Runnable {

	private NaturalNumbersTracer naturalNumbersTracer;
	private int threadIndex;
	
	public NumberTracingThread(NaturalNumbersTracer naturalNumbersTracer, int threadIndex) {
		
		this.naturalNumbersTracer = naturalNumbersTracer;
		this.threadIndex = threadIndex;
		
	}
	
	@Override
	public void run() {
		
		naturalNumbersTracer.traceNaturalNumbers(threadIndex);
		
	}

}