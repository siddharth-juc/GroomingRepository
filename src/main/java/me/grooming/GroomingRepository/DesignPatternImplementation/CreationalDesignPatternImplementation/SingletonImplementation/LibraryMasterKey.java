package me.grooming.GroomingRepository.DesignPatternImplementation.CreationalDesignPatternImplementation.SingletonImplementation;

import java.io.Serializable;

public class LibraryMasterKey implements Serializable, Cloneable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private static volatile LibraryMasterKey theOnlyMasterKey;

	private LibraryMasterKey() {

	}

	public static LibraryMasterKey getLibraryMasterKey() {

		if (theOnlyMasterKey == null) {

			synchronized (LibraryMasterKey.class) {

				if (theOnlyMasterKey == null)

					theOnlyMasterKey = new LibraryMasterKey();

			}

		}

		return theOnlyMasterKey;

	}

	protected Object readResolve() {

		return theOnlyMasterKey;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return theOnlyMasterKey;

	}

}