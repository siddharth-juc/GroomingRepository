package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.InterfaceSegregationWorks;

/*
 * Interface Segregation means that instead of a single interface having multiple methods, better have multiple 
 * Functional Interfaces so as to allow a class/interface to implement/extend methods as desired. 
 * 
 * Now, for Binge Watching Session, multiple interfaces ensure that Binge Watching can be tailored to each of 
 * the Binge Watcher's unique tastes as per his/her preferences!!
 */

public interface BingeWatchingSessionOnASummerNight extends BingeWatchingSessionRoomLight,
		BingeWatchingSessionEnvironment, BingeWatchingSessionDrinks, BingeWatchingSessionStreamingDevice {

}