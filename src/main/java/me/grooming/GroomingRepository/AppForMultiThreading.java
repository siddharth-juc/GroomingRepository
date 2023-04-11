package me.grooming.GroomingRepository;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

import me.grooming.GroomingRepository.MultiThreadingInUse.SimpleDaemonThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.SimpleThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.SynchronizedDiaryWritingThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.ThreadLocalUserThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.ThreadPool;
import me.grooming.GroomingRepository.MultiThreadingInUse.BlockingQueueUsage.BlockingQueueModifierThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing.ClassicalActorThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing.ClassicalConsumerThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.ClassicalMessagePassing.ClassicalProducerThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.ConcurrentSequenceTracing.NaturalNumbersTracer;
import me.grooming.GroomingRepository.MultiThreadingInUse.ConcurrentSequenceTracing.NumberTracingThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.CyclicBarrierUsage.HikeAfterCheckPost;
import me.grooming.GroomingRepository.MultiThreadingInUse.CyclicBarrierUsage.HikingSquadMountaineer;
import me.grooming.GroomingRepository.MultiThreadingInUse.DeadLockCreation.CollisionThread;
import me.grooming.GroomingRepository.MultiThreadingInUse.DeadLockCreation.Spectator;
import me.grooming.GroomingRepository.MultiThreadingInUse.SemaphoresAsLocks.ClubDesignations;
import me.grooming.GroomingRepository.MultiThreadingInUse.SemaphoresAsLocks.ClubMemberThread;

public class AppForMultiThreading {

	public static void main(String args[]) throws InterruptedException {

		/*
		 * First, we will get the reference to main thread.
		 * 
		 */
		Thread mainThread = Thread.currentThread();

		mainThread.setName("Line Main");

		/*
		 * Then, we will create our own SimpleThreads.
		 * 
		 */
		SimpleThread firstSimpleThread = new SimpleThread();

		firstSimpleThread.setName("Line 1B");

		SimpleThread secondSimpleThread = new SimpleThread();

		secondSimpleThread.setName("Line 2F");

		/*
		 * Now let's create another thread, through our SimpleDaemonThread class, to
		 * show our working of Daemon Thread.
		 * 
		 */
		SimpleDaemonThread firstSimpleDaemonThread = new SimpleDaemonThread("Line 13A");

		mainThread.setPriority(10);

		/*
		 * Now let's set the priorities of our threads.
		 * 
		 */
		firstSimpleThread.setPriority(4);
		secondSimpleThread.setPriority(5);

		/*
		 * Let's begin execution of threads defined by us.
		 * 
		 */
		firstSimpleDaemonThread.start();

		/*
		 * One can also interrupt a Thread using interrupt() method. For a
		 * sleeping/waiting Thread, it throws InterruptedException, while for a Thread
		 * running normally, it just sets the interrupted boolean state to true, for
		 * future reference. To check how it works, uncomment the code lines below.
		 * 
		 */
		/*
		 * firstSimpleDaemonThread.interrupt();
		 */

		/*
		 * join() means that other Thread should wait until the given Thread has
		 * finished its task.
		 * 
		 */
		firstSimpleDaemonThread.join();

		secondSimpleThread.start();
		secondSimpleThread.join();

		firstSimpleThread.start();
		firstSimpleThread.join();
		
		/*
		 * Also see the use of ThreadLocal through our Thread defined with it. 
		 * 
		 */
		ThreadLocalUserThread threadLocalUserThread = new ThreadLocalUserThread("327X2723987YSJ0091");
		
		threadLocalUserThread.setName("Line TL24");
		
		threadLocalUserThread.start();
		threadLocalUserThread.join();

		/*
		 * As expected, the main thread executes after both Simple Threads are done with
		 * their tasks.
		 */

		System.out.println("[ " + mainThread.getName() + " ] Wide Awake!!");

		/*
		 * Now let's interrupt both threads and then see what happens. To interrupt,
		 * kindly uncomment the code lines given below as needed.
		 * 
		 */

		/*
		 * firstSimpleThread.interrupt(); secondSimpleThread.interrupt();
		 */

		/*
		 * Let's also try out our Thread Pool executions for time-keeping.
		 * 
		 */
		try {

			ThreadPool.completeTimeKeepingTasksThroughFixedThreadPool();

		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();

		}

		try {

			ThreadPool.completeTimeKeepingTasksThroughCachedThreadPool();

		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();

		}

		/*
		 * Now putting Synchronization to the test by using our Synchronized Diary
		 * Writing Thread.
		 * 
		 */
		Thread firstDiaryWritingThread = new Thread(new SynchronizedDiaryWritingThread("Line XR"));
		Thread secondDiaryWritingThread = new Thread(new SynchronizedDiaryWritingThread("Line XT"));

		firstDiaryWritingThread.start();
		secondDiaryWritingThread.start();

		firstDiaryWritingThread.join();
		secondDiaryWritingThread.join();

		SynchronizedDiaryWritingThread.printVisibleBookMarks();

		/*
		 * Let's also watch a Classical Producer Consumer Scenario using threads.
		 * 
		 */

		ClassicalActorThread.setCapacity(5);

		Thread classicalProducerThread = new Thread(new ClassicalProducerThread("Line UP01"));
		Thread classicalConsumerThread = new Thread(new ClassicalConsumerThread("Line DN01"));

		classicalProducerThread.setName("Line UP01");
		classicalConsumerThread.setName("Line DN01");

		/*
		 * classicalProducerThread.start(); classicalConsumerThread.start();
		 * 
		 * classicalProducerThread.join(); classicalConsumerThread.join();
		 */

		/*
		 * Let's try to print a Natural Number Sequence using 3 threads
		 * 
		 */
		NaturalNumbersTracer naturalNumbersTracer = new NaturalNumbersTracer(3, 10);

		Thread firstTracingThread = new Thread(new NumberTracingThread(naturalNumbersTracer, 1));
		Thread secondTracingThread = new Thread(new NumberTracingThread(naturalNumbersTracer, 2));
		Thread thirdTracingThread = new Thread(new NumberTracingThread(naturalNumbersTracer, 0));

		firstTracingThread.setName("Line NNT1");
		secondTracingThread.setName("Line NNT2");
		thirdTracingThread.setName("Line NNT3");

		/*
		 * firstTracingThread.start(); secondTracingThread.start();
		 * thirdTracingThread.start();
		 */

		/*
		 * Let's check the Thread Collision. However, better leave the last part of code
		 * commented, unless one REALLY wants to see thread collision due to deadlock of
		 * common resources!!
		 * 
		 */

		Spectator firstSpectator = new Spectator();
		Spectator friendOfFirstSpectator = new Spectator();

		Spectator secondSpectator = new Spectator();
		Spectator friendOfSecondSpectator = new Spectator();

		CollisionThread firstCollisionThread = new CollisionThread(firstSpectator, friendOfFirstSpectator);
		CollisionThread secondCollisionThread = new CollisionThread(secondSpectator, friendOfSecondSpectator);

		firstCollisionThread.setName("Line BX");
		secondCollisionThread.setName("Line CY");

		/*
		 * firstCollisionThread.start(); secondCollisionThread.start();
		 */

		/*
		 * Let's explore the usage of Cyclic Barrier.
		 * 
		 */
		CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new HikeAfterCheckPost());

		Thread firstMountaineer = new Thread(new HikingSquadMountaineer("1B", 2500, cyclicBarrier));
		Thread secondMountaineer = new Thread(new HikingSquadMountaineer("2F", 2400, cyclicBarrier));
		Thread thirdMountaineer = new Thread(new HikingSquadMountaineer("3Y", 2600, cyclicBarrier));
		Thread fourthMountaineer = new Thread(new HikingSquadMountaineer("4G", 2300, cyclicBarrier));
		Thread fifthMountaineer = new Thread(new HikingSquadMountaineer("5X", 2700, cyclicBarrier));

		firstMountaineer.setName("Line 1B");
		secondMountaineer.setName("Line 2F");
		thirdMountaineer.setName("Line 3Y");
		fourthMountaineer.setName("Line 4G");
		fifthMountaineer.setName("Line 5X");

		/*
		 * firstMountaineer.start(); secondMountaineer.start();
		 * thirdMountaineer.start(); fourthMountaineer.start();
		 * fifthMountaineer.start();
		 */

		/*
		 * Let's see the Semaphores' usage as Locks.
		 * 
		 */
		Semaphore semaphoreLock = new Semaphore(1);

		ClubMemberThread firstClubDesignateThread = new ClubMemberThread("1B", ClubDesignations.ENTHUSIAST,
				semaphoreLock);
		ClubMemberThread secondClubDesignateThread = new ClubMemberThread("2F", ClubDesignations.MEMBER, semaphoreLock);

		firstClubDesignateThread.setName("Line 1B");
		secondClubDesignateThread.setName("Line 2F");

		/*
		 * firstClubDesignateThread.start(); secondClubDesignateThread.start();
		 * 
		 * firstClubDesignateThread.join(); secondClubDesignateThread.join();
		 */
		
		/*
		 * Let's also see implementation of Blocking Queue.
		 * 
		 */
		BlockingQueueModifierThread firstModifierThread = new BlockingQueueModifierThread(true);
		BlockingQueueModifierThread secondModifierThread = new BlockingQueueModifierThread(false);
		
		firstModifierThread.setName("Line QT1");
		secondModifierThread.setName("Line QT2");
		
		/*
		 * firstModifierThread.start(); firstModifierThread.join();
		 * 
		 * secondModifierThread.start(); secondModifierThread.join();
		 */

	}

}