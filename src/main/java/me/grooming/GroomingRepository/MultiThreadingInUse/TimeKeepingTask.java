package me.grooming.GroomingRepository.MultiThreadingInUse;

import java.time.LocalTime;

import java.util.concurrent.Callable;

public class TimeKeepingTask implements Callable<String> {

	private String taskName;

	public String getTaskName() {

		return taskName;

	}

	private void setTaskName(String taskName) {

		this.taskName = taskName;

	}

	public TimeKeepingTask(String taskName) {

		super();
		this.setTaskName(taskName);

	}

	@Override
	public String call() {

		try {

			LocalTime timeKeepingTime = LocalTime.now();

			String timeKeep = "Time Keeping : [ " + this.getTaskName() + " ] :::: " + timeKeepingTime;

			Thread.sleep(250);

			System.out.println("Time Keeping : [ " + this.getTaskName() + " ] :::: Good Night!!");
			
			return timeKeep;

		} catch (InterruptedException e) {

			String doNotDisturbMessage = "Do Not Disturb!! " + this.getTaskName() + " Sleeping right now!!";
			
			System.out.println(doNotDisturbMessage);

			e.printStackTrace();
			
			return doNotDisturbMessage;

		}

	}

}