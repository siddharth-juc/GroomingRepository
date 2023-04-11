package me.grooming.GroomingRepository.MultiThreadingInUse;

import java.time.LocalDateTime;

import java.util.LinkedList;
import java.util.List;

public class SynchronizedDiaryWritingThread implements Runnable {

	private String threadName;

	public String getThreadName() {

		return threadName;

	}

	public void setThreadName(String threadName) {

		this.threadName = threadName;

	}

	public SynchronizedDiaryWritingThread(String threadName) {

		super();
		this.setThreadName(threadName);

	}

	private static List<String> bookMarks = new LinkedList<>();

	public static List<String> getBookMarks() {

		return bookMarks;

	}
	
	public static void printVisibleBookMarks() {
		
		for(String bookMark : SynchronizedDiaryWritingThread.getBookMarks())
			System.out.println(bookMark);
		
	}

	public void addNewBookMark(String newBookMark) {

		/*
		 * This is a Class-level Lock, i.e., at a given instant, only a single
		 * instance/object can access this functionality of block through a thread,
		 * other threads will have to wait until this lock is released.
		 * 
		 */
		synchronized (SynchronizedDiaryWritingThread.class) {

			bookMarks.add(0, newBookMark);

		}

	}

	@Override
	public void run() {

		LocalDateTime bookMarkInstant = LocalDateTime.now();

		String threadBookMark = "[ " + this.getThreadName() + " ] : BookMark :::: TimeStamp : " + bookMarkInstant;

		this.addNewBookMark(threadBookMark);

	}

}