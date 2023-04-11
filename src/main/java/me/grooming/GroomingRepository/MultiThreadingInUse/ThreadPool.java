package me.grooming.GroomingRepository.MultiThreadingInUse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {

	private static final int MAX_CAPACITY = 4;

	public static void completeTimeKeepingTasksThroughFixedThreadPool()
			throws InterruptedException, ExecutionException {

		Callable<String> firstTimeKeeper = new TimeKeepingTask("Line 1B");
		Callable<String> secondTimeKeeper = new TimeKeepingTask("Line 2F");
		Callable<String> thirdTimeKeeper = new TimeKeepingTask("Line 3X");
		Callable<String> fourthTimeKeeper = new TimeKeepingTask("Line 4G");
		Callable<String> fifthTimeKeeper = new TimeKeepingTask("Line 5M");
		Callable<String> sixthTimeKeeper = new TimeKeepingTask("Line 6T");
		Callable<String> seventhTimeKeeper = new TimeKeepingTask("Line 7Z");

		/*
		 * This is what creates a Fixed Thread Pool, i.e., a Thread Pool containing a
		 * constant (fixed) number of threads. If the tasks to be executed are more than
		 * the Thread Pool can handle concurrently, then rest of the tasks are kept in
		 * the Waiting Queue.
		 * 
		 */
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(MAX_CAPACITY);

		List<Future<String>> timeKeepingDiary = new ArrayList<>();

		List<Callable<String>> timeKeepingTasks = new ArrayList<>();

		timeKeepingTasks.add(firstTimeKeeper);
		timeKeepingTasks.add(secondTimeKeeper);
		timeKeepingTasks.add(thirdTimeKeeper);
		timeKeepingTasks.add(fourthTimeKeeper);
		timeKeepingTasks.add(fifthTimeKeeper);
		timeKeepingTasks.add(sixthTimeKeeper);
		timeKeepingTasks.add(seventhTimeKeeper);

		for (Callable<String> eachTimeKeepingTask : timeKeepingTasks) {

			Future<String> timeKeep = fixedThreadPool.submit(eachTimeKeepingTask);
			timeKeepingDiary.add(timeKeep);

		}

		for (Future<String> timeKeepingDiaryEntry : timeKeepingDiary) {

			System.out.println(timeKeepingDiaryEntry.get());

		}

		/*
		 * Once all tasks are completed, it is necessary to shut down the Thread Pool or
		 * else it won't know when to stop.
		 * 
		 */
		fixedThreadPool.shutdown();

	}

	public static void completeTimeKeepingTasksThroughCachedThreadPool()
			throws InterruptedException, ExecutionException {

		Callable<String> firstTimeKeeper = new TimeKeepingTask("Line 1B");
		Callable<String> secondTimeKeeper = new TimeKeepingTask("Line 2F");
		Callable<String> thirdTimeKeeper = new TimeKeepingTask("Line 3X");
		Callable<String> fourthTimeKeeper = new TimeKeepingTask("Line 4G");
		Callable<String> fifthTimeKeeper = new TimeKeepingTask("Line 5M");
		Callable<String> sixthTimeKeeper = new TimeKeepingTask("Line 6T");
		Callable<String> seventhTimeKeeper = new TimeKeepingTask("Line 7Z");

		/*
		 * This is what creates a Cached Thread Pool, i.e., Thread Pool starting new
		 * Threads if all other Threads are engaged, otherwise reusing the already
		 * created Threads that are free. Also, it frees up Threads which are idle for a
		 * prolonged time duration.
		 * 
		 */
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

		List<Future<String>> timeKeepingDiary = new ArrayList<>();

		List<Callable<String>> timeKeepingTasks = new ArrayList<>();

		timeKeepingTasks.add(firstTimeKeeper);
		timeKeepingTasks.add(secondTimeKeeper);
		timeKeepingTasks.add(thirdTimeKeeper);
		timeKeepingTasks.add(fourthTimeKeeper);
		timeKeepingTasks.add(fifthTimeKeeper);
		timeKeepingTasks.add(sixthTimeKeeper);
		timeKeepingTasks.add(seventhTimeKeeper);

		for (Callable<String> eachTimeKeepingTask : timeKeepingTasks) {

			Future<String> timeKeep = cachedThreadPool.submit(eachTimeKeepingTask);
			timeKeepingDiary.add(timeKeep);

		}

		for (Future<String> timeKeepingDiaryEntry : timeKeepingDiary) {

			System.out.println(timeKeepingDiaryEntry.get());

		}

		/*
		 * Once all tasks are completed, it is necessary to shut down the Thread Pool or
		 * else it won't know when to stop.
		 * 
		 */
		cachedThreadPool.shutdown();

	}

}