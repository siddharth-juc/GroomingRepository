package me.grooming.GroomingRepository.GenericWorks;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * A simple implementation of a Generic List using Generics
 */

public class SimpleList<E> {

	private E[] listElements;

	public SimpleList(Class<E> clazz, int size) {

		@SuppressWarnings("unchecked")
		final E[] listElements = (E[]) (Array.newInstance(clazz, size));

		this.setListElements(listElements);

	}

	public E[] getListElements() {

		return listElements;

	}

	public void setListElements(E[] listElements) {

		this.listElements = listElements;

	}

	public boolean addElementToList(Class<E> clazz, E newElement) {

		@SuppressWarnings("unchecked")
		final E[] listElements = (E[]) (Array.newInstance(clazz, this.getListElements().length + 1));

		int index = 0;

		for (E elementPresent : this.listElements)
			listElements[index++] = elementPresent;

		listElements[index] = newElement;

		this.setListElements(listElements);

		return true;

	}

	public E getElementAtIndex(int index) {

		return listElements[index];

	}

	public boolean removeElementAtIndex(Class<E> clazz, int index) {

		@SuppressWarnings("unchecked")
		final E[] listElements = (E[]) (Array.newInstance(clazz, this.getListElements().length - 1));

		for (int i = 0; i < index; i++)
			listElements[i] = this.listElements[i];

		for (int i = index; i < listElements.length; i++)
			listElements[i] = this.listElements[i + 1];

		this.setListElements(listElements);

		return true;

	}

	public boolean addElementAtIndex(Class<E> clazz, E newElement, int index) {

		@SuppressWarnings("unchecked")
		final E[] listElements = (E[]) (Array.newInstance(clazz, this.getListElements().length + 1));

		for (int i = 0; i < index; i++)
			listElements[i] = this.listElements[i];

		listElements[index] = newElement;

		for (int i = index + 1; i < listElements.length; i++)
			listElements[i] = this.listElements[i - 1];

		this.setListElements(listElements);

		return true;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(listElements);
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if ((obj == null) || (getClass() != obj.getClass()))
			return false;

		SimpleList<?> other = (SimpleList<?>) obj;
		return Arrays.deepEquals(listElements, other.listElements);

	}

}
